package it.contrader.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import it.contrader.enumerators.PlayerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class Player implements Serializable{
	
	private static final long serialVersionUID = 2731954642707502865L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@NotNull
	private String username;

	@NotNull
	@Column
	private PlayerType playertype;
	
	@NotNull
	@Column
	private Integer idCoach;
	
	@NotNull
	@Column
	private Integer score;
	
	@ManyToOne
	@JoinColumn(name = "idCoach", referencedColumnName = "id", insertable =false, updatable = false)
	private User coach;
	
	@OneToOne
	@JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
	private User userPlayer;
	
	
	
}
