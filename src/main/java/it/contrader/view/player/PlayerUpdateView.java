package it.contrader.view.player;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class PlayerUpdateView extends AbstractView {
		private Request request;
		
		private String password;
		private String playertype;
		private String name;
		private String surname;
		private int id;
		private int idcoach;
		private int height;
		private int age;
		private int pr;
		private int gf;
		private int gs;
		private int min;
		private double weight;
		private double kmp;
		private final String mode = "UPDATE";

		public PlayerUpdateView() {
		}

		public void showResults(Request request) {
			if (request!=null) {
				System.out.println("Modifica andata a buon fine.\n");
				MainDispatcher.getInstance().callView("Player", null);
		}
}		
		
		public void showOptions() {
			try {
				System.out.println("Inserisci id del giocatore:");
				id = Integer.parseInt(getInput());
				System.out.println("Inserisci id del coach:");
				idcoach = Integer.parseInt(getInput());
				System.out.println("Inserisci password del giocatore:");
				password = getInput();
				System.out.println("Inserisci tipo di giocatore:");
				playertype = getInput();
				System.out.println("Inserisci nome del giocatore:");
				name = getInput();
				System.out.println("Inserisci cognome del giocatore:");
				surname = getInput();
				System.out.println("Inserisci altezza del giocatore:");
				height = Integer.parseInt(getInput());
				System.out.println("Inserisci peso del giocatore:");
				weight = Double.parseDouble(getInput());
				System.out.println("Inserisci età del giocatore:");
				age = Integer.parseInt(getInput());		
				System.out.println("Inserisci passaggi riusciti del giocatore:");
			    pr = Integer.parseInt(getInput());
			    System.out.println("Inserisci gol fatti dal giocatore:");
			    gf = Integer.parseInt(getInput());
			    System.out.println("Inserisci gol subiti dal giocatore:");
			    gs = Integer.parseInt(getInput());
			    System.out.println("Inserisci km percorsi dal giocatore:");
			    kmp = Double.parseDouble(getInput());
			    System.out.println("Inserisci minuti di gioco:");
			    min = Integer.parseInt(getInput());
			} catch (Exception e) {

			}
		}
		
		public void submit() {
			request = new Request();
			request.put("id", id);
			request.put("idcoach", idcoach);
			request.put("password", password);
			request.put("playetype", playertype);
			request.put ("name", name);
			request.put("surname", surname);
			request.put("height", height);
			request.put("age", age);
			request.put("pr", pr);
			request.put("gf", gf);
			request.put("gs", gs);
			request.put("kmp", kmp);
			request.put("min", min);
			request.put("mode", mode);
			MainDispatcher.getInstance().callAction("Player", "doControl", request);
		}

	}
		
		

