package it.contrader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterDevice;
import it.contrader.dao.DeviceRepository;
import it.contrader.dao.ParametresRepository;
import it.contrader.dto.DeviceDTO;
import it.contrader.dto.ParametersDTO;
import it.contrader.model.Device;
import it.contrader.model.Parameters;

@Service
public class ParametersService {
//
//	private final ParametresRepository parametresRepository;
//
//	@Autowired
//	public ParametersService(ParametresRepository parametersRepository) {
//		this.parametresRepository = parametersRepository;
//	}
//
//	public List<ParametersDTO> getListaParametersDTO() {
//		return ConverterParameters.toListDTO((List<Parameters>) parameteresRepository.findAll());
//	}
//
//	public ParametersDTO getPaametersDTOById(Integer id) {
//		return ConverterParameters.toDTO(parametersRepository.findById(id).get());
//	}
//
//
//	public boolean insertParameters(ParametersDTO parametersDTO) {
//		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
//	}
//
//	public boolean updateParameters(ParametersDTO parametersDTO) {
//		return parametersRepository.save(ConverterParameters.toEntity(parametersDTO)) != null;
//	}
//	
//	public void deleteParametersById(Integer id) {
//		parametersRepository.deleteById(id);
//	}
//	
//public List<ParemetersDTO> findAllById(int id) {
//		
//		final List<ParametersDTO> list = ConverterParameters.toListDTO(parametersRepository.findAllById(id));
//		//final List<SensordataDTO> sensordataDTOs = new ArrayList<>();
//		//list.forEach(i -> sensordataDTOs.add(ConverterSensordata.toDTO(i)));
//		return list;
//		
//	
//	}

}
