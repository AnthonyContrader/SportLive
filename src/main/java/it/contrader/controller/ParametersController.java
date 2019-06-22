package it.contrader.controller;

import java.util.List;

import it.contrader.dto.ParametersDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.ParametersService;

public class ParametersController implements Controller {
	
	private static String sub_package = "parameters.";
	
	private ParametersService parametersService;
	
	public ParametersController() {
		this.parametersService = new ParametersService();
	}

public void doControl(Request request) {

		String mode = (String) request.get("mode");
		
		String choice = (String) request.get("choice");

		
		int id;
		int idplayer;
		int age;
		int height;
		double weight;
		int gp;
		int score;

		switch (mode) {
		

		case "READ":
			id = Integer.parseInt(request.get("id").toString());
			ParametersDTO parametersDTO = parametersService.read(id);
			request.put("parameters", parametersDTO);
			MainDispatcher.getInstance().callView(sub_package + "UserRead", request);
			break;
		
		
		case "INSERT":
			id = Integer.parseInt(request.get("id").toString());
			idplayer = Integer.parseInt(request.get("idplayer").toString());
			age = Integer.parseInt(request.get("age").toString());
			height = Integer.parseInt(request.get("height").toString());
			weight = Double.parseDouble(request.get("weight").toString());
			gp = Integer.parseInt(request.get("gp").toString());
			score = Integer.parseInt(request.get("score").toString());
			
			ParametersDTO parameterstoinsert = new ParametersDTO(id,idplayer, age, height, (int) weight, gp, score);
			
			parametersService.insert(parameterstoinsert);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "ParametersInsert", request);
			break;
		
		
		case "DELETE":
			id = Integer.parseInt(request.get("id").toString());
			
			parametersService.delete(id);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "ParametersDelete", request);
			break;
		
	
		case "UPDATE":
			id = Integer.parseInt(request.get("id").toString());
			idplayer = Integer.parseInt(request.get("idplayer").toString());
			age = Integer.parseInt(request.get("age").toString());
			height = Integer.parseInt(request.get("height").toString());
			weight = Double.parseDouble(request.get("weight").toString());
			gp = Integer.parseInt(request.get("gp").toString());
			score = Integer.parseInt(request.get("score").toString());
			ParametersDTO parameterstoupdate = new ParametersDTO(id, idplayer, age, height, (int)weight, gp, score);
			parameterstoupdate.setId(id);
			parametersService.update(parameterstoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "ParametersUpdate", request);
			break;
			
			
		case "PARAMETERSLIST":
			List<ParametersDTO> parameterDTO = parametersService.getAll();
			request.put("parameters", parameterDTO);
			MainDispatcher.getInstance().callView("Parameters", request);
			break;
		
			
		case "GETCHOICE":
					
			
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "ParametersRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "ParametersInsert", null);
				break;
				
			case "M":
				MainDispatcher.getInstance().callView(sub_package + "ParametersUpdate", null);
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "ParametersDelete", null);
				break;
				
			case "E":
				MainDispatcher.getInstance().callView("Login", null);
				break;

			case "B":
				MainDispatcher.getInstance().callView("HomePlayer", null);
				break;
				
			default:
				MainDispatcher.getInstance().callView("Login", null);
			}
			
		default:
			MainDispatcher.getInstance().callView("Login", null);
		}
	}
}

		
