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

public class Parameters {
	
	private Integer idplayer;
	private Integer data;
	private Integer age;
	private Integer height;
	private Integer weight;
	private Integer gol;
	private Integer gp;
	private Integer mp;
	
	public Integer getIdplayer() {
		return idplayer;
	}
	public void setIdplayer(Integer idplayer) {
		this.idplayer = idplayer;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getGol() {
		return gol;
	}
	public void setGol(Integer gol) {
		this.gol = gol;
	}
	public Integer getGp() {
		return gp;
	}
	public void setGp(Integer gp) {
		this.gp = gp;
	}
	public Integer getMp() {
		return mp;
	}
	public void setMp(Integer mp) {
		this.mp = mp;
	}
		
}
