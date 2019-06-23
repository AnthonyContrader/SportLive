package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Parameters;

public class ParametersDAO implements DAO<Parameters> {
	
	private final String QUERY_ALL = "SELECT * FROM parameters";
	private final String QUERY_CREATE = "INSERT INTO parameters (idplayer, age, height, weight, gp, score) VALUES (?,?,?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM parameters WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE parameters SET idplayer=?, age=?, height=?, weight=?, gp=?, score=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM parameters WHERE id=?";

	public List<Parameters> getAll() {

		List<Parameters> parametersList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Parameters parameters;
			while (resultSet.next()) {
				int id = resultSet.getInt("id"); // identificazione
				int idplayer = resultSet.getInt("idplayer"); // id di identificazione del player nella tabella
				int age = resultSet.getInt("age"); // età
				int height = resultSet.getInt("height"); // altezza
				double weight = resultSet.getInt("weight"); // peso
				int gp = resultSet.getInt("gp"); // partite giocate
				int score = resultSet.getInt("score"); // valutazione
				
				parameters = new Parameters(id, idplayer, age, height, (int) weight, gp, score);
				parameters.setId(id);
				parametersList.add(parameters);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return parametersList;
	}

	public boolean update(Parameters parametersToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		if (parametersToUpdate.getId() == 0) {
			return false;
		}

		Parameters parametersRead = read(parametersToUpdate.getId());
		if (!parametersRead.equals(parametersToUpdate)) {
			try {
				if (parametersToUpdate.getIdplayer() == 0 || parametersToUpdate.getIdplayer() == 0) {
					parametersToUpdate.setIdplayer(parametersToUpdate.getIdplayer());
				}
				if (parametersToUpdate.getAge() == 0 || parametersToUpdate.getAge() == 0) {
					parametersToUpdate.setAge(parametersToUpdate.getAge());
				}
				if (parametersToUpdate.getHeight() == 0	 || parametersToUpdate.getHeight() == 0) {
					parametersToUpdate.setHeight(parametersToUpdate.getHeight());
				}
				if (parametersToUpdate.getWeight() == 0 || parametersToUpdate.getWeight() == 0) {
					parametersToUpdate.setWeight(parametersToUpdate.getWeight());
				}
				if (parametersToUpdate.getGp() == 0 || parametersToUpdate.getGp() == 0) {
					parametersToUpdate.setGp(parametersToUpdate.getGp());
				}
				if (parametersToUpdate.getScore() == 0 || parametersToUpdate.getScore() == 0) {
					parametersToUpdate.setScore(parametersToUpdate.getScore());
				}

				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);

				preparedStatement.setInt(1, parametersToUpdate.getIdplayer());
				preparedStatement.setInt(2, parametersToUpdate.getAge());
				preparedStatement.setInt(3, parametersToUpdate.getHeight());
				preparedStatement.setDouble(4, parametersToUpdate.getWeight());
				preparedStatement.setInt(5, parametersToUpdate.getGp());
				preparedStatement.setInt(5, parametersToUpdate.getScore());
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
	public Parameters read(int id) {
		Connection connection = ConnectionSingleton.getInstance();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			Integer idplayer;
			Integer age;
			Integer height;
			Integer gp;
			Integer score;
			double weight;
			

			idplayer = resultSet.getInt("idplayer");
			age = resultSet.getInt("age");
			height = resultSet.getInt("height");
			weight = resultSet.getDouble("weight");
			gp = resultSet.getInt("gp");
			score = resultSet.getInt("score");
			
			Parameters readParameters = new Parameters(id, idplayer, age, height, (int) weight, gp, score);
			readParameters.setId(resultSet.getInt("id"));

			return readParameters;
		} catch (SQLException e) {
			return null;
		}
	}

	@Override
	public boolean insert(Parameters dto) {
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
}

	