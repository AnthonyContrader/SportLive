package it.contrader.view.player;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class PlayerParametersInsertView extends AbstractView {
	private Request request;
	
	private int age;
	private int height;
	private double weight;
	private int gp;
	private int score;
	
	private final String mode = "UPDATE_ONLY_PARAMETERS";
	
	public PlayerParametersInsertView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento dei parametri è andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Player", null);
		}
	}
	
	public void showOptions() {
		System.out.println("Inserisci l'eta:");
		age = getInt();
		System.out.println("Inserisci l'altezza:");
		height = getInt();
		System.out.println("Inserirci il peso:");
		weight = getDouble();
		System.out.println("inserire partitte giocate:");
		gp = getInt();
		
		score = age * gp;
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("age", age);
		request.put("height", height);
		request.put("weight", weight);
		request.put("gp", gp);
		request.put("score", score);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Player", "doControl", request);	

	}
}
