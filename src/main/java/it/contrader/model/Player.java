package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "idPlayer")
	@NotNull
	private Integer idPlayer;
	
	@Column(name = "nickname")
	@NotNull
	private String nickname;
	
	@Column(name = "password")
	@NotNull
	private String password;
	
	@Column(name = "playertype")
	@NotNull
	private String playertype;
	
	@Column(name = "score")
	@NotNull
	private Integer score;
	
}
