package it.contrader.controller;

import java.util.List;

import it.contrader.dto.PlayerDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.PlayerService;

public class PlayerController implements Controller {

	private static String sub_package = "player.";

	private PlayerService playerService;

	public PlayerController() {
		this.playerService = new PlayerService();
	}

	public void doControl(Request request) {

		String mode = (String) request.get("mode");

		String choice = (String) request.get("choice");

		int id;
		int idcoach;
		String password;
		String playertype;
		String nickname;
		int age;
		int height;
		double weight;
		int gp;
		int score;

		switch (mode) {

		case "READ":
			id = Integer.parseInt(request.get("id").toString());
			PlayerDTO playerDTO = playerService.read(id);
			request.put("player", playerDTO);
			MainDispatcher.getInstance().callView(sub_package + "PlayerRead", request);
			break;
			
		case "INSERT":
			//id = Integer.parseInt(request.get("id").toString());
			idcoach = Integer.parseInt(request.get("idcoach").toString());
			password = request.get("password").toString();
			playertype = request.get("playertype").toString();
			nickname = request.get("nickname").toString();
			age = Integer.parseInt(request.get("age").toString());
			height = Integer.parseInt(request.get("height").toString());
			weight = Double.parseDouble(request.get("weight").toString());
			gp = Integer.parseInt(request.get("gp").toString());
			score = Integer.parseInt(request.get("score").toString());
			
			PlayerDTO playertoinsert = new PlayerDTO(idcoach, password, playertype, nickname, age, height, weight, gp, score);
		    
			playerService.insert(playertoinsert);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "PlayerInsert", request);
			break;
			
		case "DELETE":
			id = Integer.parseInt(request.get("id").toString());
			
		    playerService.delete(id);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "PlayerDelete", request);
			break;

			
		case "UPDATE":
			id = Integer.parseInt(request.get("id").toString());
			idcoach = Integer.parseInt(request.get("idcoach").toString());
			playertype = request.get("playertype").toString();
			password = request.get("password").toString();
			nickname = request.get("nickname").toString();
			age = Integer.parseInt(request.get("age").toString());
			height = Integer.parseInt(request.get("height").toString());
			weight = Double.parseDouble(request.get("weight").toString());
			gp = Integer.parseInt(request.get("gp").toString());
			score = Integer.parseInt(request.get("score").toString());

			PlayerDTO playertoupdate = new PlayerDTO(idcoach, password, playertype, nickname, age, height, weight, gp, score);
			playertoupdate.setId(id);
			playerService.update(playertoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "PlayerUpdate", request);
			break;
			
		case "PLAYERLIST":
			List<PlayerDTO> playersDTO = playerService.getAll();
			request.put("players", playersDTO);
			MainDispatcher.getInstance().callView("Player", request);
			break;
			
		case "GETCHOICE":

			switch (choice.toUpperCase()) {
			
			case "R":
				MainDispatcher.getInstance().callView(sub_package + "PlayerRead", null);
			
				break;

			case "I":
				MainDispatcher.getInstance().callView(sub_package + "PlayerInsert", null);
				break;

			case "M":
				MainDispatcher.getInstance().callView(sub_package + "PlayerUpdate", null);
				break;

			case "C":
				MainDispatcher.getInstance().callView(sub_package + "PlayerDelete", null);
				break;

			case "E":
				MainDispatcher.getInstance().callView("Login", null);
				break;

			case "B":
				MainDispatcher.getInstance().callView("HomeUser", null);
				break;

			default:
				System.out.println("cacca");
				MainDispatcher.getInstance().callView("Login", null);
			}

		default:
			System.out.println("merda");
			MainDispatcher.getInstance().callView("Login", null);

		}
	}
}
