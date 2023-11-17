package com.argentinaprograma.proyecto.java.intermedio.modelo;

public class Servicio {
	private static int cont = 1;
	private int id;
	private String idTecnico;
	private String tipoServicio;
	private String cuilCliente;

	
	public Servicio() {
		
	}
	public Servicio(String idTecnico, String tipoServicio , String cuilCliente) {
		this.idTecnico = idTecnico;
		this.tipoServicio = tipoServicio;
		this.cuilCliente = cuilCliente;
		id = cont;
		++cont;
	}
	public String getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(String idTecnico) {
		this.idTecnico = idTecnico;
	}

	public String getCuilCliente() {
		return cuilCliente;
	}
	public void setCuilCliente(String cuilCliente) {
		this.cuilCliente  = cuilCliente;
	}

}
