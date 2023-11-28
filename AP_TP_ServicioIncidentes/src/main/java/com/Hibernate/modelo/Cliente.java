package com.Hibernate.modelo;

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
	@Column(name = "cuil")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String CUIT;//id
	@Column(name = "nombre")
    private String nombre;
//	@OneToMany(mappedBy = "cliente")
//    private List<Integer> idServiciosContratados = new ArrayList<Integer>();

    public Cliente(){

    }
    public Cliente(String nombre, String CUIT) {
        this.nombre = nombre;
        this.CUIT = CUIT;
        
    }
//    public void solicitarUnServicio(Integer idServicio) {
//    	this.idServiciosContratados.add(idServicio);
//    	
//    }

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
