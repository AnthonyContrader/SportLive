package it.contrader.model;

public class Device {
	
	
	private int idplayer;
	
	private int heartbeat;
	
	private int pressure;
	
	private int breath;
	
	
	public Device() {
		
	}
	
	public Device (int heartbeat, int pressure, int breath) {
		this.heartbeat = heartbeat;
		this.pressure = pressure;
		this.breath = breath;
	}

	public Device (int idplayer, int heartbeat, int pressure, int breath) {
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
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (idplayer != other.idplayer)
			return false;
		if (heartbeat != other.heartbeat)
			return false;
		if (pressure != other.pressure)
			return false;
		if (breath != other.breath)
			return false;
		return true;
	}
}
	
		
	
	

	
	
