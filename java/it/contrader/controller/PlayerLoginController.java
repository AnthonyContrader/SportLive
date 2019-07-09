package it.contrader.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PlayerDTO;
import it.contrader.services.PlayerService;

@Controller
@RequestMapping("/LogPlayer")
public class PlayerLoginController {
	
	private final PlayerService playerService;
	
	private HttpSession session;
	
	@Autowired
	public PlayerLoginController (PlayerService playerService) {
		this.playerService = playerService;
	}
	
	private void visualPlayer(HttpServletRequest request){
		List<PlayerDTO> allPlayer = this.playerService.getListaPlayerDTO();
		request.setAttribute("player", allPlayer);
	}
	
	
	@RequestMapping(value = "/PlayerHome", method = RequestMethod.GET)
	public String playerManagement(HttpServletRequest request) {
		visualPlayer(request);
		return "homeplayer";		
	}

	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		this.playerService.deletePlayerById(id);
		visualPlayer(request);
		return "homeplayer";
		
	}
	
	@RequestMapping(value = "/crea", method = RequestMethod.GET)
	public String insert(HttpServletRequest request) {
		visualPlayer(request);
		request.setAttribute("option", "insert");
		return "creaPlayer";
		
	}
	
	@RequestMapping(value = "/cercaPlayer", method = RequestMethod.GET)
	public String cercaPlayer(HttpServletRequest request) {

		final String content = request.getParameter("search");

		List<PlayerDTO> allPlayer = this.playerService.findPlayerDTOByNickname(content);
		request.setAttribute("allPlayerDTO", allPlayer);

		return "homeUser";

	}
	
	@RequestMapping(value = "/creaPlayer", method = RequestMethod.POST)
	public String insertPlayer(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id").toString());
		Integer idPlayer = Integer.parseInt(request.getParameter("idPlayer").toString());
		String nickname = request.getParameter("nickname").toString();
		String password = request.getParameter("password").toString();
		String playertype = request.getParameter("playertype").toString();
		Integer score = Integer.parseInt(request.getParameter("score").toString());
		

		PlayerDTO playerObj = new PlayerDTO(id, idPlayer, nickname, password, playertype, score);
		
		playerService.insertPlayer(playerObj);

		visualPlayer(request);
		return "homePlayer";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginControl(HttpServletRequest request) {
		

		session = request.getSession();
		final String nickname = request.getParameter("nickname");
		final String password = request.getParameter("password");
		final PlayerDTO playerDTO = playerService.getByNicknameAndPassword(nickname, password);
		final Integer id = playerDTO.getId();
		final Integer idPlayer = playerDTO.getIdPlayer();
		final Integer score = playerDTO.getScore();
		final String playertype = playerDTO.getPlayertype();
		
		playerDTO.setId(id);
		playerDTO.setIdPlayer(idPlayer);
		playerDTO.setNickname(nickname);
		playerDTO.setPassword(password);
		playerDTO.setPlayertype(playertype);
		playerDTO.setScore(score);

		
		System.out.println(playerDTO.getScore());
		
		if (!StringUtils.isEmpty(id)) {
			session.setAttribute("utenteCollegato", playerDTO);
			if (!id.equals(null)||id != 0) {
				
				return "RealHomePlayer";
			}
			else {
				return "/playerLogin.jsp";
			}
		}
		return "/playerLogin.jsp";
	}
}
