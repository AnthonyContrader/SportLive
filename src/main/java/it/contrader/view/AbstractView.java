package it.contrader.view;

import java.util.Scanner;

public abstract class AbstractView implements View {

	private Scanner scanner;
	private Scanner intScanner;

	/**
	*Questo metodo � usato da tutti i controller che lo ereditano (non devono definirlo) estendendo questa classe
	*/
	public String getInput() {
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
