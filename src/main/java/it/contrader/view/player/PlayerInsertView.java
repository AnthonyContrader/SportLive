package it.contrader.view.player;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;


public class PlayerInsertView extends AbstractView{
	private Request request;
	
	private int idcoach;
	private String playertype;
	private String password;
	private String nickname;
	private final String mode = "INSERT";

	public PlayerInsertView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Player", null);
		}
	}
	public void showOptions() {
		System.out.println("Inserisci id del coach:");
		idcoach = getInt();
		System.out.println("Inserisci tipo di giocatore:");
		playertype = getInput();
		System.out.println("Inserisci password del giocatore:");
		password = getInput();
		System.out.println("Inserire nickname del giocatore:");
		nickname = getInput();
}
	
	public void submit() {
		request = new Request();
		request.put("idcoach", idcoach);
		request.put("playertype", playertype);
		request.put("password", password);
		request.put("nickname",nickname);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Player", "doControl", request);	
	}
}
