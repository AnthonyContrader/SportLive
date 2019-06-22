package it.contrader.dto;

public class ParametersDTO {
	
	private int id;

	private int idplayer;
	
	private int age;
	
	private int height;
	
	private double weight;
	
	private int gp;
	
	private int score;
	
	
	public ParametersDTO() {

	}
	
	public ParametersDTO (int id, int idplayer, int age, int height, double weight, int gp, int score) {
	this.id = id;
	this.idplayer = idplayer;
	this.age = age;
	this.height = height;
	this.weight = weight;
	this.gp = gp;
	this.score = score;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdplayer() {
		return this.idplayer;
	}
	public void setIdplayer(int idplayer) {
		this.idplayer = idplayer;
	
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	
	}
	
	public int getHeight() {
		return this.height;
		
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getWeight() {
		return this.weight;
		
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getGp() {
		return this.gp;
		
	}
	public void getGp(int gp) {
		this.gp = gp;
	}
		
	public int getScore() {
			return this.score;		
	}
			
	public void getScore(int score) {
			this.score = score;
	}

    public String toString() {
    	return id + "\t" + idplayer + "\t\t" + age + "\t\t" + height + "\t\t" + weight + "\t\t" + gp + "\t\t" + score;
    }
}

	
	
	
	
