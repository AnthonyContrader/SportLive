package it.contrader.dto;

public class PlayersDTO {
	
	private int id;
	private int idcoach;
	private String nickname;
	private String password;
	private String playertype;
	private int score;
	
	public PlayersDTO() {
		
	}
	
	public PlayersDTO (String nickname, String password, String playertype, int score) {
		this.nickname = nickname;
		this.password = password;
		this.playertype = playertype;
		this.score = score;
	}

	public PlayersDTO (int idcoach, String nickname, String password, String playertype, int score) {
		this.idcoach = idcoach;
		this.nickname = nickname;
		this.password = password;
		this.playertype = playertype;
		this.score = score;
	}
	
	public PlayersDTO (int id, int idcoach, String nickname, String password, String playertype, int score) {
		this.id = id;
		this.idcoach = idcoach;
		this.nickname = nickname;
		this.password = password;
		this.playertype = playertype;
		this.score = score;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getIdcoach() {
		return this.idcoach;
	}

	public void setIdcoach(int idcoach) {
		this.idcoach = idcoach;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}

	public String getPlayertype() {
		return playertype;
	}
	
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
