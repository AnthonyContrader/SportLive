package it.contrader.service;

import it.contrader.converter.PlayersConverter;
import it.contrader.dao.PlayersDAO;
import it.contrader.dto.PlayersDTO;
import it.contrader.model.Players;

public class PlayersService extends AbstractService<Players, PlayersDTO> { 

	public PlayersService() {
		this.dao = new PlayersDAO();
		this.converter = new PlayersConverter();
	}
	

}
