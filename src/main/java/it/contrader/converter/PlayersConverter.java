package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PlayersDTO;
import it.contrader.model.Players;


public class PlayersConverter  implements Converter<Players, PlayersDTO> {
	
	@Override
	public PlayersDTO toDTO(Players players) {
		PlayersDTO playersDTO = new PlayersDTO(players.getId(), players.getIdcoach(), players.getNickname(), players.getPassword(), players.getPlayertype(), players.getScore());
		return playersDTO;
	}
	
	
	@Override
	public Players toEntity(PlayersDTO playersDTO) {
		Players players = new Players(playersDTO.getId(), playersDTO.getIdcoach(), playersDTO.getNickname(), playersDTO.getPassword(), playersDTO.getPlayertype(), playersDTO.getScore());
		return players;
	}
	
	@Override
	public List<PlayersDTO> toDTOList(List<Players> playersList) {

		List<PlayersDTO> playersDTOList = new ArrayList<PlayersDTO>();
		
		for(Players players : playersList) {
			
			playersDTOList.add(toDTO(players));
		}
		return playersDTOList;
	}

	
	
}