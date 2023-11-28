package com.Hibernate.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.modelo.Cliente;

import jakarta.persistence.criteria.CriteriaQuery;

public class ClienteController {
	public String CrearCliente(String nombre, String CUIT) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			Cliente cliente = new Cliente(nombre, CUIT);
					session.beginTransaction();
					session.persist(cliente);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Cliente creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al crear cliente";
		}
	}
	public String EliminarCliente(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Cliente cliente = session.get(Cliente.class, id);
					session.remove(cliente);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Cliente creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al eliminar el cliente";
		}
	}
	public String verCliente(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Cliente cliente= session.get(Cliente.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Cliente id:"+id+ cliente.toString();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar ver cliente";
		}
	}
	public void ListadoClinte() {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					CriteriaQuery <Cliente> cq= session.getCriteriaBuilder().createQuery(Cliente.class);
					cq.from(Cliente.class);
					List<Cliente> clientes = session.createQuery(cq).getResultList();
					
					System.out.println("");
					System.out.println("LISTA DE SERVICIOS \n--------------------------");
					for(Cliente c :clientes) {
						System.out.println("Nombre: "+ c.getNombre() + "\n");
						System.out.println("CUIT: " + c.getCUIT()+"\n------------------------------------" );
//						System.out.println("Mail: " + c.getMail()+"\n------------------------------------");
					}
					sessionFactory.close();
							
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al intentar leer la lista de servicios");
		}
	
	}
}
