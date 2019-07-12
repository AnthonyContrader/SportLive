package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.services.PlayerService;
import it.contrader.services.UserService;

@CrossOrigin
@Controller
@RequestMapping("/player")
public class PlayerController {

	private final PlayerService playerService;
	private final UserService userService;

	@Autowired
	public PlayerController(PlayerService playerService, UserService userService) {
		this.playerService = playerService;
		this.userService = userService;
	}

	@RequestMapping(value = "/playerManagement", method = RequestMethod.POST)
	public String listByCoach(HttpServletRequest request) throws Exception {
<<<<<<< HEAD
		String idParam = (String)request.getParameter("idCoach");
		System.out.println(idParam);
		if(StringUtils.isEmpty(idParam)) {
			throw new Exception("Param idCoach null");
		}
		int idCoach = Integer.parseInt(idParam);
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(idCoach));
		return "player/playerDetayl";
=======
		UserDTO userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(userDTO.getId()));
		request.setAttribute("viewParam", "list");
		return "player/playerManagement";
>>>>>>> 5c16f9175a6b62a940b0d7fd072ae2d19b7cc4d7
	}

	@RequestMapping(value = "/deletePlayer", method = RequestMethod.GET)
	public String deletePlayer(HttpServletRequest request) {
		int idPlayer = Integer.parseInt(request.getParameter("id"));
		playerService.deletePlayerById(idPlayer);
		UserDTO userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(userDTO.getId()));
		request.setAttribute("viewParam", "list");
		return "homeCoach";
	}

	@RequestMapping(value = "/redirectUpdate", method = RequestMethod.GET)
	public String redirectUpdate(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("playerDTO", playerService.getPlayerDTOById(id));
		request.setAttribute("viewParam", "update");
		return "homeCoach";
	}

	@RequestMapping(value = "/updatePlayer", method = RequestMethod.POST)
	public String updatePlayer(@Valid @ModelAttribute("player") PlayerDTO playerDTO, HttpServletRequest request) {
//		final PlayerDTO playerDTO = (PlayerDTO) request.getAttribute("playerDTO");
		playerService.updatePlayer(playerDTO);
		UserDTO userDTO = userService.getUserDTOById(playerDTO.getUserPlayer().getId());
		userDTO.setName(playerDTO.getUserPlayer().getName());
		userDTO.setSurname(playerDTO.getUserPlayer().getSurname());
		userService.updateUser(userDTO);
		
		userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(userDTO.getId()));
		request.setAttribute("viewParam", "list");
		return "homeCoach";
	}

	@RequestMapping(value = "/redirectInsert", method = RequestMethod.GET)
	public String redirectInsert(HttpServletRequest request) {
		request.setAttribute("playerDTO", new PlayerDTO());
		request.setAttribute("viewParam", "insert");
		return "homeCoach";
	}

	@RequestMapping(value = "/insertPlayer", method = RequestMethod.POST)
	public String insertPlayer(HttpServletRequest request) {
		final PlayerDTO playerDTO = (PlayerDTO) request.getAttribute("playerDTO");
		playerService.updatePlayer(playerDTO);
		UserDTO userDTO = (UserDTO) request.getSession().getAttribute("utenteCollegato");
		request.setAttribute("listPlayer", playerService.getListaPlayerDTOByIdCoach(userDTO.getId()));
		request.setAttribute("viewParam", "list");
		return "insertPlayer";
	}
}