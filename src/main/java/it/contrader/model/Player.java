package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import it.contrader.model.User.Usertype;
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
	
	
	@ManyToOne
	@JoinColumn(name = "idPlayer", referencedColumnName = "id", insertable =false, updatable = false)
	private User coach;
	
	private int idCoach;
	
	@Column(unique = true)
	private String playername;
	
	private int age;
	
	private int gamep;
	
	private int score;
}
