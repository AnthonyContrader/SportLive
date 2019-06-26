package it.contrader.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import it.contrader.utils.ConnectionSingleton;
import it.contrader.model.Players;


public class PlayersDAO implements DAO<Players> {

	private final String QUERY_ALL = "SELECT * FROM Players";
	private final String QUERY_CREATE = "INSERT INTO players (idcoach, nickname, password, playertype, score) VALUES (?,?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM players WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE players SET idcoach=?, nickname=?, password=?, playertype=?, score=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM players WHERE id=?";

	public PlayersDAO() {
}

	public List<Players> getAll() {
		List<Players> PlayersList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Players players;
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				int idcoach = resultSet.getInt("idcoach");
				String nickname = resultSet.getString("nickname");
				String password = resultSet.getString("password");
				String playertype = resultSet.getString("playertype");
				int score = resultSet.getInt("score");
				players = new Players(idcoach, nickname, password, playertype, score);
				players.setId(id);
				PlayersList.add(players);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return PlayersList;
	}
	
	public boolean insert(Players playersToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, playersToInsert.getidcoach());
			preparedStatement.setString(2, playersToInsert.getnickname());
			preparedStatement.setString(3, playersToInsert.getpassword());
			preparedStatement.setString(4, playersToInsert.getplayertype());
			preparedStatement.setInt(5, playersToInsert.getscore());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public Players read(int playersId) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, playersId);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int idcoach, score;
			String nickname, password, playertype;

			idcoach = resultSet.getInt("idcoach");
			nickname = resultSet.getString("nickname");
			password = resultSet.getString("password");
			playertype = resultSet.getString("playertype");
			score = resultSet.getInt("score");
			Players players = new Players(idcoach, nickname, password, playertype, score);
			players.setId(resultSet.getInt("id"));

			return players;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Players playersToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();
		
		    // Check if id is present
			if (playersToUpdate.getId() == 0)
			return false;

		Players playersRead = read(playersToUpdate.getId());
		if (!playersRead.equals(playersToUpdate)) {
			try {
				// Fill the playersToUpdate object
				if (playersToUpdate.getidcoach() == 0) {
					playersToUpdate.setidcoach(playersRead.getidcoach());
				}
				
				if (playersToUpdate.getnickname() == null || playersToUpdate.getnickname().equals("")) {
					playersToUpdate.setnickname(playersRead.getnickname());
				}

				if (playersToUpdate.getpassword() == null || playersToUpdate.getpassword().equals("")) {
					playersToUpdate.setpassword(playersRead.getpassword());
				}

				if (playersToUpdate.getplayertype() == null || playersToUpdate.getplayertype().equals("")) {
					playersToUpdate.setplayertype(playersRead.getplayertype());
				}
				
				if (playersToUpdate.getscore() == 0) {
					playersToUpdate.setscore(playersRead.getscore());
				}

				// Update the players
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setInt(1, playersToUpdate.getidcoach());
				preparedStatement.setString(2, playersToUpdate.getnickname());
				preparedStatement.setString(3, playersToUpdate.getpassword());
				preparedStatement.setString(4, playersToUpdate.getplayertype());
				preparedStatement.setInt(5, playersToUpdate.getscore());
				preparedStatement.setInt(6, playersToUpdate.getId());
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
