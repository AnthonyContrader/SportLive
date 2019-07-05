package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PlayerDTO;
import it.contrader.dto.UserDTO;
import it.contrader.services.PlayerService;
import it.contrader.services.UserService;

import java.util.List;


public class PlayerLoginController {
	
//	private final PlayerService playerService;
//	
//	@Autowired
//	public PlayerController (PlayerService playerService) {
//		this.playerService = playerService;
//	}
}
