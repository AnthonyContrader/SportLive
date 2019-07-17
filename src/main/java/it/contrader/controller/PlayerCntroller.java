package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.dto.PlayerLoginDTO;
import it.contrader.dto.PlayerDTO;
import it.contrader.service.PlayerService;

@RestController
@RequestMapping("/player")
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerCntroller extends AbstractController <PlayerDTO>{

	@Autowired
	private PlayerService playerService;
	
	@PostMapping(value = "/readPlayerData")
	public PlayerDTO readPlayerData( @RequestBody PlayerLoginDTO playerLoginDTO) {
		return playerService.findByPlayername(playerLoginDTO.getPlayername());
	}
	
}
