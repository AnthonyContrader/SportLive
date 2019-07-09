package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQuery(name="Device.findAll", query="SELECT d FROM Device d")
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "idPlayer")
	@NotNull
	private int idPlayer;


	@Column(name = "heartbeat")
	@NotNull
	private String heartbeat;

	@Column(name = "pressure")
	@NotNull
	private String pressure;

	@Column(name = "breath")
	@NotNull
	private String breath;

}