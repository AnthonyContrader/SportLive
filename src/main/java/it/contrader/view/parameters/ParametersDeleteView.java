package it.contrader.view.parameters;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class ParametersDeleteView extends AbstractView {
private Request request;
	
	private int id;
	private int idplayer;
	private int age;
	private int height;
	private double weight;
	private int gp;
	private int score;
	private final String mode = "DELETE";
	
	public ParametersDeleteView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Parameters", null);
 }
}
	public void showOptions() {
		System.out.println("Inserisci id dell'utente:");
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
	}
	
