package it.contrader.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="player")
//@NamedQuery(name="Reading.findAll", query="SELECT r FROM Reading r")
public class Player {
	private static final long serialVersionUID = 1L;

	
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

	@NotNull
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "playertype")
	private String playertype;
	
	@NotNull
	@Column(name = "score")
	private Integer score;
	
	
	
}
