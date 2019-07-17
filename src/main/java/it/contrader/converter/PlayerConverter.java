package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;

@Component
public class PlayerConverter {

	public Player toEntity(PlayerDTO playerDTO) {
		Player player = null;
		if(playerDTO != null) {
			player = new Player(playerDTO.getId(), playerDTO.getIdPlayer(), playerDTO.getIdCoach(), playerDTO.getPlayername(), playerDTO.getAge(), playerDTO.getGamep(),playerDTO.getScore());
		}
		return player;
	}
	
	public PlayerDTO toDTO(Player player) {
		
		
		//TODO attenzione ricontrollare questa parte inserito un null non ben capito
		PlayerDTO playerDTO= null;
		if (player != null){
			playerDTO = new PlayerDTO(player.getId(), player.getIdPlayer(), player.getIdCoach(), player.getPlayername(), null, player.getAge(), player.getGamep(), player.getScore());
		}
		return playerDTO;
	}
}
