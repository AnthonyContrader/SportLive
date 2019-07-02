package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private Integer idUser;

	private String username;
	
	private String password;

	private String ruolo;
	
	private String email;
	
	
	
	public UserDTO() {
		
	}
	
	public UserDTO(String username, String password, String ruolo, String email) {
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.email = email;
	}
	
	public UserDTO(int idUser, String username, String password, String ruolo, String email) {
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.email = email;
	}
	
	

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
