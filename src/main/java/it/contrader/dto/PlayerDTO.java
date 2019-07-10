package it.contrader.dto;

import it.contrader.cenumerators.PlayerType;
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

}
