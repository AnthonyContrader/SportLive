package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Player;



public class PlayerDAO /*implements DAO<Player>*/ {
/*
	
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
				player = new Player(password, playertype, name, surname, height, weight, age, pr, gf, gs, kmp, min);
				player.setId(id);
				playerList.add(player);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}
	
	
	public boolean updatePlayer(Player palyerToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();
		
		if(palyerToUpdate.getId() == 0) {
			return false;
		}

		Player playerRead = read(palyerToUpdate.getId());
		if (!playerRead.equals(palyerToUpdate)) {
			try {
				if (palyerToUpdate.getPassword()==null || palyerToUpdate.getPassword().equals("")) {
					palyerToUpdate.setPassword(palyerToUpdate.getPassword());
				}
				if (palyerToUpdate.getPlayertype() == null || palyerToUpdate.getPlayertype().equals("")) {
					palyerToUpdate.setPlayertype((palyerToUpdate.getPlayertype());
				}
				if (palyerToUpdate.getName() == null || palyerToUpdate.getName().equals("")) {
					palyerToUpdate
				}
			}catch (SQLException e) {
				return false;
			}
		}
		
		
		return false;
	}


	@Override
	public Player read(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean insert(Player dto) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Player dto) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		
		return false;
	}

*/
}
