package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Device;

@Repository
@Transactional

public interface DeviceRepository extends CrudRepository<Device, Long>{
  
	Device findByIdplayer(int Idplayer);
	

}
