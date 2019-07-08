package it.contrader.dao;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Device;
import it.contrader.model.Parameters;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, Integer>{

	public Device findDeviceByIdPlayer(Integer idPlayer);
	public List<Device> findAllByIdPlayer(Integer idPlayer);
	public List<Device> findByIdPlayer(Integer idPlayer);
}