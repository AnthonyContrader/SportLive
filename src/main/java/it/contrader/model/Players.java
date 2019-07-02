package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Players {
	
	private int idcoach;
	private String nickname;
	private String password;
	private String playertype;
	private int score;
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