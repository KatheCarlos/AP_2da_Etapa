package com.Hibernate.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public  class AreaComercial {
	private Map<String, Cliente> clientes = new HashMap<String,Cliente>();
	
	public AreaComercial() {
		
		
	}
	public void altaCliente(String rezonSocial, String cuil) {
		if (!clienteRegitrado(cuil)) {
			Cliente cliente = new Cliente (rezonSocial, cuil);
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
		return null;//clientes.get(cuil).getServicios();
	}

}