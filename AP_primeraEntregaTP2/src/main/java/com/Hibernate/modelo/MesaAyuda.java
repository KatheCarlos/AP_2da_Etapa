package com.Hibernate.modelo;

import java.util.List;
import java.util.Set;

import com.Hibernate.controller.AreaComercial;
import com.Hibernate.controller.AreaRRHH;


public class MesaAyuda {
//    private List<Cliente> clientes;
	private List<Servicio> servicios;
    private List<Tecnico> tecnicos;
    private AreaComercial areaComercial;
    private AreaRRHH areaRRHH;

    public MesaAyuda() {
    }
    public MesaAyuda(String cuil) {
		if (verificarCliente(cuil)) {
		
			serviciosContratados(cuil);//mostrar a cliente
			
			
		}
		else {
			throw new IllegalArgumentException("No se encuentra registro el cuil ingresado");
		}
    }


    private List<Integer> serviciosContratados(String cliente){
    	return areaComercial.serviciosCliente(cliente);
    }


    public void setTecnicoAsignado(Integer tecnico, Integer incidente) {
        if (tecnicos.get(tecnico).isLibre()) {
//            incidente.setidTecnico(tecnico);
            areaRRHH.asignarTecnico(incidente, tecnico);
            //tecnico.notificar(); TO DO
        } else {
            //Qué hacer cuando está ocupado
        }
    }

	private boolean verificarCliente(String cuil) {
		areaComercial.clienteRegitrado(cuil);
		return false;
	}

	private void reporteServico() {
		
	}
	private void tecnicosDisponibles() {
		
	}
	private void asignarTecnico(Integer idTecnico) {
		
	}
	private void ingrasarIncidente() {
		
	}
	private void notificarTecnico() {
		
	}
}
