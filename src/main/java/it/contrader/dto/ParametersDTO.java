package it.contrader.dto;

public class ParametersDTO {

	private int idplayer;
	private int data;
	private int age;
	private int height;
	private int weight;
	private int gol;
	private int gp;
	private int mp;
	
	public ParametersDTO() {
		
	}
	
	public ParametersDTO (int idplayer, int data, int age, int height, int weight, int gol, int gp, int mp) {
		this.idplayer = idplayer;
		this.data = data;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gol = gol;
		this.gp = gp;
		this.mp = mp;
	}
	
	public ParametersDTO (int data, int age, int height, int weight, int gol, int gp, int mp) {
		this.data = data;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gol = gol;
		this.gp = gp;
		this.mp = mp;
	}
	
	public int getIdplayer() {
		return this.idplayer;
	}
	public void setIdplayer(int idplayer) {
		this.idplayer = idplayer;
	}
	
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		this.data = data;
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

	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	} 
	
	public int getGol() {
		return this.gol;
	}
	public void setGol(int gol) {
		this.gol = gol;
	}
	
	public int getGp() {
		return this.gp;
	}
	public void setGp(int gp) {
		this.gp = gp;
	}
	
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
}
