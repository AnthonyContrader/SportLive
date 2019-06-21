package it.contrader.view.player;

import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;


public class PlayerInsertView {
	private int idcoach;
	private Request request;
	private String password;
	private String playertype;
	private String nickname;
	
	
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
		System.out.println("Inserisci id del coach:");
		idcoach = getInt();
		System.out.println("Inserisci password del giocatore:");
		password = getInput();
		System.out.println("Inserisci tipo di giocatore:");
		playertype = getInput();
		System.out.println("Inserire nickname del giocatore:");
		nickname = getInput();

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
		request.put("idcoach", idcoach);
		request.put("password", password);
		request.put("nickname",nickname);
		
		MainDispatcher.getInstance().callAction("Player", "doControl", request);

		
	}
}
