package it.contrader.dto;

public class PlayerDTO {

	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String nickname;
	
		
	public PlayerDTO() {
	}
	
	public PlayerDTO (int id, int idcoach, String password, String playertype, String nickname) {
		this.id = id;
		this.idcoach = idcoach;
		this.password = password;
		this.playertype = playertype;
		this.nickname = nickname;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdcoach() {
		return idcoach;
	}

	public void setIdcoach(int idcoach) {
		this.idcoach = idcoach;
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

	public String getnickname() {
		return nickname;
	}
	
	public void setnickname(String nickname) {
		this.nickname = nickname;
	}

	
	@Override
	public String toString() {
		return  id + "\t"  + idcoach +"\t\t" + password + "\t\t" +  playertype + "\t\t" + nickname;
	}
	
}
