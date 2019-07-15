package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;

public class ConverterPlayer {

	
	public static PlayerDTO toDTO(Player player) {
		PlayerDTO playerDTO = null;
		if (player != null) {
			playerDTO = new PlayerDTO();
			playerDTO.setId(player.getId());
			playerDTO.setUsername(player.getUsername());
			playerDTO.setName(player.getName());
			playerDTO.setSurname(player.getSurname());
			playerDTO.setPassword(player.getPassword());
			playerDTO.setUsername(player.getUsername());
			playerDTO.setPlayertype(player.getPlayertype());
			playerDTO.setIdCoach(player.getIdCoach());
			playerDTO.setScore(player.getScore());
		}
		return playerDTO;
	}
	
	
	public static Player toEntity(PlayerDTO playerDTO) {
		Player player = null;
		if (playerDTO != null) {
			player = new Player();
			player.setId(playerDTO.getId());
			player.setUsername(playerDTO.getUsername());
			player.setName(playerDTO.getName());
			player.setSurname(playerDTO.getSurname());
			player.setPassword(playerDTO.getPassword());
			player.setPlayertype(playerDTO.getPlayertype());
			player.setIdCoach(playerDTO.getIdCoach());
			player.setScore(playerDTO.getScore());
		}
		return player;
	}
	
	
	
//	public static PlayerDTO toDTO(Player player) {
//		UserDTO coachDTO = null;
//		if (player.getCoach() != null) {
//			coachDTO = new UserDTO(player.getCoach().getId(), player.getCoach().getUsername(),
//					player.getCoach().getPassword(), player.getCoach().getUsertype(), player.getCoach().getName(),
//					player.getCoach().getSurname());
//		}
//		UserDTO userDTO = null;
//		if (player.getUserPlayer() != null) {
//			userDTO = new UserDTO(player.getUserPlayer().getId(), player.getUserPlayer().getUsername(),
//					player.getUserPlayer().getPassword(), player.getUserPlayer().getUsertype(),
//					player.getUserPlayer().getName(), player.getUserPlayer().getSurname());
//		}
//
//		return new PlayerDTO(player.getId(), player.getUsername(), player.getPlayertype(), player.getIdCoach(),
//				player.getScore());
//	}

	
	
	
//	public static Player toEntity(PlayerDTO playerDTO) {
//		User coach = null;
//		if (playerDTO.getCoach() != null) {
//			coach = new User(playerDTO.getCoach().getId(), playerDTO.getCoach().getUsername(),
//					playerDTO.getCoach().getPassword(), playerDTO.getCoach().getUsertype(),
//					playerDTO.getCoach().getName(), playerDTO.getCoach().getSurname());
//		}
//		User user = null;
//		if (playerDTO.getUserPlayer() != null) {
//			user = new User(playerDTO.getUserPlayer().getId(), playerDTO.getUserPlayer().getUsername(),
//					playerDTO.getUserPlayer().getPassword(), playerDTO.getUserPlayer().getUsertype(),
//					playerDTO.getUserPlayer().getName(), playerDTO.getUserPlayer().getSurname());
//		}
//		return new Player(playerDTO.getId(), playerDTO.getUsername(), playerDTO.getPlayertype(), playerDTO.getIdCoach(),
//				playerDTO.getScore());
//	}

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
