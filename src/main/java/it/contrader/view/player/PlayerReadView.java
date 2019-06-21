package it.contrader.view.player;

import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.dto.PlayerDTO;
import it.contrader.main.MainDispatcher;

public class PlayerReadView {

	private int id;
	private int idcoach;
	private Request request;
	private final String mode = "READ";
	
	private Scanner scanner;
	
	public PlayerReadView() {
	}
	
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("siamo arrivati nel showresult");
			PlayerDTO player = (PlayerDTO) request.get("player");
			System.out.println(player);
			MainDispatcher.getInstance().callView("Player", null);
		}
	}
	
	public void showOptions() {
		System.out.println("Inserisci l'ID dell'utente:");
		id = Integer.parseInt(getInput());
	}
	
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("idcoach", idcoach);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("User", "doControl", request);
	}
	
	public String getInput() {
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
