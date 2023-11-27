package com.Hibernate.modelo;

public class Servicio {
	private static int cont = 1;
	private Integer id;
	private Integer idTecnico;
	private String tipoServicio;
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
