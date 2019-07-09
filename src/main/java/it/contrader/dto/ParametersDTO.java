
package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParametersDTO {

	private int id;
	
	private int idPlayer;
	
	private int data;
	
	private int age;
	
	private int height;
	
	private int weight;
	
	private int gol;
	
	private int gp;
	
	private int mp;
	
	public ParametersDTO(int data, int age, int height, int weight, int gol, int gp, int mp) {
		super();
		this.data = data;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gol = gol;
		this.gp = gp;
		this.mp = mp;
	}
}
