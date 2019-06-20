package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Player;



public class PlayerDAO implements DAO<Player> {

	
	private final String QUERY_ALL = "SELECT * FROM players";
	private final String QUERY_CREATE = "INSERT INTO players (password, playertype, name, surname) VALUES (?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM players WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE players SET password=?, playertype=?, name=?, surname=?, height=?, weight=?, age=?, pr=?, gf=?, gs=?, kmp=?, min=? WHERE id=?,idcoach=?";
	private final String QUERY_DELETE = "DELETE FROM players WHERE id=?, idcoach=?";

	public List<Player> getAll(){
		List<Player> playerList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Player player;
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				int idcoach = resultSet.getInt("idcoach");
				String password = resultSet.getString("password");
				String playertype = resultSet.getString("playertype");
				String name = resultSet.getString("name");
				String surname = resultSet.getString("surname");
				int height = resultSet.getInt("height");
				double weight = resultSet.getDouble("weight");
				int age = resultSet.getInt("age");
				int pr = resultSet.getInt("pr");
				int gf = resultSet.getInt("gf");
				int gs = resultSet.getInt("gs");
				double kmp = resultSet.getDouble("kmp");
				int min = resultSet.getInt("min");
				player = new Player(id, idcoach, password, playertype, name, surname, height, weight, age, pr, gf, gs, kmp, min);
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
				if (playerToUpdate.getName() == null || playerToUpdate.getName().equals("")) {
					playerToUpdate.setName(playerToUpdate.getName());
				}
				if (playerToUpdate.getSurname() == null || playerToUpdate.getSurname().equals("")) {
					playerToUpdate.setSurname(playerToUpdate.getSurname());
				}
				
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, playerToUpdate.getPassword());
				preparedStatement.setString(2, playerToUpdate.getPlayertype());
				preparedStatement.setString(3, playerToUpdate.getName());
				preparedStatement.setString(4, playerToUpdate.getSurname());
				preparedStatement.setInt(5, playerToUpdate.getId());
				preparedStatement.setInt(6, playerToUpdate.getIdcoach());
				preparedStatement.setInt(7, playerToUpdate.getHeight());
				preparedStatement.setInt(8, playerToUpdate.getAge());
				preparedStatement.setInt(9, playerToUpdate.getPr());
				preparedStatement.setInt(10, playerToUpdate.getGf());
				preparedStatement.setInt(11, playerToUpdate.getGs());
				preparedStatement.setInt(12, playerToUpdate.getMin());
				preparedStatement.setDouble(13, playerToUpdate.getWeight());
				preparedStatement.setDouble(14, playerToUpdate.getKmp());

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
