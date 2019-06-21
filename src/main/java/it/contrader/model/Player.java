package it.contrader.model;

public class Player {
	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String nickname;
	
	public Player () {
		
	}
	
	public Player (int id, int idcoach, String password, String playertype, String nickname) {
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return  id + "\t"  + idcoach +"\t\t" + password + "\t\t" +  playertype + "\t\t" + nickname;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if(id != other.id)
			return false;
		if(idcoach != other.idcoach)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (playertype == null) {
			if (other.playertype != null)
				return false;
		} else if (!playertype.equals(other.playertype))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		return true;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	

	


