package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParametersDTO {


	private Integer idplayer;

	private Integer data;
	
	private Integer age;

	private Integer height;
	
	private Integer weight;
	
	private Integer gol;
	
	private Integer gp;
	
	private Integer mp;
	 
}