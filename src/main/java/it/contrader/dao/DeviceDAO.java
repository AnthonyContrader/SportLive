package it.contrader.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import it.contrader.utils.ConnectionSingleton;
import it.contrader.model.Device;

public class DeviceDAO implements DAO<Device> {
	
	private final String QUERY_ALL = "SELECT * FROM device";
	private final String QUERY_CREATE = "INSERT INTO device (heartbeat, pressure, breath) VALUES (?,?,?)";
	private final String QUERY_READ = "SELECT * FROM device WHERE idplayer=?";
	private final String QUERY_UPDATE = "UPDATE device SET heartbeat=?, pressure=?, breath=? WHERE idplayer=?";
	private final String QUERY_DELETE = "DELETE FROM user WHERE idplayer=?";

	public DeviceDAO() {

	}
	
	public List<Device> getAll() {
		List<Device> devicesList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Device device;
			while (resultSet.next()) {
				int idplayer = resultSet.getInt("idplayer");
				int heartbeat = resultSet.getInt("heartbeat");
				int pressure = resultSet.getInt("pressure");
				int breath = resultSet.getInt("breath");
				device = new Device(heartbeat, pressure, breath);
				device.setIdplayer(idplayer);
				devicesList.add(device);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return devicesList;
	}

	public boolean insert(Device deviceToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, deviceToInsert.getHeartbeat());
			preparedStatement.setInt(2, deviceToInsert.getPressure());
			preparedStatement.setInt(3, deviceToInsert.getBreath());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}
	
	public Device read(int deviceIdplayer) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, deviceIdplayer);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int heartbeat, pressure, breath;

			heartbeat = resultSet.getInt("heartbeat");
			pressure = resultSet.getInt("pressure");
			breath = resultSet.getInt("breath");
			Device device = new Device(heartbeat, pressure, breath);
			device.setIdplayer(resultSet.getInt("idplayer"));
			
			return device;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Device deviceToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		if (deviceToUpdate.getIdplayer() == 0)
			return false;

		Device deviceRead = read(deviceToUpdate.getIdplayer());
		if (!deviceRead.equals(deviceToUpdate)) {
			try {
				if (deviceToUpdate.getHeartbeat() == 0) {
					deviceToUpdate.setHeartbeat(deviceRead.getHeartbeat());
				}

				if (deviceToUpdate.getPressure() == 0) {
					deviceToUpdate.setPressure(deviceRead.getPressure());
				}

				if (deviceToUpdate.getBreath() == 0) {
					deviceToUpdate.setBreath(deviceRead.getBreath());
				}

				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setInt(1, deviceToUpdate.getHeartbeat());
				preparedStatement.setInt(2, deviceToUpdate.getPressure());
				preparedStatement.setInt(3, deviceToUpdate.getBreath());
				preparedStatement.setInt(4, deviceToUpdate.getIdplayer());
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

	
	