package it.contrader.view;

import java.util.List;
import it.contrader.controller.Request;
import it.contrader.dto.PlayerDTO;
import it.contrader.main.MainDispatcher;

public class PlayerView extends AbstractView{

	private Request request;
	private String choice;

	
	public PlayerView() {}
	
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n----------------------------------------- Gestione player --------------------------\n");
			System.out.println("ID\tIDCoach\t\tPlayerType\tPassword\t\tNickName");
			System.out.println("--------------------------------------------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<PlayerDTO> player = (List<PlayerDTO>) request.get("players");
			for (PlayerDTO u: player)
				System.out.println(u);
			System.out.println();
		}
	}
	
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[R]Leggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choice = getInput();
	}
	


	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Player", "doControl", request);
		
	}
}
