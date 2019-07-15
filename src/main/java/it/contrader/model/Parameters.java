package it.contrader.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Parameters {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	@NotNull
	private Integer idPlayer;

	@Column
	private Timestamp data;

	@Column
	@NotNull
	private Integer age;

	@Column
	@NotNull
	private Integer height;

	@Column
	@NotNull
	private Integer weight;

	@Column
	@NotNull
	private Integer gol;

	@Column
	@NotNull
	private Integer gp;

	@Column
	@NotNull
	private Integer mp;

	@ManyToOne
	@JoinColumn(name = "idPlayer", insertable =false, updatable = false)
	private Player player;
}
