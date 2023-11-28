package com.Hibernate.modelo;

//import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Incidentes")
public class Incidente {	
	private static Integer cont =1;
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column (name = "cuilCliente")
    private String cuilCliente;
	@Column (name = "idTecnicoAsignado")
    private Integer idTecnicoAsignado;
	@Column (name = "estado")
    private Estado estado;
	@Column (name = "idServicio")
    private Integer idServicio;
	@Column (name = "reporte")
    private String reporte;
	@Column (name = "tipoProblema")
    private tipoProblema tipoProblema;
	
//    private Date fecha;

    public Incidente() {
    }

    public Incidente(String cuilCliente, Integer tecnicoAsignado,Integer idServicio,  Estado estado) {
        this.cuilCliente = cuilCliente;
        this.idTecnicoAsignado = tecnicoAsignado;
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
        return idTecnicoAsignado;
    }

    public void setTecnico(Integer tecnico) {
        this.idTecnicoAsignado = tecnico;
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
