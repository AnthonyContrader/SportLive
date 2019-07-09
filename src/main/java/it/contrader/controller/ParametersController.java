package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import it.contrader.dto.ParametersDTO;
import it.contrader.services.ParametersService;

import org.springframework.stereotype.Controller;


import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@Controller
@RequestMapping("/Parametres")
public class ParametersController {

	private final ParametersService parametersService;
	private HttpSession session;

	@Autowired
	public ParametersController(ParametersService parametersService) {
		this.parametersService = parametersService;
	}

	@RequestMapping(value = "/parametersManagement", method = RequestMethod.GET)
	public String parametersManagement(HttpServletRequest request) {
		request.setAttribute("parameters", getParameters());
		return "parameters/parametersManagement";
	}

	public List<ParametersDTO> getParameters() {
		List<ParametersDTO> tmp = parametersService.getListaParametersDTO();
		List<ParametersDTO> parametersList = new ArrayList<>();
		for (ParametersDTO parameters : tmp) {
			if (parameters.getId() == 0) {
				parametersList.add(parameters);
			}
		}

		return parametersList;
	}

	@RequestMapping(value = "/deleteParameters", method = RequestMethod.GET)
	public String deleteParameters(HttpServletRequest request) {
		int idParameters = Integer.parseInt(request.getParameter("id"));
		parametersService.deleteParametersById(idParameters);
		request.setAttribute("reading", getParameters());
		return "reading/readingManagement";
	}

//	@RequestMapping(value = "/redirectUpdate", method = RequestMethod.GET)
//	public String redirectUpdate(HttpServletRequest request) {
//		int idReading = Integer.parseInt(request.getParameter("id"));
//		ReadingDTO reading = readingService.getReadingDTOById(idReading);
//		request.setAttribute("reading", reading);
//		return "updateReading";
//	}
//	
//	@RequestMapping(value = "/updateReading", method = RequestMethod.POST)
//	public String updateReading(HttpServletRequest request)
//	{
//		int idUpdate = Integer.parseInt(request.getParameter("id"));
//		String patcfUpdate = request.getParameter("patcf");
//		String regdevUpdate = request.getParameter("regdev");
//		int minpressUpdate =  Integer.parseInt(request.getParameter("minpress"));
//		int maxpressUpdate =  Integer.parseInt(request.getParameter("maxpress"));
//		int mincirUpdate =  Integer.parseInt(request.getParameter("mincir"));
//		int maxcirUpdate =  Integer.parseInt(request.getParameter("maxcir"));
//		int minbreathUpdate =  Integer.parseInt(request.getParameter("minbreath"));
//		int maxbreathUpdate =  Integer.parseInt(request.getParameter("maxbreath"));
//		float mintempUpdate =  Float.parseFloat(request.getParameter("mintemp"));
//		float maxtempUpdate =  Float.parseFloat(request.getParameter("maxtemp"));
//		Date periodUpdate = Date.from();
//		
//		final ReadingDTO reading = new ReadingDTO(patcfUpdate,regdevUpdate,minpressUpdate,maxpressUpdate, mincirUpdate,maxcirUpdate, minbreathUpdate, maxbreathUpdate,mintempUpdate,maxtempUpdate,periodUpdate);
//		reading.setId(idUpdate);
//		
//		readingService.updateReading(reading);
//		request.setAttribute("reading", getReadings());
//		return "readingManagement";	
//		
//	}

	@RequestMapping(value = "/insertReading", method = RequestMethod.POST)
	public String insertParameters(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));
		int idPlayer = Integer.parseInt(request.getParameter("idPlayer"));
		int data = Integer.parseInt(request.getParameter("data"));
		int age = Integer.parseInt(request.getParameter("age"));
		int height = Integer.parseInt(request.getParameter("height"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		int gol = Integer.parseInt(request.getParameter("gol"));
		int gp = Integer.parseInt(request.getParameter("gp"));
		int mp = Integer.parseInt(request.getParameter("mp"));


		ParametersDTO parametersDTO = new ParametersDTO(id, idPlayer, data, age, height, weight, gol, gp, mp);

		parametersService.insertParameters(parametersDTO);

		request.setAttribute("parameters", getParameters());

		return "reading/readingManagement";
	}

//		@RequestMapping(value = "/logout", method = RequestMethod.GET)
//		public void logOut() {
//			// request.getSession().invalidate();
//			// return "index";
//		}
	
}