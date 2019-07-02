package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Device {

	public Device() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "idplayer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idplayer;

	@Column(name = "heartbeat")
	@NotNull
	private Integer heartbeat;

	@Column(name = "pressure")
	@NotNull
	private Integer pressure;

	@NotNull
	@Column(name = "breath")
	private Integer breath;

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
