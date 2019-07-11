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
	private PlayerType playertype;

	@NonNull
	private Integer idCoach;

	@NonNull
	private Integer score;

	@NonNull
	private UserDTO coach;

	@NonNull
	private UserDTO userPlayer;

}
