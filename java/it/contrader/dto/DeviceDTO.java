package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDTO {

	private Integer idPlayer;
	
	private Integer heartbeat;
	
	private Integer pressure;
	
	private Integer breath;
}
