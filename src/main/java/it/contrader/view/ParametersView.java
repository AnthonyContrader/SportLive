package it.contrader.view;

import java.util.List;
import it.contrader.controller.Request;
import it.contrader.dto.ParametersDTO;
import it.contrader.main.MainDispatcher;

public class ParametersView extends AbstractView {

	private Request request;
	private String choice;
	
	public ParametersView() {
	}

	public void showResults(Request request) {
		if (request != null) {
		System.out.println("\n------------------- Gestione utenti ----------------\n");
		System.out.println("ID\tUsername\tPassword\tTipo Utente");
		System.out.println("----------------------------------------------------\n");
		
		@SuppressWarnings("unchecked")
		List<ParametersDTO> parameters = (List<ParametersDTO>) request.get("parameters");
		for (ParametersDTO u: parameters)
			System.out.println(u);
		System.out.println();
		}
	}

	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choice = getInput();

		
	}

	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Parameters", "doControl", this.request);
	}

}

