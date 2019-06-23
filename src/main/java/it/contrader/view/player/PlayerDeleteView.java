package it.contrader.view.player;

import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class PlayerDeleteView extends AbstractView {
	private Request request;
	
	private int id;
	private Scanner intScanner;
	private final String mode = "DELETE";
	
	private int getInt() {
		intScanner = new Scanner(System.in);
		return intScanner.nextInt();
	}
	
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
		id = getInt();
	}

	
		// TODO Auto-generated method stub

		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Player", "doControl", request);
		}		
	}
	