package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Device {

	@Id
	@Column(name = "idPlayer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPlayer;
	
	
	@Column(name = "heartbeat")
	private Integer heartbeat;
	
	@Column(name = "pressure")
	private Integer pressure;
	
	@Column(name = "breath")
	private Integer breath;
}
