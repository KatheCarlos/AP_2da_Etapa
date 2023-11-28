package com.Hibernate.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Servicios")
public class Servicio {
	private static int cont = 1;
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name = "idTecnico")
	private Integer idTecnico;
	@Column (name = "tipoServicio")
	private String tipoServicio;
	@Column (name = "cuilCliente")
	private String cuilCliente;
	
	public Servicio() {
		
	}
	public Servicio(Integer idTecnico, String tipoServicio , String cuilCliente) {
		this.idTecnico = idTecnico;
		this.tipoServicio = tipoServicio;
		this.cuilCliente = cuilCliente;
		id = cont;
		++cont;
	}
	public Integer getIdTecnico() {
		return idTecnico;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public void setIdTecnico(Integer idTecnico) {
		this.idTecnico = idTecnico;
	}

	public String getCuilCliente() {
		return cuilCliente;
	}
	public void setCuilCliente(String cuilCliente) {
		this.cuilCliente  = cuilCliente;
	}

}
