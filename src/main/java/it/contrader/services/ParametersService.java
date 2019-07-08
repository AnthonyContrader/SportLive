package it.contrader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterParameters;
import it.contrader.dao.ParametersRepository;
import it.contrader.dto.ParametersDTO;
import it.contrader.model.Parameters;

@Service
public class ParametersService {

	@Autowired
	private ParametersRepository parametersRepository;

	

	public List<ParametersDTO> getListaParametersDTO() {
		return ConverterParameters.toListDTO((List<Parameters>) parametersRepository.findAll());
	}

	public ParametersDTO getParametersDTOByIdPlayer(Integer idPlayer) {
		return ConverterParameters.toDTO(parametersRepository.findByIdPlayer(idPlayer).get(idPlayer));
	}

	public ParametersDTO getByIdPlayer(Integer idPlayer) {

		final Parameters parameters = parametersRepository.findParametersByIdPlayer(idPlayer);

		return ConverterParameters.toDTO(parameters);
	}

	public boolean insertParameters(ParametersDTO parametersDTO) {
		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
	}

	public boolean updateParameters(ParametersDTO parametersDTO) {
		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
	}
	
	public void deleteParametersByIdPlayer(Integer idPlayer) {
		parametersRepository.deleteById(idPlayer);
	}
	
	public List<ParametersDTO> findParametersDTOByIdPlayer(Integer idPlayer) {
		
		final List<Parameters> list = parametersRepository.findAllByIdPlayer(idPlayer);
		final List<ParametersDTO> parametersDTOs = new ArrayList<>();
		list.forEach(i -> parametersDTOs.add(ConverterParameters.toDTO(i)));
		return parametersDTOs;
		
	
	}

	public List<ParametersDTO> findParametersDTOByUsername(String content) {
		// TODO Auto-generated method stub
		return null;
	}
}

