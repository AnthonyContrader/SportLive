package it.contrader.view.player;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class PlayerDeleteView extends AbstractView {
	private Request request;
	
	private int id;
	private int idcoach;
	private final String mode = "DELETE";
	
	public PlayerDeleteView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Player", null);
 }
}
	public void showOptions() {
		System.out.println("Inserisci id dell'utente:");
		id = Integer.parseInt(getInput());
	}

	
		// TODO Auto-generated method stub

		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("idcoach", idcoach);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Player", "doControl", request);
		}		
	}
	