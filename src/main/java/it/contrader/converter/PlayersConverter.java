package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PlayersDTO;
import it.contrader.model.Players;


public class PlayersConverter  implements Converter<Players, PlayersDTO> {
	
	@Override
	public PlayersDTO toDTO(Players players) {
		PlayersDTO playersDTO = new PlayersDTO(players.getId(), players.getidcoach(), players.getnickname(), players.getpassword(), players.getplayertype(), players.getscore());
		return playersDTO;
	}
	
	
	@Override
	public Players toEntity(PlayersDTO playersDTO) {
		Players players = new Players(playersDTO.getId(), playersDTO.getidcoach(), playersDTO.getnickname(), playersDTO.getpassword(), playersDTO.getplayertype(), playersDTO.getscore());
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