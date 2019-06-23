package it.contrader.view.parameters;

import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.dto.ParametersDTO;
import it.contrader.main.MainDispatcher;

public class ParametersReadView {

	private int id;
	private int idplayer;
	private int age;
	private int height;
	private double weight;
	private int gp;
	private int score;
	private Request request;
	private final String mode = "READ";
	
	private Scanner scanner;
	
	public ParametersReadView() {
	}
	
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("siamo arrivati nel showresult");
			ParametersDTO parameters = (ParametersDTO) request.get("parameters");
			System.out.println(parameters);
			MainDispatcher.getInstance().callView("Parameters", null);
		}
	}
	
	public void showOptions() {
		System.out.println("Inserisci l'ID dell'utente:");
		id = Integer.parseInt(getInput());
	}
	
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("idplayer", idplayer);
		request.put("age", age);
		request.put("height", height);
		request.put("weight", weight);
		request.put("gp", gp);
		request.put("score", score);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Parameters", "doControl", request);
	}
	
	public String getInput() {
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}

	

