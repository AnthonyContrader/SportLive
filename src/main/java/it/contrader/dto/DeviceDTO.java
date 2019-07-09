package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDTO {
	
	private int id;

	private int idPlayer;
	
	private String heartbeat;
	
	private String pressure;

	private String breath;
	

	public DeviceDTO(String heartbeat, String pressure, String breath) {
		super();
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}
	
	
}
