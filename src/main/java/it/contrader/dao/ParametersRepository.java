package it.contrader.dao;

import org.springframework.data.repository.CrudRepository;

import it.contrader.model.Parameters;

import java.util.List;

public interface ParametersRepository extends CrudRepository<Parameters, Integer> {

	public Parameters findParametersByIdPlayer(Integer idPlayer);
	public List<Parameters> findAllByIdPlayer(Integer idPlayer);
	public List<Parameters> findByIdPlayer(Integer idPlayer);
}
