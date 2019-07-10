package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.ParametersDTO;
import it.contrader.model.Parameters;

public class ConverterParameters {

	public static ParametersDTO toDTO(Parameters parameters) {
		ParametersDTO parametersDTO = null;
		if (parameters != null) {
			parametersDTO = new ParametersDTO();
			parametersDTO.setId(parameters.getId());
			parametersDTO.setIdPlayer(parameters.getPlayer().getId());
			parametersDTO.setData(parameters.getData());
			parametersDTO.setAge(parameters.getAge());
			parametersDTO.setHeight(parameters.getHeight());
			parametersDTO.setWeight(parameters.getWeight());
			parametersDTO.setGol(parameters.getGol());
			parametersDTO.setGp(parameters.getGp());
			parametersDTO.setMp(parameters.getMp());
			
		}
		return parametersDTO;
	}

	public static Parameters toEntity(ParametersDTO parametersDTO) {
		Parameters parameters = null;
		if (parametersDTO != null) {
			parameters = new Parameters();
			parameters.setId(parametersDTO.getId());
			parameters.setData(parametersDTO.getData());
			parameters.setAge(parametersDTO.getAge());
			parameters.setHeight(parametersDTO.getHeight());
			parameters.setWeight(parametersDTO.getWeight());
			parameters.setGol(parametersDTO.getGol());
			parameters.setGp(parametersDTO.getGp());
			parameters.setMp(parametersDTO.getMp());

		}
		return parameters;
	}

	public static List<ParametersDTO> toListDTO(List<Parameters> list) {
		List<ParametersDTO> listParametersDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Parameters parameters : list) {
				listParametersDTO.add(ConverterParameters.toDTO(parameters));
			}
		}
		return listParametersDTO;
	}

	public static List<Parameters> toListEntity(List<ParametersDTO> listParametersDTO) {
		List<Parameters> list = new ArrayList<>();
		if (!listParametersDTO.isEmpty()) {
			for (ParametersDTO parametersDTO : listParametersDTO) {
				list.add(ConverterParameters.toEntity(parametersDTO));
			}
		}
		return list;
	}
}
