package it.contrader.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterParameters;
import it.contrader.dao.ParametersRepository;
import it.contrader.dto.ParametersDTO;

@Service
public class ParametersService {

	private final ParametersRepository parametersRepository;
	

	@Autowired
	public ParametersService(ParametersRepository parametersRepository) {
		this.parametersRepository = parametersRepository;
	}

	public ParametersDTO getParametersDTOById(Integer id) {
		return ConverterParameters.toDTO(parametersRepository.findById(id).get());
	}


	public boolean insertParameters(ParametersDTO parametersDTO) {
		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
	}

	public boolean updateParameters(ParametersDTO parametersDTO) {
		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
	}
	
	public void deleteParametersById(Integer id) {
		parametersRepository.deleteById(id);
	}
	
public List<ParametersDTO> findAllById(int id) {
		
		final List<ParametersDTO> list = ConverterParameters.toListDTO(ParametersRepository.findAllById(id));
		//final List<SensordataDTO> sensordataDTOs = new ArrayList<>();
		//list.forEach(i -> sensordataDTOs.add(ConverterSensordata.toDTO(i)));
		return list;
		
	
	}

}
