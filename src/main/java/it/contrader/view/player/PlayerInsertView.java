package it.contrader.view.player;

import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;


public class PlayerInsertView {
	
	private Request request;
	private String username;	
	private String password;
	private String name;
	private String surname;
	private int height;			//altezza
	private int age;			//eta
	private int pr;				//passaggi rusciti
	private int gf;				//gol fatti
	private int gs;				//gol subiti
	private int min;			//minuti di gioco
	private double weight;		//peso in kg
	private double kmp;			//chilometri percorsi
	
	private final String mode = "INSERT";
	
	private Scanner scanner;
	private Scanner intScanner;
	private Scanner doubleScanner;
	
	public PlayerInsertView() {
	}
	
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Player", null);
		}
	}
	public void showOptions() {
		System.out.println("Inserisci username del giocatore:");
		username = getInput();
		System.out.println("Inserisci password del giocatore:");
		password = getInput();
		System.out.println("Inserire nome del giocatore:");
		name = getInput();
		System.out.println("Inserire cognome giocatore:");
		surname = getInput();
		System.out.println("Inserire eta giocatore:");
		age = getInt();
		System.out.println("Inserire altezza giocatore:");
		height = getInt();
		System.out.println("Inserire perso del giocatore:");
		weight = getDouble();
		System.out.println("/n/nInserimento dati statistici/n/n");
		System.out.println("Inserire passaggi riusciti del giocatore:");
		pr = getInt();
		System.out.println("Inserire gol fatti dal giocatore:");
		gf = getInt();
		System.out.println("Inserire gol subiti del giocatore:");
		gs = getInt();
		System.out.println("Inserire km percorsi dal giocatore:");
		kmp = getDouble();
		System.out.println("Inserire minuti di gioco:");
		min = getInt();

}

	private int getInt() {
		intScanner = new Scanner(System.in);
		return intScanner.nextInt();
	}
	private double getDouble() {
		doubleScanner = new Scanner(System.in);
		return doubleScanner.nextDouble();
	}

	public String getInput() {
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public void submit() {
		request = new Request();
		request.put("username", username);
		request.put("password", password);
		request.put("name",name);
		request.put("surname", surname);
		request.put("age", age);
		request.put("height", height);
		request.put("weight", weight);
		request.put("pr", pr);
		request.put("gf", gf);
		request.put("gs", gs);
		request.put("kmp", kmp);
		request.put("min", min);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Player", "doControl", request);

		
	}
}
