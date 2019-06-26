package it.contrader.service;

import it.contrader.converter.ParametersConverter;
import it.contrader.dao.ParametersDAO;
import it.contrader.dto.ParametersDTO;
import it.contrader.model.Parameters;

public class ParametersService extends AbstractService<Parameters, ParametersDTO>  {

	public ParametersService() {
		this.dao = new ParametersDAO();
		this.converter = new ParametersConverter();
		
	}

	
}
