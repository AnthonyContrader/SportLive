package it.contrader.view;


import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeUserView extends AbstractView{

	String choice;

	@Override
	public void showResults(Request request) {
		System.out.println("\n-----Purtroppo in questo sample l'utente non puà fare nulla, ci scusiamo per il disagio.-----");

	}

	@Override
	public void showOptions() {
		System.out.println("-------------MENU------------\n");
		System.out.println("[L] Player list [A] Add new player [G] Generate the team [E] Exit");
		choice = this.getInput();
		
		/**
		 * Le opzioni del coach:
		 * 
		 * visualizzare lista player
		 * modificare lista player o visualizzare caratteristiche player
		 * creare nuovo player
		 * generare la formazione 
		 * uscire
		 */

	}

	@Override
	public void submit() {

		switch (choice) {

		case "e":
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
			break;
		case "a":
			//TODO aggiungere un nuovo player
			MainDispatcher.getInstance().callView("player.PlayerInsert",  null);

			break;
		case "g":
			//TODO genera nuovo player
			break;
		case "l":
			//TODO visualizza lista player

		default:
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
		}
	}

}
