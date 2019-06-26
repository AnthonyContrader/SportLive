package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.ParametersDTO;
import it.contrader.model.Parameters;

public class ParametersConverter implements Converter<Parameters, ParametersDTO>  {

	public ParametersDTO toDTO(Parameters parameters) {
		ParametersDTO parametersDTO = new ParametersDTO(parameters.getIdplayer(), parameters.getData(), parameters.getAge(), parameters.getHeight(), parameters.getWeight(), parameters.getGol(), parameters.getGp(), parameters.getMp());
		return parametersDTO;
	}


	@Override
	public Parameters toEntity(ParametersDTO parametersDTO) {
		Parameters parameters = new Parameters(parametersDTO.getIdplayer(), parametersDTO.getData(), parametersDTO.getAge(), parametersDTO.getHeight(), parametersDTO.getWeight(), parametersDTO.getGol(), parametersDTO.getGp(), parametersDTO.getMp());
		return parameters;
	}
	

	@Override
	public List<ParametersDTO> toDTOList(List<Parameters> parametersList) {
		
		List<ParametersDTO> parametersDTOList = new ArrayList<ParametersDTO>();
		
		
		for(Parameters parameters : parametersList) {
			
			
			parametersDTOList.add(toDTO(parameters));
		}
		return parametersDTOList;
	}

	
	
}
