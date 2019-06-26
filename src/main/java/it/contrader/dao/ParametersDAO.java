package it.contrader.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import it.contrader.utils.ConnectionSingleton;
import it.contrader.model.Parameters;

public class ParametersDAO implements DAO<Parameters> {
	
	private final String QUERY_ALL = "SELECT * FROM parameters";
	private final String QUERY_CREATE = "INSERT INTO parameters (data, age, height, weight, gol, gp, mp) VALUES (?,?,?,?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM parameters WHERE idplayer=?";
	private final String QUERY_UPDATE = "UPDATE parameters SET data=?, age=?, height=?, weight =?, gol =?, gp=?, mp=? WHERE idplayer=?";
	private final String QUERY_DELETE = "DELETE FROM parameters WHERE idplayer=?";

	public ParametersDAO() {
		
	}
	
	public List<Parameters> getAll() {
		List<Parameters> parametersList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Parameters parameters;
			while (resultSet.next()) {
				int idplayer = resultSet.getInt("idplayer");
				int data = resultSet.getInt("data");
				int age = resultSet.getInt("age");
				int height = resultSet.getInt("height");
				int weight = resultSet.getInt("weight");
				int gol = resultSet.getInt("gol");
				int gp = resultSet.getInt("gp");
				int mp = resultSet.getInt("mp");
				parameters = new Parameters(data, age, height, weight, gol, gp, mp);
				parameters.setIdplayer(idplayer);
				parametersList.add(parameters);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return parametersList;
	}
	
	public boolean insert(Parameters parametersToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, parametersToInsert.getData());
			preparedStatement.setInt(2, parametersToInsert.getAge());
			preparedStatement.setInt(3, parametersToInsert.getHeight());
			preparedStatement.setInt(4, parametersToInsert.getWeight());
			preparedStatement.setInt(5, parametersToInsert.getGol());
			preparedStatement.setInt(6, parametersToInsert.getGp());
			preparedStatement.setInt(7, parametersToInsert.getMp());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
		return false;
		}

	}

	public Parameters read(int parametersIdplayer) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, parametersIdplayer);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int data, age, height, weight, gol, gp, mp;
		
			data = resultSet.getInt("data");
			age = resultSet.getInt("age");
			height = resultSet.getInt("height");
			weight = resultSet.getInt("weight");
			gol = resultSet.getInt("gol");
			gp = resultSet.getInt("gp");
			mp = resultSet.getInt("mp");
			Parameters parameters = new Parameters(data, age, height, weight, gol, gp, mp);
			parameters.setIdplayer(resultSet.getInt("idplayer"));
		
			return parameters;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Parameters parametersToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		if (parametersToUpdate.getIdplayer() == 0)
			return false;

		Parameters parametersRead = read(parametersToUpdate.getIdplayer());
		if (!parametersRead.equals(parametersToUpdate)) {
			try {
				if (parametersToUpdate.getData() == 0) {
					parametersToUpdate.setData(parametersRead.getData());
				}

				if (parametersToUpdate.getAge() == 0) {
				parametersToUpdate.setAge(parametersRead.getAge());
				}

				if (parametersToUpdate.getHeight() == 0) {
				parametersToUpdate.setHeight(parametersRead.getHeight());
				}
			
				if (parametersToUpdate.getWeight() == 0) {
				parametersToUpdate.setWeight(parametersRead.getWeight());
				}
			
				if (parametersToUpdate.getGol() == 0) {
				parametersToUpdate.setGol(parametersRead.getGol());
				}
			
				if (parametersToUpdate.getGp() == 0) {
				parametersToUpdate.setGp(parametersRead.getGp());
				}

				if (parametersToUpdate.getMp() == 0) {
				parametersToUpdate.setMp(parametersRead.getMp());
				}
			
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setInt(1, parametersToUpdate.getData());
				preparedStatement.setInt(2, parametersToUpdate.getAge());
				preparedStatement.setInt(3, parametersToUpdate.getHeight());
				preparedStatement.setInt(4, parametersToUpdate.getWeight());
				preparedStatement.setInt(5, parametersToUpdate.getGol());
				preparedStatement.setInt(6, parametersToUpdate.getGp());
				preparedStatement.setInt(7, parametersToUpdate.getMp());
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

	public boolean delete(int idplayer) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idplayer);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}


}
		

