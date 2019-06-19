package it.contrader.model;

public class Player {
	
	private int id;
	
	private int idcoach;
	
	private String password;
	
	private String playertype;
	
	private String name;
	
	private String surname;
	
	private int height;
	
	private double weight;
	
	private int age;
	
	private int pr;
	
	private int gf;
	
	private int gs;
	
	private double kmp;
	
	private int min;
	
	public Player () {
		
	}
	
	public Player (int id, int idcoach, String password, String playertype, String name, String surname, int height, double weight, int age, int pr, int gf, int gs, double kmp, int min) {
		this.id = id;
		this.idcoach = idcoach;
		this.password = password;
		this.playertype = playertype;
		this.name = name;
		this.surname = surname;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.pr = pr;
		this.gf = gf;
		this.gs = gs;
		this.kmp = kmp;
		this.min = min;
	}

	

}
