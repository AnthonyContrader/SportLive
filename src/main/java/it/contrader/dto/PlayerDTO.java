package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

private int id;
private int idPlayer;
private String nickname;
private String password;
private String playertype;
private int score;

public PlayerDTO(String nickname, String password, String playertype, int score) {
	super();
	this.nickname = nickname;
	this.password = password;
	this.playertype = playertype;
	this.score = score;
}
	
}
