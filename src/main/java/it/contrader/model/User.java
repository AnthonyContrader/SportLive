package it.contrader.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import it.contrader.enumerators.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class User implements Serializable{

	private static final long serialVersionUID = 8437461321788516113L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;

	@Column
	@NotNull
	private String username;

	@Column
	@NotNull
	private String password;

	@Column
	@NotNull
	private UserType usertype;

	@Column
	@NotNull
	private String name;

	@Column
	@NotNull
	private String surname;

}