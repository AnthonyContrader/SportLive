package it.contrader.dto;

import it.contrader.enumerators.PlayerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class PlayerDTO {

	private Integer id;

	@NonNull
	private String username;

	@NonNull
	private String name;
	
	@NonNull
	private String surname;
	
	@NonNull
	private String password;
	
	@NonNull
	private PlayerType playertype;

	@NonNull
	private Integer idCoach;

	@NonNull
	private Integer score;
//
//	private UserDTO coach;
//
//	private UserDTO userPlayer;

}
