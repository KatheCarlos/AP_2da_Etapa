package com.Hibernate.modelo;

import java.util.Date;

public class Incidente {
	private static Integer cont =1;
    private Integer id;
    private String cuilCliente;
    private Integer tecnicoAsignado;
    private Estado estado;
    private Integer idServicio;
    private String reporte;
    private tipoProblema tipoProblema;

    private Date fecha;

    public Incidente() {
    }

    public Incidente(String cuilCliente, Integer tecnicoAsignado,Integer idServicio,  Estado estado) {
        this.cuilCliente = cuilCliente;
        this.tecnicoAsignado = tecnicoAsignado;
        this.estado = estado;
        this.idServicio = idServicio;
        this.id= cont;
        ++cont;
    }
    

    public String getCliente() {
        return cuilCliente;
    }

    public void setCliente(String cuilCliente) {
        this.cuilCliente = cuilCliente;
    }

    public Integer getTecnico() {
        return tecnicoAsignado;
    }

    public void setTecnico(Integer tecnico) {
        this.tecnicoAsignado = tecnico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Integer getID() {
    	return this.id;
    }
}
