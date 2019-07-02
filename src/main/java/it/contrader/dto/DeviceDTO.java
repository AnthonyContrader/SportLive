package it.contrader.dto;

public class DeviceDTO {

	private Integer idplayer;

	private Integer heartbeat;
	
	private Integer pressure;

	private Integer breath;

	

	public DeviceDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public DeviceDTO(int heartbeat, int pressure, int breath) {
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}
	
	public DeviceDTO(int idplayer, int heartbeat, int pressure, int breath) {
		this.idplayer = idplayer;
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}

	public Integer getIdplayer() {
		return idplayer;
	}

	public void setIdplayer(Integer idplayer) {
		this.idplayer = idplayer;
	}

	public Integer getHeartbeat() {
		return heartbeat;
	}

	public void setHeartbeat(Integer heartbeat) {
		this.heartbeat = heartbeat;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getBreath() {
		return breath;
	}

	public void setBreath(Integer breath) {
		this.breath = breath;
	}
	
	
	

}
