package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.services.PlayerService;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/Player")
public class PlayerController {

	private final PlayerService playerService;
	private HttpSession session;

	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@RequestMapping(value = "/playerManagement", method = RequestMethod.GET)
	public String playerManagement(HttpServletRequest request) {
		request.setAttribute("player", getPlayer());
		return "player/playerManagement";
	}

	public List<PlayerDTO> getPlayer() {
		List<PlayerDTO> tmp = playerService.getListaPlayerDTO();
		List<PlayerDTO> playerList = new ArrayList<>();
		for (PlayerDTO player : tmp) {
			if (player.getId() ==0) {
				playerList.add(player);
			}
		}

		return playerList;
	}

	@RequestMapping(value ="/deletePlayer", method = RequestMethod.GET)
	public String deletePlayer(HttpServletRequest request) {
		int idPlayer = Integer.parseInt(request.getParameter("id"));
		playerService.deletePlayerById(idPlayer);
		request.setAttribute("player", getPlayer());
		return "player/playerManagement";
	}
	
	@RequestMapping(value = "/redirectUpdate", method = RequestMethod.GET)
	public String redirectUpdate(HttpServletRequest request) {
		int idPlayer = Integer.parseInt(request.getParameter("id"));
		PlayerDTO player = playerService.getPlayerDTOById(idPlayer);
		request.setAttribute("player", player);
		return "player/updatePlayer";
	}
	
	@RequestMapping(value = "/updatePlayer", method = RequestMethod.POST)
	public String updatePlayer(HttpServletRequest request)
	{
		int idUpdate = Integer.parseInt(request.getParameter("id"));
		int IdPlayer = Integer.parseInt(request.getParameter("idplayer"));
		String nicknameUpdate = request.getParameter("nickname");
		String passwordUpdate = request.getParameter("password");
		String playertypeUpdate = request.getParameter("playertype");
		int scoreUpdate = Integer.parseInt(request.getParameter("score"));
		
		
		final PlayerDTO player = new PlayerDTO(idUpdate,IdPlayer,nicknameUpdate,passwordUpdate,playertypeUpdate,scoreUpdate);
		player.setId(idUpdate);
		
		playerService.updatePlayer(player);
		request.setAttribute("user", getPlayer());
		return "player/playerManagement";	
	 }
	}