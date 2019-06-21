package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Player;



public class PlayerDAO implements DAO<Player> {

	
	private final String QUERY_ALL = "SELECT * FROM players";
	private final String QUERY_CREATE = "INSERT INTO players (idcoach, playertype, password, nickname) VALUES (?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM players WHERE id=? AND idcoach=?";
	private final String QUERY_UPDATE = "UPDATE players SET idcoach=?, playertype=?, password=?, nickname=?";
	private final String QUERY_DELETE = "DELETE FROM players WHERE id=? AND idcoach=?";

	public List<Player> getAll(){
		
		List<Player> playerList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Player player;
			while (resultSet.next()) {
				int id = resultSet.getInt("id");							//identificazione univoca del player nella tabella
				int idcoach = resultSet.getInt("idcoach");					//id di identificazione del coach a cui appartiene
				String playertype = resultSet.getString("playertype");		//attacante, centr, dif, portiere
				String password = resultSet.getString("password");			//password
				String nickname = resultSet.getString("nickname");			//...
				
				player = new Player(id, idcoach, password, playertype, nickname);
				player.setId(id);
				playerList.add(player);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}
	
	
	public boolean updatePlayer(Player playerToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();
		
		if(playerToUpdate.getId() == 0) {
			return false;
		}

		Player playerRead = read(playerToUpdate.getId());
		if (!playerRead.equals(playerToUpdate)) {
			try {
				if (playerToUpdate.getPassword()==null || playerToUpdate.getPassword().equals("")) {
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
				preparedStatement.setString(2, playerToUpdate.getPassword());
				preparedStatement.setString(3, playerToUpdate.getPlayertype());
				preparedStatement.setString(4, playerToUpdate.getNickname());


				int a = preparedStatement.executeUpdate();

				if (a > 0)
					return true;
				else
					return false;
				
			}catch (SQLException e) {
				return false;
			}
		}
		
		
		return false;
	}


	@Override
	public Player read(int id) {
		// TODO Auto-generated method stub
		//per poi adndare ad leggere tutta la lista
		return null;
	}


	@Override
	public boolean insert(Player dto) {
		// TODO Auto-generated method stub
		
		return false;
	}



	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		
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


	@Override
	public boolean update(Player dto) {
		// TODO Auto-generated method stub
		return false;
	}
}
