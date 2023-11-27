package com.Hibernate.modelo;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@Column(name = "cuil")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String CUIT;//id
	@Column(name = "razonSocial")
    private String razonSocial;
	@OneToMany(mappedBy = "cliente")
    private List<Integer> idServiciosContratados = new ArrayList<Integer>();

    public Cliente(){

    }
    public Cliente(String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
        
    }
    public void solicitarUnServicio(Integer idServicio) {
    	this.idServiciosContratados.add(idServicio);
    	
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
        return idServiciosContratados;
    }



}
