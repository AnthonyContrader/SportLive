package it.contrader.view.parameters;

	import java.util.Scanner;

import it.contrader.controller.Request;
	import it.contrader.main.MainDispatcher;
	import it.contrader.view.AbstractView;

	public class ParametersInsertView extends AbstractView{
		private Request request;

		private int idplayer;
		private int age;
		private int height;
		private double weight;
		private int gp;
		private int score;
		private final String mode = "INSERT";
		
		private Scanner scanner;
		private Scanner intScanner;
		private Scanner doubleScanner;
		
		
		private double getDouble() {
		
		doubleScanner = new Scanner(System.in);
		return doubleScanner.nextDouble();

		}

		
		public ParametersInsertView() {
		}
	
		
		public void showResults(Request request) {
			if (request!=null) {
				System.out.println("Inserimento andato a buon fine.\n");
				MainDispatcher.getInstance().callView("Parameters", null);
			}
		}

		public void showOptions() {
				System.out.println("Inserisci id del giocatore:");
				idplayer = getInt();
				System.out.println("Inserisci età del giocatore:");
				age = getInt();
				System.out.println("Inserisci altezza del giocatore:");
				height = getInt();
				System.out.println("Inserisci peso del giocatore:");
				weight = getDouble();
				System.out.println("Inserisci numero di partite giocate dal giocatore:");
				gp = getInt();
				System.out.println("Inserisci la valutazione del giocatore:");
				score = getInt();
				
		}

		private int getInt() {
			intScanner = new Scanner(System.in);
			return intScanner.nextInt();
		}
		public String getInput() {
			scanner = new Scanner(System.in);
			return scanner.nextLine();
		}
		
		public void submit() {
			request = new Request();
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

