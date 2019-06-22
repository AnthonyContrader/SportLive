package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;
import it.contrader.dto.ParametersDTO;
import it.contrader.model.Parameters;


public class ParametersConverter implements Converter<Parameters, ParametersDTO> {

	@Override
	public ParametersDTO toDTO(Parameters parameters) {
		ParametersDTO parametersDTO = new ParametersDTO(parameters.getId(), parameters.getIdplayer(), parameters.getAge(), parameters.getHeight(), parameters.getWeight(), parameters.getGp(), parameters.getScore());
		return parametersDTO;
		
		
	}


	@Override
	public Parameters toEntity(ParametersDTO parametersDTO) {
		Parameters parameters = new Parameters(parametersDTO.getId(), parametersDTO.getIdplayer(), parametersDTO.getAge(), parametersDTO.getHeight(), (int) parametersDTO.getWeight(), parametersDTO.getGp(), parametersDTO.getScore());
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
		
