package it.contrader.dto;

public class DeviceDTO {

private int idplayer;
	
	private int heartbeat;
	
	private int pressure;
	
	private int breath;
	
	
	public DeviceDTO() {
		
	}
	
	public DeviceDTO (int heartbeat, int pressure, int breath) {
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}

	public DeviceDTO (int idplayer, int heartbeat, int pressure, int breath) {
		this.idplayer = idplayer;
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}
	
	public int getIdplayer() {
		return this.idplayer;
	}
	public void setIdplayer(int idplayer) {
		this.idplayer = idplayer;
	}
	
	public int getHeartbeat() {
		return this.heartbeat;
	}
	public void setHeartbeat(int heartbeat) {
		this.heartbeat = heartbeat;
	}
	
	public int getPressure() {
		return this.pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	
	public int getBreath() {
		return this.breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	
	public String toString() {
		return idplayer + "\t" + heartbeat + "\t\t" + pressure + "\t\t" + breath;
	}
	
}
