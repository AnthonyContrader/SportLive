package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Player {

	public enum Playertype{
		ATT,
		CEN,
		DIF,
		POR
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private int idPlayer;
	
	private int idCoach;
	
	@Column(unique = true)
	private String playername;
	
	private Playertype playertype;
	
	private int age;
	
	private int gamep;
	
	private int score;
}
