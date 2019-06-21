package it.contrader.view.player;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class PlayerUpdateView extends AbstractView {
		private Request request;
		
		private int id;
		private int idcoach;
		private String password;
		private String playertype;
		private String nickname;
		private final String mode = "UPDATE";

		public PlayerUpdateView() {
		}

		public void showResults(Request request) {
			if (request!=null) {
				System.out.println("Modifica andata a buon fine.\n");
				MainDispatcher.getInstance().callView("Player", null);
		}
}		
		@Override
		public void showOptions() {
			try {
				System.out.println("Inserire id del giocatore: ");
				id = Integer.parseInt(getInput());
				System.out.println("Inserisci id del coach:");
				idcoach = Integer.parseInt(getInput());
				System.out.println("Inserisci password del giocatore:");
				password = getInput();
				System.out.println("Inserisci tipo di giocatore:");
				playertype = getInput();
				System.out.println("Inserisci nickname del giocatore:");
				nickname = getInput();
				
			} catch (Exception e) {
			}
		}
		
		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("idcoach", idcoach);
			request.put("playertype", playertype);
			request.put("password", password);
			request.put ("nickname", nickname);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Player", "doControl", request);
		}

	}
		
		

