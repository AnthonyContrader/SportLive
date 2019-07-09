package it.contrader.controller;

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
		request.setAttribute("allPlayerDTO", allPlayer);
	}
	
	
	@RequestMapping(value = "/PlayerHome", method = RequestMethod.GET)
	public String playerManagement(HttpServletRequest request) {
		visualPlayer(request);
		return "homeplayer";		
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginControl(HttpServletRequest request) {
		
		System.out.println("Sono nel login player");

		session = request.getSession();
		final String nickname = request.getParameter("nickname");
		final String password = request.getParameter("password");
		final PlayerDTO playerDTO = playerService.getByNicknameAndPassword(nickname, password);
		final String id = playerDTO.getId().toString();
		if (!StringUtils.isEmpty(id)) {
			session.setAttribute("utenteCollegato", playerDTO);
			if (!id.equals(null)) {
				return "homeplayer";
			}
			else {
				return "/playerLogin.jsp";
			}
		}
		return "/playerLogin.jsp";
	}
}
