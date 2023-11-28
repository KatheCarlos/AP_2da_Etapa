package com.Hibernate.modelo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "cuil")
	private String CUIT;
	@Column(name = "nombre")
    private String nombre;
	
//	private Set<Servicio> serviciosContratados =new HashSet<>();

    public Cliente(){

    }
    public Cliente(String nombre, String CUIT) {
        this.nombre = nombre;
        this.CUIT = CUIT;

    }
//    public void agregarServicio(Integer idServicio) {
//    	this.serviciosContratados.add(idServicio);
//    	
//    }
//    public void eliminarServicio(Integer idServicio) {
//    	this.serviciosContratados.remove(idServicio);
//    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
    public String getCUIT() {
        return CUIT;
    }

    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

//    public List<Integer> getServicios() {
//        return idServiciosContratados;
//    }



}
