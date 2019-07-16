package it.contrader.model;

import javax.persistence.*;

import it.contrader.model.User.Usertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	
	private int idplayer;
	
	private int serial;
	
	private int heartbeat;

	private int pressure;
        
}
