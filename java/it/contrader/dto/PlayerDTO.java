package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

	private Integer id;
	
	private Integer idPlayer;
	
	private String nickname;
	
	private String password;
	
	private String playertype;
	
	private Integer score;
}
