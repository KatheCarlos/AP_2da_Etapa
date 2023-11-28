package com.Hibernate.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.modelo.Tecnico;

import jakarta.persistence.criteria.CriteriaQuery;

public class TecnicoController {
	public String CrearTecnico(String nombre, String especialidad, String mail) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			Tecnico tecnico = new Tecnico(nombre, especialidad, mail);
					session.beginTransaction();
					session.persist(tecnico);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Tecnico creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al crear tecnico";
		}
	}
	
	public String EliminarTecnico(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Tecnico tecnico = session.get(Tecnico.class, id);
					session.remove(tecnico);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Tecnico creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al eliminar el tecnico";
		}
	}
	public String verTecnico(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Tecnico tecnico= session.get(Tecnico.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Tecnico id:"+id+ tecnico.toString();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar ver tecnico";
		}
	}
	public String DisponibilidadTecnico(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Tecnico tecnico= session.get(Tecnico.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Tecnico:"+id+ "disponabilidad: "+tecnico.isDisponible();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar ver las disponibilidad del tecnico";
		}
	}
	public void ListadoTecnicos() {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					CriteriaQuery <Tecnico> cq= session.getCriteriaBuilder().createQuery(Tecnico.class);
					cq.from(Tecnico.class);
					List<Tecnico> tecnicos = session.createQuery(cq).getResultList();
					
					System.out.println("");
					System.out.println("LISTA DE SERVICIOS \n--------------------------");
					for(Tecnico t :tecnicos) {
						System.out.println("Nombre: "+ t.getNombre() + "\n");
						System.out.println("ID: " +t.getId() );
						System.out.println("Especialidad: "+ t.getEspecialidad());
						System.out.println("Mail: " +t.getMail()+"\n------------------------------------");
					}
					sessionFactory.close();
							
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al intentar leer la lista de Tecnicos");
		}
	
}
	
	
	public String notificarTecnico(Integer id) {
		return null;
	}
	
}
