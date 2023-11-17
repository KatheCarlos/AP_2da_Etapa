package com.argentinaprograma.proyecto.java.intermedio.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;


public  class AreaComercial {
	private Map<String, Cliente> clientes = new HashMap<String,Cliente>();
	
	public AreaComercial() {
		
		
	}
	public void altaCliente(String nombre, String cuil) {
		if (!clienteRegitrado(cuil)) {
			Cliente cliente = new Cliente (nombre, cuil);
			clientes.put(cuil, cliente);
		}
		
	}
	public void bajaCliente(String cuil) {
		clientes.remove(cuil);
	}
	public boolean clienteRegitrado(String cuil) {
		
		
		return clientes.containsKey(cuil);
	

	}
	public List<Integer> serviciosCliente(String cuil) {
		return clientes.get(cuil).getServicios();
	}
	public boolean verificarCliente(String cuil) {
		
		return clientes.containsKey(cuil);
	}
}