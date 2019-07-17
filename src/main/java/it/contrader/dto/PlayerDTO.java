package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.Player.Playertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PlayerDTO {
	
	private int id;
	
	private int idPlayer;
	
	private int idCoach;
	
	private String playername;
	
	private Playertype playertype;
	
	private int age;
	
	private int gamep;
	
	private int score;
	

}
