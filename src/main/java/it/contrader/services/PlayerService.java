package it.contrader.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterPlayer;
import it.contrader.dao.PlayerRepository;
import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;

@Service
public class PlayerService {
	
	private final PlayerRepository playerRepository;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<PlayerDTO> getListaPlayerDTO() {
		return ConverterPlayer.toListDTO((List<Player>) playerRepository.findAll());
	}

	public PlayerDTO getPlayerDTOById(Integer id) {
		return ConverterPlayer.toDTO(playerRepository.findById(id).get());
	}

	public boolean insertPlayer(PlayerDTO playerDTO) {
		return playerRepository.save(ConverterPlayer.toEntity(playerDTO)) != null;
	}

	public boolean updatePlayer(PlayerDTO playerDTO) {
		return playerRepository.save(ConverterPlayer.toEntity(playerDTO)) != null;
	}
	
	public void deletePlayerById(Integer id) {
		playerRepository.deleteById(id);
	}
	
}
