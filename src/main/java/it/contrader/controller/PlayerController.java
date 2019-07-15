package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PlayerDTO;
import it.contrader.enumerators.PlayerType;
import it.contrader.services.PlayerService;

import org.springframework.stereotype.Controller;

@CrossOrigin
@Controller
@RequestMapping("/Player")
public class PlayerController {

//	private final UserService userService;
	private final PlayerService playerService;
//	private final DeviceService deviceService;
//	private final ParametersService parametersService;
	
	private HttpSession session;

//	@Autowired
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}
	
	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}
	
//	@Autowired
//	public DeviceController(DeviceService deviceService) {
//		this.deviceService = deviceService;
//	}
//	
//	@Autowired
//	public ParametersController(ParametersService parametersService) {
//		this.parametersService = parametersService;
//	}

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
	
	@RequestMapping(value = "/allPlayerList", method = RequestMethod.POST)
	public String listOfPalyer(HttpServletRequest request) throws Exception {
		System.out.println();
		String idParam = (String)request.getParameter("idCoach");
		System.out.println(idParam);
		if(StringUtils.isEmpty(idParam)) {
			throw new Exception("Param idCoach null");
		}
		int idCoach = Integer.parseInt(idParam);
		request.setAttribute("allPlayerList", playerService.getListaPlayerDTOByIdCoach(idCoach));
		return "player/playerManagement";
	}

	@RequestMapping(value ="/", method = RequestMethod.DELETE)
	public String deletePlayer(HttpServletRequest request) {
		int idPlayer = Integer.parseInt(request.getParameter("id"));
		playerService.deletePlayerById(idPlayer);
		return "player/playerManagement";
	}
	
	@RequestMapping(value = "/insertPlayer", method =  RequestMethod.POST)
	public String insertPlayer(HttpServletRequest request)
	{
		
		//tabella player
		
	

		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String password = request.getParameter("password");
		String playertype = request.getParameter("playerType");
		int idCoach = Integer.parseInt(session.getId());			//prende l'id del Cocach collegato
		int score = Integer.parseInt(request.getParameter("score"));	//da sostituire con il calcolo dello score
		
		
//		//tabella user
//		
//		String name= request.getParameter("name");
//		String surname= request.getParameter("surname");
//		String password= request.getParameter("password");
//		
//		//tabella device
//		
//		int heartbeat = Integer.parseInt(request.getParameter("heartbeat"));
//		int pressure = Integer.parseInt(request.getParameter("pressure"));
//		int breath = Integer.parseInt(request.getParameter("breath"));
//		
//		//tabella parameters
//		
//		int age = Integer.parseInt(request.getParameter("age"));
//		int height = Integer.parseInt(request.getParameter("height"));
//		int weight = Integer.parseInt(request.getParameter("weight"));
//		int gol = Integer.parseInt(request.getParameter("gol"));
//		int gp = Integer.parseInt(request.getParameter("gp"));
//		int mp = Integer.parseInt(request.getParameter("mp"));
//
//		
//
//		final UserDTO userDTO = new UserDTO(username, password, UserType.valueOf("PLAYER"), name, surname);
		final PlayerDTO playerDTO = new PlayerDTO(username, name, surname, password,  PlayerType.valueOf(playertype), idCoach, score);
//		final DeviceDTO deviceDTO = new DeviceDTO();
//		final ParametersDTO parametersDTO = new ParametersDTO(age, height, null, weight, gol, gp, mp, mp, mp);
//		
////		userService.insertUser(userDTO);
			playerService.insertPlayer(playerDTO);
////		deviceService.insertDevice(deviceDTO);
////		parametersService.insertParameters(parametersDTO);
//		
////		request.setAttribute("user", userService.getListToAdmin());
//			request.setAttribute("palyer", playerService.getListToPlayer());
////		request.setAttribute("device", deviceService.getDeviceDTOById());
////		request.setAttribute("parameters", parametersService.getListToParameters());
		
		return "user/userManagement";		
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