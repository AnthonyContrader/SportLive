package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PlayersDTO {
	
	private int idcoach;
	private String nickname;
	private String password;
	private String playertype;
	private int score;
	
public PlayersDTO() {
		
	}
	
	public PlayersDTO(int idcoach, String nickname, String password, String playertype, int score) {
		this.idcoach = idcoach;
		this.nickname = nickname;
		this.password = password;
		this.playertype = playertype;
		this.score = score;
	}
	
	public PlayersDTO(String nickname, String password, String playertype, int score) {
		this.nickname = nickname;
		this.password = password;
		this.playertype = playertype;
		this.score = score;
	}

	public int getIdcoach() {
		return idcoach;
	}

	public void setIdcoach(int idcoach) {
		this.idcoach = idcoach;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlayertype() {
		return playertype;
	}

	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
