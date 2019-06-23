package it.contrader.view.parameters;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class ParametersUpdateView extends AbstractView{

	private Request request;
	
	private int id;
	private int idplayer;
	private int age;
	private int height;
	private double weight;
	private int gp;
	private int score;
	
	private final String mode = "UPDATE";
	
	public ParametersUpdateView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Parameters", null);
		}
	}
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserire id della sheda paremetro: ");
			id = getInt();
			System.out.println("Inserisci id del suo giocatore:");
			idplayer = Integer.parseInt(getInput());
			System.out.println("Inserire la nuova eta:");
			age = getInt();
			System.out.println("Inserire la nuova altezza:");
			height = getInt();
			System.out.println("Inserire il nuovo peso:");
			weight = getDouble();
			System.out.println("Inserire le nuove partite giocate:");
			gp = getInt();
			System.out.println("Inserire il nuovo punteggio:");
			score = getInt();
			
		} catch (Exception e) {
		}
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("idplayers", idplayer);
		request.put("age", age);
		request.put("height", height);
		request.put("weight", weight);
		request.put("gp", gp);
		request.put("score", score);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Parameters", "doControl", request);

	}
}
