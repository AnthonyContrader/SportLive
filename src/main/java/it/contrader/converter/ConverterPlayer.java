package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Player;
import it.contrader.model.User;

public class ConverterPlayer {

	public static PlayerDTO toDTO(Player player) {
		UserDTO coachDTO = new UserDTO(player.getCoach().getId(), player.getCoach().getUsername(), player.getCoach().getPassword(), player.getCoach().getUsertype(), player.getCoach().getName(), player.getCoach().getSurname());
		UserDTO userDTO = new UserDTO(player.getUserPlayer().getId(), player.getUserPlayer().getUsername(), player.getUserPlayer().getPassword(), player.getUserPlayer().getUsertype(), player.getUserPlayer().getName(), player.getUserPlayer().getSurname());
		return new PlayerDTO(player.getId(), player.getUsername(), player.getPlayertype(), player.getIdCoach(), player.getScore(), coachDTO, userDTO);
	}

	public static Player toEntity(PlayerDTO playerDTO) {
		User coach = new User(playerDTO.getCoach().getId(), playerDTO.getCoach().getUsername(), playerDTO.getCoach().getPassword(), playerDTO.getCoach().getUsertype(), playerDTO.getCoach().getName(), playerDTO.getCoach().getSurname());
		User user = new User(playerDTO.getUserPlayer().getId(), playerDTO.getUserPlayer().getUsername(), playerDTO.getUserPlayer().getPassword(), playerDTO.getUserPlayer().getUsertype(), playerDTO.getUserPlayer().getName(), playerDTO.getUserPlayer().getSurname());
		return new Player(playerDTO.getId(), playerDTO.getUsername(), playerDTO.getPlayertype(), playerDTO.getIdCoach(), playerDTO.getScore(), coach, user );
	}

	public static List<PlayerDTO> toListDTO(List<Player> list) {
		List<PlayerDTO> listPlayerDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Player player : list) {
				listPlayerDTO.add(ConverterPlayer.toDTO(player));
			}
		}
		return listPlayerDTO;
	}

	public static List<Player> toListEntity(List<PlayerDTO> listPlayerDTO) {
		List<Player> list = new ArrayList<>();
		if (!listPlayerDTO.isEmpty()) {
			for (PlayerDTO playerDTO : listPlayerDTO) {
				list.add(ConverterPlayer.toEntity(playerDTO));
			}
		}
		return list;
	}
}
