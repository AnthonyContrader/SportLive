package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column
	@NotNull
	private Integer idPlayer;

	@Column
	@NotNull
	private String heartbeat;

	@Column
	@NotNull
	private String pressure;

	@Column
	@NotNull
	private String breath;

	@ManyToOne
	@JoinColumn(name = "idPlayer", insertable =false, updatable = false)
	private Player player;

}