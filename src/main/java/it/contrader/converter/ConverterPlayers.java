package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PlayersDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Players;
import it.contrader.model.User;

public class ConverterPlayers {
	
	public static PlayersDTO toDTO(Players Players) {
		PlayersDTO PlayersDTO = null;
		if (Players != null) {
			PlayersDTO = new PlayersDTO();
			PlayersDTO.setIdcoach(Players.getIdcoach());
			PlayersDTO.setNickname(Players.getNickname());
			PlayersDTO.setPassword(Players.getPassword());
			PlayersDTO.setPlayertype(Players.getPlayertype());
			PlayersDTO.setScore(Players.getScore());
		}
		return PlayersDTO;
	}
	
	public static Players toEntity(PlayersDTO playersDTO) {
		Players players = null;
		if (playersDTO != null) {
			players = new Players();
			players.setIdcoach(playersDTO.getIdcoach());
			players.setNickname(playersDTO.getNickname());
			players.setPassword(playersDTO.getPassword());
			players.setPlayertype(playersDTO.getPlayertype());
			players.setScore(playersDTO.getScore());
		}
		return players;
	}
	
	public static List<PlayersDTO> toListDTO(List<Players> list) {
		List<PlayersDTO> listPlayersDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Players players : list) {
				listPlayersDTO.add(ConverterPlayers.toDTO(players));
			}
		}
		return listPlayersDTO;
	}

	public static List<Players> toListEntity(List<PlayersDTO> listPlayersDTO) {
		List<Players> list = new ArrayList<>();
		if (!listPlayersDTO.isEmpty()) {
			for (PlayersDTO PlayersDTO : listPlayersDTO) {
				list.add(ConverterPlayers.toEntity(PlayersDTO));
			}
		}
		return list;
	}
			
}
