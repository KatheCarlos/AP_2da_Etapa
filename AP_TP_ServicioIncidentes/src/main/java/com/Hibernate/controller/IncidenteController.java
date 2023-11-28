package com.Hibernate.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.modelo.Estado;
import com.Hibernate.modelo.Incidente;

import jakarta.persistence.criteria.CriteriaQuery;

public class IncidenteController {
	public String CrearIncidente(String cuilCliente, Integer tecnicoAsignado,Integer idServicio,  Estado estado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			Incidente incidente = new Incidente(cuilCliente, tecnicoAsignado, idServicio, estado);
					session.beginTransaction();
					session.persist(incidente);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Incidente creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al crear incidente";
		}
	}
	
	public String EliminarIncidente(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Incidente incidente = session.get(Incidente.class, id);
					session.remove(incidente);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Incidente creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al eliminar el incidente";
		}
	}
	public String verIncidente(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Incidente incidente= session.get(Incidente.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Incidente id:"+id+ incidente.toString();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar ver incidente";
		}
	}
	public String EstadoIncidente(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Incidente incidente= session.get(Incidente.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Estado de incidente:"+id+incidente.getEstado();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar ver las estado del incidente";
		}
	}
	public void ListadoIncidentes() {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					CriteriaQuery <Incidente> cq= session.getCriteriaBuilder().createQuery(Incidente.class);
					cq.from(Incidente.class);
					List<Incidente> incidentes = session.createQuery(cq).getResultList();
					
					System.out.println("");
					System.out.println("LISTA DE SERVICIOS \n--------------------------");
					for(Incidente i :incidentes) {
						System.out.println("ID: " +i.getID());
						System.out.println("Tecnico a cargo: " +i.getTecnico());
						System.out.println("Cliente: "+i.getCliente());
						System.out.println("Estado: " +i.getEstado()+"\n------------------------------------");
					}
					sessionFactory.close();
							
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al intentar leer la lista de incidentes");
		}
	
}
	
	
	public String CambiarEstadoIncidente(Integer id, Estado estado) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Incidente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Incidente incidente = session.get(Incidente.class, id);
					incidente.setEstado(estado);
					session.persist(incidente);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Sea cambiado el estado del incidente sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al cambiar el innidente";
		}
	}
	
}
 