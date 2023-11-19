package com.argentinaprograma.proyecto.java.intermedio.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String razonSocial;
    private String CUIT;
    private List<Integer> idServicios = new ArrayList<Integer>();

    public Cliente(){

    }
    public Cliente(String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
        
    }
    public void solicitarUnServicio(Integer idServicio) {
    	this.idServicios.add(idServicio);
    	
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public List<Integer> getServicios() {
        return idServicios;
    }



}
