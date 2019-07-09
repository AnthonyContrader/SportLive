package it.contrader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterPlayer;
import it.contrader.converter.ConverterPlayer;
import it.contrader.dao.PlayerRepository;
import it.contrader.dao.PlayerRepository;
import it.contrader.dto.PlayerDTO;
import it.contrader.dto.PlayerDTO;
import it.contrader.model.Player;
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

	public PlayerDTO getPlayerByNicknameAndPassword(String nickname, String password) {

		final Player player = playerRepository.findUserByNicknameAndPassword(nickname, password);

		return ConverterPlayer.toDTO(player);
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
	
	public List<PlayerDTO> findAllPlayerByNickname(String nickname) {
		
		final List<Player> list = playerRepository.findAllByNickname(nickname);
		final List<PlayerDTO> playerDTOs = new ArrayList<>();
		list.forEach(i -> playerDTOs.add(ConverterPlayer.toDTO(i)));
		return playerDTOs;
		
	
	}
	

}
