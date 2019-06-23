package it.contrader.model;

public class Player {
	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String nickname;
	
	private int age;
	
	private double weight;
	
	private int height;
	
	private int gp;
	
	private int score;
	
	
	
	public Player () {
		
	}
	 public Player (int idcoach, String playertype, String password, String nickname, int age, int height, double weight, int gp, int score) {
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
	
	public void set(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return  id + "\t"  + idcoach +"\t\t" + password + "\t\t" +  playertype + "\t\t" + nickname + "\t\t" + age + "\t\t" + height + "\t\t" + weight + "\t\t" + gp + "\t\t" + score;
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
		if (password != other.password)
			return false;
		if (playertype != other.playertype)
			return false;
		if (nickname != other.nickname)
			return false;
		if (age != other.age)
			return false;
		if (height != other.height)
			return false;
		if (weight != other.weight)
			return false;
		if (gp != other.gp)
			return false;
		if (score != other.score)
			return false;
		return true;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	

	


