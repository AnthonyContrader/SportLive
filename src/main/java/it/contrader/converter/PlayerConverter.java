package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;
import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;

public class PlayerConverter implements Converter<Player, PlayerDTO> {

	public PlayerDTO toDTO (Player player) {
		PlayerDTO playerDTO = new PlayerDTO(player.getId(), player.getIdcoach(), player.getPassword(), player.getPlayertype(), player.getNickname());
	return playerDTO;
	}
	public Player toEntity(PlayerDTO playerDTO) {
		Player player = new Player(playerDTO.getId(), playerDTO.getIdcoach(), playerDTO.getPassword(), playerDTO.getPlayertype(), playerDTO.getnickname());
	    return player;
	}
	
	public List<PlayerDTO> toDTOList(List<Player> playerList) {
		List<PlayerDTO> playerDTOList = new ArrayList<PlayerDTO>();
		
		for(Player player : playerList) {
			
			playerDTOList.add(toDTO(player));
		}
		return playerDTOList;
	}

  }
