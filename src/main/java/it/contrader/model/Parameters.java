package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="patology")
//@NamedQuery(name="Patology.findAll", query="SELECT u FROM Patology u")
public class Parameters {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="idPlayer")
	@NotNull
	private Integer idPlayer;
	
	@Column(name="data")
	@NotNull
	private Integer data;

	@Column(name="age")
	@NotNull
	private Integer age;
	
	@Column(name="height")
	@NotNull
	private Integer height;
	
	@Column(name="weight")
	@NotNull
	private Integer weight;
	
	@Column(name="gol")
	@NotNull
	private Integer gol;

	@Column(name="gp")
	@NotNull
	private Integer gp;
	
	@Column(name="mp")
	@NotNull
	private Integer mp;
	
	
}
	//bi-directional many-to-one association to Client
	//@OneToMany(mappedBy="patology")
	//private List<Cure> cures;

	//bi-directional many-to-one association to Item
	//@OneToMany(mappedBy="patology")
	//private List<Device> devices;

	//bi-directional many-to-one association to Order
	//@OneToMany(mappedBy="patology")
	//private List<Emergency> emergencys;

	//bi-directional many-to-one association to Project
	//@OneToMany(mappedBy="patology")
	//private List<Patology> patologys;

	//bi-directional many-to-one association to Resource
	//@OneToMany(mappedBy="patology")
	//private List<Payment> payments;

	//bi-directional many-to-one association to Task
	//@OneToMany(mappedBy="patology")
	//private List<Reading> readings;


