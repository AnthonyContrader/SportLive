package it.contrader.model;

public class Parameters {
	
private int id;
	
	private int idplayer;
	
	private int age;
	
	private double weight;
	
	private int height;
	
	private int gp;
	
	private int score;
	 
	public Parameters () {
		
	}

	public Parameters (int id, int idplayer, int age, double weight, int height, int gp, int score) {
			this.id = id;
			this.idplayer = idplayer;
			this.age = age;
			this.weight = weight;
			this.height = height;
			this.gp = gp;
			this.score = score;
			
	}

	public int getId( ) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getIdplayer() {
		return idplayer;
	}

	public void setIdplayer(int idplayer) {
		this.idplayer = idplayer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public String toString() {
		return  id + "\t"  + idplayer +"\t\t" + age + "\t\t" +  weight + "\t\t" + height + "\t\t"+ gp + "\t\t" + score;
		
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
        Parameters other = (Parameters) obj;
		if (id != other.id)
			return false;
		if (idplayer != other.idplayer)
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

	


	