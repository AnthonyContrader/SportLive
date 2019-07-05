package it.contrader.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Device;

public interface DeviceRepository extends CrudRepository<Device, Integer>{

	public Device findDeviceByIdPlayer(Integer idPlayer);
	public List<Device> findAllByIdPlayer(Integer idPlayer);
}
