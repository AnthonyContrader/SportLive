package it.contrader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterPlayer;
import it.contrader.converter.ConverterUser;
import it.contrader.dao.PlayerRepository;
import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.enumerators.UserType;
import it.contrader.model.Player;
import it.contrader.model.User;

@Service
public class PlayerService {

	private final PlayerRepository playerRepository;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<PlayerDTO> getListaPlayerDTOByIdCoach(Integer idCoach) {
		return ConverterPlayer.toListDTO((List<Player>) playerRepository.findAllPlayerByIdCoach(idCoach));
	}

	public PlayerDTO getPlayerDTOById(Integer id) {
		return ConverterPlayer.toDTO(playerRepository.findById(id).get());
	}

	public static List<Player> toEntity(List<PlayerDTO> listPlayerDTO) {
		List<Player> list = new ArrayList<>();
		if (!listPlayerDTO.isEmpty()) {
			for (PlayerDTO PlayerDTO : listPlayerDTO) {
				list.add(ConverterPlayer.toEntity(PlayerDTO));
			}
		}
		return list;
	}
	
	

	
	
	public boolean insertPlayer(PlayerDTO playerDTO) {
		return playerRepository.save(ConverterPlayer.toEntity(playerDTO)) != null;
	}
	

//	public boolean updatePlayer(PlayerDTO playerDTO) {
//		return playerRepository.save(ConverterPlayer.toEntity(playerDTO)) != null;
//	}

	public void deletePlayerById(Integer id) {
		playerRepository.deleteById(id);
	}

	public List<PlayerDTO> findAllById(int id) {

		final List<PlayerDTO> list = ConverterPlayer.toListDTO(playerRepository.findAllById(id));
		return list;
	}

}
