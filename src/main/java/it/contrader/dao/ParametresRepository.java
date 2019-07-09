package it.contrader.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Device;
import it.contrader.model.Parameters;

public interface ParametresRepository extends CrudRepository<Device, Integer> {

	public static List<Parameters> findAllById(int id) {
		return null;
	}
	
}
