package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parameters {


	@Id
	@Column(name = "idplayer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idplayer;

	@Column(name = "data")
	@NotNull
	private Integer data;

	@Column(name = "age")
	@NotNull
	private Integer age;

	@Column(name = "height")
	@NotNull
	private Integer height;

	@Column(name = "weight")
	@NotNull
	private Integer weight;
	
	@Column(name = "gol")
	@NotNull
	private Integer gol;
	
	@Column(name = "gp")
	@NotNull
	private Integer gp;
	
	@Column(name = "mp")
	@NotNull
	private Integer mp;
	
}	


