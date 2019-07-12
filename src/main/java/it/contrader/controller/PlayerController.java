package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.services.PlayerService;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/player")
public class PlayerController {

	private final PlayerService playerService;
	private HttpSession session;

	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@RequestMapping(value = "/{id}")
	public String getPlayer(@PathVariable Integer id, HttpServletRequest request) {
		request.setAttribute("player", playerService.getPlayerDTOById(id));
		return "player/playerManagement";
	}

	@RequestMapping(value = "/playerManagement", method = RequestMethod.POST)
	public String listByCoach(HttpServletRequest request) throws Exception {
		String idParam = (String)request.getParameter("idCoach");
		System.out.println(idParam);
		if(StringUtils.isEmpty(idParam)) {
			throw new Exception("Param idCoach null");
		}
		int idCoach = Integer.parseInt(idParam);
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(idCoach));
		return "player/playerDetayl";
	}

	@RequestMapping(value ="/", method = RequestMethod.DELETE)
	public String deletePlayer(HttpServletRequest request) {
		int idPlayer = Integer.parseInt(request.getParameter("id"));
		playerService.deletePlayerById(idPlayer);
		return "player/playerManagement";
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
		
		
//		final PlayerDTO player = new PlayerDTO(idUpdate, username, playertype, idCoach, score);
//		player.setId(idUpdate);
//		
//		playerService.updatePlayer(player);
//		request.setAttribute("user", getPlayer());
		return "player/playerManagement";	
	 }
	}