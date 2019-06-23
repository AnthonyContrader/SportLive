package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Player;

public class PlayerDAO implements DAO<Player> {

	private final String QUERY_ALL = "SELECT * FROM players";
	private final String QUERY_CREATE = "INSERT INTO players (idcoach, playertype, password, nickname) VALUES (?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM players WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE players SET  idcoach=?, playertype=?, password=?, nickname=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM players WHERE id=?";

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
				String playertype = resultSet.getString("playertype"); 	// attacante, centr, dif, portiere
				String password = resultSet.getString("password"); 		// password
				String nickname = resultSet.getString("nickname"); 		// ...

				player = new Player(idcoach, playertype, password, nickname);
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

				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);

				preparedStatement.setInt(1, playerToUpdate.getIdcoach());
				preparedStatement.setString(2, playerToUpdate.getPlayertype());
				preparedStatement.setString(3, playerToUpdate.getPassword());
				preparedStatement.setString(4, playerToUpdate.getNickname());
				preparedStatement.setInt(5, playerToUpdate.getId());
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
			Integer idcoach;
			String playertype, password, nickname;

			idcoach = resultSet.getInt("idcoach");
			playertype = resultSet.getString("playertype");
			password = resultSet.getString("password");
			nickname = resultSet.getString("nickname");
			
			Player readPlayer = new Player(idcoach, playertype, password, nickname);
			readPlayer.setId(resultSet.getInt("id"));

			return readPlayer;
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
