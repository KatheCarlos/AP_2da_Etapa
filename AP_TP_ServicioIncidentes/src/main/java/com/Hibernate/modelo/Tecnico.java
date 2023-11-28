package com.Hibernate.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Tecnicos")
public class Tecnico {

    private static int cont = 1;
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name = "nombre")
	private String nombre ;
	@Column(name = "especialidad")
	private String especialidad;
//    private List<String> especialidades; 
	@Column (name = "disponible")
    private boolean disponible;
	@Column (name = "mail")
	private String mail;

    public Tecnico() {
    }
    public Tecnico(String nombre, String especialidad, String mail) {
    	this.nombre = nombre ;
    	this.especialidad= especialidad;
//    	this.especialidades.add(especialidad);
    	this.disponible=true;
    	this.mail = mail;
    	this.id = cont;
    	++cont;
    }

//    public List<String> getEspecialidades() {
//        return especialidades;
//    }
//
//    public void setEspecialidades(List<String> especialidades) {
//        this.especialidades = especialidades;
//    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
