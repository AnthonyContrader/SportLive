package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Player;


public class PlayerDAO implements DAO<Player> {

	private final String QUERY_ALL = "SELECT * FROM players";
	private final String QUERY_CREATE = "INSERT INTO players (idcoach, playertype, password, nickname, age, height, weight, gp, score) VALUES (?,?,?,?,?,?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM players WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE players SET  idcoach=?, playertype=?, password=?, nickname=? , age=?, height=?, weight=?, gp=?, score=? WHERE id=?";
	private final String QUERY_UPDATE_PARAMETERS = "UPDATE players SET age=?, height=?, weight=?, gp=?, score=?";
	private final String QUERY_DELETE = "DELETE FROM players WHERE id=?";
	private final String QUERY_ORDER = "";

	public List<Player> getAll() {

		List<Player> playerList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Player player;
			while (resultSet.next()) {
				int id = resultSet.getInt("id"); 						// identificazione univoca del player nella tabella
				int idcoach = resultSet.getInt("idcoach"); 				// id di identificazione del coach a cui appartiene
				String playertype = resultSet.getString("playertype"); 	// attaccante, centr, dif, portiere
				String password = resultSet.getString("password"); 		// password
				String nickname = resultSet.getString("nickname"); 		// ...
				int age = resultSet.getInt("age");
				int height = resultSet.getInt("height");
				double weight = resultSet.getDouble("weight");
				int gp = resultSet.getInt("gp");
				int score = resultSet.getInt("score");

				player = new Player(idcoach, playertype, password, nickname, age, height, weight, gp, score);
				player.setId(id);
				playerList.add(player);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}

	public boolean update(Player playerToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		if (playerToUpdate.getId() == 0) {
			return false;
		}

		Player playerRead = read(playerToUpdate.getId());
		if (!playerRead.equals(playerToUpdate)) {
			try {
				if (playerToUpdate.getPassword() == null || playerToUpdate.getPassword().equals("")) {
					playerToUpdate.setPassword(playerToUpdate.getPassword());
				}
				if (playerToUpdate.getPlayertype() == null || playerToUpdate.getPlayertype().equals("")) {
					playerToUpdate.setPlayertype(playerToUpdate.getPlayertype());
				}
				if (playerToUpdate.getNickname() == null || playerToUpdate.getNickname().equals("")) {
					playerToUpdate.setNickname(playerToUpdate.getNickname());
				}
				if (playerToUpdate.getAge() == 0 || playerToUpdate.getAge() == 0) {
					playerToUpdate.setAge(playerToUpdate.getAge());
				}
				if (playerToUpdate.getHeight() == 0 || playerToUpdate.getHeight() == 0) {
					playerToUpdate.setHeight(playerToUpdate.getHeight());
				}
				if (playerToUpdate.getWeight() == 0 || playerToUpdate.getWeight() == 0) {
					playerToUpdate.setWeight(playerToUpdate.getWeight());
				}				
				if (playerToUpdate.getGp() == 0 || playerToUpdate.getGp() == 0) {
					playerToUpdate.setGp(playerToUpdate.getGp());
				}
				if (playerToUpdate.getScore() == 0 || playerToUpdate.getScore() == 0) {
					playerToUpdate.setScore(playerToUpdate.getScore());
				}
				
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);

				preparedStatement.setInt(1, playerToUpdate.getIdcoach());
				preparedStatement.setString(2, playerToUpdate.getPlayertype());
				preparedStatement.setString(3, playerToUpdate.getPassword());
				preparedStatement.setString(4, playerToUpdate.getNickname());
				preparedStatement.setInt(5, playerToUpdate.getAge());
				preparedStatement.setInt(6, playerToUpdate.getHeight());
				preparedStatement.setDouble(7, playerToUpdate.getWeight());
				preparedStatement.setInt(8, playerToUpdate.getGp());
				preparedStatement.setInt(9, playerToUpdate.getScore());
				
				preparedStatement.setInt(10, playerToUpdate.getId());

			
				int a = preparedStatement.executeUpdate();

				if (a > 0)
					return true;
				else
				
					return false;

			} catch (SQLException e) {
				return false;
			}
		}

		return false;
	}
	
	public boolean updateParameters(Player playerToUpdateParameters) {
		Connection connection = ConnectionSingleton.getInstance();

		if (playerToUpdateParameters.getId() == 0) {
			return false;
		}

		Player playerRead = read(playerToUpdateParameters.getId());
		if (!playerRead.equals(playerToUpdateParameters)) {
			try {
				if (playerToUpdateParameters.getAge() == 0 || playerToUpdateParameters.getAge() == 0) {
					playerToUpdateParameters.setAge(playerToUpdateParameters.getAge());
				}
				if (playerToUpdateParameters.getHeight() == 0 || playerToUpdateParameters.getHeight() == 0) {
					playerToUpdateParameters.setHeight(playerToUpdateParameters.getHeight());
				}
				if (playerToUpdateParameters.getWeight() == 0 || playerToUpdateParameters.getWeight() == 0) {
					playerToUpdateParameters.setWeight(playerToUpdateParameters.getWeight());
				}
				if (playerToUpdateParameters.getGp() == 0 || playerToUpdateParameters.getGp() == 0) {
					playerToUpdateParameters.setGp(playerToUpdateParameters.getGp());
				}
				if (playerToUpdateParameters.getScore() == 0 || playerToUpdateParameters.getScore() == 0) {
					playerToUpdateParameters.setScore(playerToUpdateParameters.getScore());
				}

				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE_PARAMETERS);

				preparedStatement.setInt(1, playerToUpdateParameters.getAge());
				preparedStatement.setInt(2, playerToUpdateParameters.getHeight());
				preparedStatement.setDouble(3, playerToUpdateParameters.getWeight());
				preparedStatement.setInt(4, playerToUpdateParameters.getGp());
				preparedStatement.setInt(5, playerToUpdateParameters.getScore());
				
				int a = preparedStatement.executeUpdate();

				if (a > 0)
					return true;
				else
					return false;

			} catch (SQLException e) {
				return false;
			}
		}

		return false;
	}

	@Override
	public Player read(int id) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			String playertype,password , nickname;
			int idcoach,age, height, gp, score;
			double weight;

			id = resultSet.getInt("id");
			idcoach = resultSet.getInt("idcoach");
			playertype = resultSet.getString("playertype");
			password = resultSet.getString("password");
			nickname = resultSet.getString("nickname");
			age = resultSet.getInt("age");
			height = resultSet.getInt("height");
			weight = resultSet.getDouble("weight");
			gp = resultSet.getInt("gp");
			score = resultSet.getInt("score");
			
			Player player = new Player(idcoach, playertype, password, nickname, age, height, weight, gp, score);
			player.setId(resultSet.getInt("id"));

			return player;
		} catch (SQLException e) {
			return null;
		}

	}

	@Override
	public boolean insert(Player playerToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			
			preparedStatement.setInt(1, playerToInsert.getIdcoach());
			preparedStatement.setString(2, playerToInsert.getPlayertype());
			preparedStatement.setString(3, playerToInsert.getPassword());
			preparedStatement.setString(4, playerToInsert.getNickname());
			preparedStatement.setInt(5, playerToInsert.getAge());
			preparedStatement.setInt(6, playerToInsert.getHeight());
			preparedStatement.setDouble(7, playerToInsert.getWeight());
			preparedStatement.setInt(8, playerToInsert.getGp());
			preparedStatement.setInt(9, playerToInsert.getScore());


			int a = preparedStatement.executeUpdate();

			if (a > 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {

		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, id);
			
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}
}
