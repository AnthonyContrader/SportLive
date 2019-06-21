package it.contrader.model;

public class Parameters {
	
private int id;
	
	private int idplayer;
	
	private int Age;
	
	private double Weight;
	
	private int Height;
	
	private int GP;
	
	private int Score;
	 
	public Parameters () {
		
	}

	public Parameters (int id, int idplayer, int Age, double Weight, int Height, int GP, int Score) {
			this.id = id;
			this.idplayer = idplayer;
			this.Age = Age;
			this.Weight = Weight;
			this.Height = Height;
			this.GP = GP;
			this.Score = Score;
			
	}

	public int getid( ) {
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
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double Weight) {
		this.Weight = Weight;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int Height) {
		this.Height = Height;
	}

	public int getGP() {
		return GP;
	}

	public void setGP(int GP) {
		this.GP = GP;
	}
	
	public int getScore() {
		return Score;
	}

	public void setScore(int Score) {
		this.Score = Score;
	}

	public String toString() {
		return  id + "\t"  + idplayer +"\t\t" + Age + "\t\t" +  Weight + "\t\t" + Height + "\t\t"+ GP + "\t\t" + Score;
		
	}
	
	
}

	