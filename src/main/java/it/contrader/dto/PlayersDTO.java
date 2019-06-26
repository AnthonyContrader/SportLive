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

	public int getidcoach() {
		return this.idcoach;
	}

	public void setidcoach(int idcoach) {
		this.idcoach = idcoach;
	}

	public String getnickname() {
		return this.nickname;
	}

	public void setnickname(String nickname) {
		this.nickname = nickname;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getpassword() {
		return password;
	}
	
	public void setplayertype(String playertype) {
		this.playertype = playertype;
	}

	public String getplayertype() {
		return playertype;
	}
	
	public int getscore() {
		return this.score;
	}
	public void setscore(int score) {
		this.score = score;
	}
}
