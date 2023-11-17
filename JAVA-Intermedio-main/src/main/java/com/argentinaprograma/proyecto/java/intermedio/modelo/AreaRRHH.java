package com.argentinaprograma.proyecto.java.intermedio.modelo;

import java.util.HashMap;
import java.util.Map;


public  class AreaRRHH   {
	private Map<Integer, Incidente> incidentes = new HashMap<Integer, Incidente> ();
	
	public AreaRRHH() {

		
	}
	public void altaIncidente(String cuilCliente, Integer tecnicoAsignado,Integer idServicio,  Estado estado) {
		Incidente incidente = new Incidente(cuilCliente, tecnicoAsignado, idServicio, estado);
		incidentes.put(incidente.getID(), incidente);
	}
	
	public void bajaIncidente(Integer idImcidente) {
		incidentes.remove(idImcidente);
	}

	public void asignarTecnico(Integer idIncidente, Integer otroIdTecnico) {
		Incidente incidente = incidentes.get(idIncidente);
		incidente.setTecnico(otroIdTecnico);;
	}
	public Estado getEstadoIncidente(Integer idIncidente) {
		return incidentes.get(idIncidente).getEstado();
	}
}