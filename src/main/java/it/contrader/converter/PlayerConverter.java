package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Player;
import it.contrader.model.User;
import it.contrader.model.Player.Playertype;

@Component
public class PlayerConverter extends AbstractConverter<Player,PlayerDTO>{

	public Player toEntity(PlayerDTO playerDTO) {
		Player player = null;
		if(playerDTO != null) {
			player = new Player(playerDTO.getId(), playerDTO.getIdPlayer(), playerDTO.getIdCoach(), playerDTO.getPlayername(),playerDTO.getPlayertype(), playerDTO.getAge(), playerDTO.getGamep(),playerDTO.getScore());
		}
		return player;
	}
	
	public PlayerDTO toDTO(Player player) {
		
		
		//TODO attenzione ricontrollare questa parte inserito un null non ben capito
		PlayerDTO playerDTO = null;
		if (player != null){
			playerDTO = new PlayerDTO(player.getId(), player.getIdPlayer(), player.getIdCoach(), player.getPlayername(), player.getPlayertype() , player.getAge(), player.getGamep(), player.getScore());
		}
		return playerDTO;
	}
}
