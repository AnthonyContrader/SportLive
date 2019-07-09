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
			playerDTO.setIdPlayer(player.getIdPlayer());
			playerDTO.setNickname(player.getNickname());
			playerDTO.setPassword(player.getPassword());
			playerDTO.setPlayertype(player.getPlayertype());
			playerDTO.setScore(player.getScore());
		}
		return playerDTO;
	}

	public static Player toEntity(PlayerDTO playerDTO) {
		Player player = null;
		if (playerDTO != null) {
			player = new Player();
			player.setId(playerDTO.getId());
			player.setIdPlayer(playerDTO.getIdPlayer());
			player.setNickname(playerDTO.getNickname());
			player.setPassword(playerDTO.getPassword());
			player.setPlayertype(playerDTO.getPlayertype());
			player.setScore(playerDTO.getScore());
		}
		return player;
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
