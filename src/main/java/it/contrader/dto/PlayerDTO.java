package it.contrader.dto;

public class PlayerDTO {

	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String nickname;
	
	private int age;
	
	private int height;
	
	private double weight;
	
	private int gp;
	
	private int score;
	
	
		
	public PlayerDTO() {
	}
	
	public PlayerDTO (int idcoach, String password, String playertype, String nickname, int age, int height, double weight, int gp, int score) {
		this.idcoach = idcoach;
		this.password = password;
		this.playertype = playertype;
		this.nickname = nickname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gp = gp;
		this.score = score;
		
	}
	
	public PlayerDTO (int id, int idcoach, String password, String playertype, String nickname, int age, int height, double weight, int gp, int score) {
		this.id = id;
		this.idcoach = idcoach;
		this.password = password;
		this.playertype = playertype;
		this.nickname = nickname;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gp = gp;
		this.score = score;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getGp() {
		return gp;
	}
	
	public void setGp(int gp) {
		this.gp = gp;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return  id + "\t"  + idcoach +"\t\t" + password + "\t\t" +  playertype + "\t\t" + nickname + "\t\t" + age + "\t\t" + height + "\t\t" + weight + "\t\t" + gp + "\t\t" + score;
	}
	
}
