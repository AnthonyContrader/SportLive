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
import it.contrader.dto.ParametersDTO;
import it.contrader.services.ParametersService;

import java.util.List;


@Controller
@RequestMapping("/Parameters")
public class ParametersController {
	
private final ParametersService parametersService;
	
	private HttpSession session;
	
	@Autowired
	public ParametersController(ParametersService ParametersService) {
		this.parametersService = ParametersService;
	}
	
	private void visualParameters(HttpServletRequest request){
		List<ParametersDTO> allParameters = this.parametersService.getListaParametersDTO();
		request.setAttribute("allParametersDTO", allParameters);
	}
	
	@RequestMapping(value = "/parametersManagement", method = RequestMethod.GET)
	public String parametersManagement(HttpServletRequest request) {
		visualParameters(request);
		return "homeParameters";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		this.parametersService.deleteParametersByIdPlayer(id);
		visualParameters(request);
		return "homeParameters";
		
	}
	
	@RequestMapping(value = "/crea", method = RequestMethod.GET)
	public String insert(HttpServletRequest request) {
		visualParameters(request);
		request.setAttribute("option", "insert");
		return "creaParameters";
		
	}
	
	@RequestMapping(value = "/cercaParameters", method = RequestMethod.GET)
	public String cercaParameters(HttpServletRequest request) {

		final String content = request.getParameter("search");

		List<ParametersDTO> allParameters = this.parametersService.findParametersDTOByUsername(content);
		request.setAttribute("allParametersDTO", allParameters);

		return "homeParameters";

	}
	
	@RequestMapping(value = "/creaParameters", method = RequestMethod.POST)
	public String insertParameters(HttpServletRequest request) {
		int idplayer = Integer.parseInt(request.getParameter("idplayer"));
		int data = Integer.parseInt(request.getParameter("data"));
		int age = Integer.parseInt(request.getParameter("age"));
		int height = Integer.parseInt(request.getParameter("height"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		int gol = Integer.parseInt(request.getParameter("gol"));
		int gp = Integer.parseInt(request.getParameter("gp"));
		int mp = Integer.parseInt(request.getParameter("mp"));

		ParametersDTO parametersObj = new ParametersDTO(idplayer, data, age, height, weight, gol, gp, mp);
		
		parametersService.insertParameters(parametersObj);

		visualParameters(request);
		return "homeParameters";
	}
	
					
}
