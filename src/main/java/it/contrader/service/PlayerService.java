package it.contrader.service;

import org.springframework.stereotype.Service;

import it.contrader.dao.PlayerRepository;
import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;

@Service
public class PlayerService extends AbstractService<Player, PlayerDTO> {

	public PlayerDTO findByPlayername(String playername) {
		return converter.toDTO(((PlayerRepository) repository).findByPlayername(playername));
	}

	public PlayerDTO findByPlayernameAndPassword(String playername, String password) {
		return converter.toDTO(((PlayerRepository) repository).findByPlayernameAndPassword(playername, password));
	}
}
