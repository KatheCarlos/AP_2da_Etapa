package com.Hibernate.controller;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.modelo.Servicio;

import jakarta.persistence.criteria.CriteriaQuery;
public class ServicioController { 
	public String CrearServicio(String nombre ) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			Servicio sevicio = new Servicio( nombre);
					session.beginTransaction();
					session.persist(sevicio);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Servicio creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al crear servicio";
		}
	}
	
	public String EliminarServicio(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Servicio servicio = session.get(Servicio.class, id);
					session.remove(servicio);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Servicio creado sactifatoriamente ";
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al eliminar el servicio";
		}
	}
//	public String CambiarTecnico(Integer id, Integer idTecnico) {
//		SessionFactory sessionFactory = new 
//				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		
//		try {
//					session.beginTransaction();
//					Servicio servicio = session.get(Servicio.class, id);
//					servicio.setIdTecnico(idTecnico);
//					session.persist(servicio);
//					session.getTransaction().commit();
//					sessionFactory.close();
//					
//					return "Sea cambiado el tecnico del servicio sactifatoriamente ";
//							
//		}catch (Exception e) {
//			e.printStackTrace();
//			return "Error al cambiar el tecnico";
//		}
//	}
	public String LeerServicio(Integer id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
					session.beginTransaction();
					Servicio servicio = session.get(Servicio.class, id);
					session.getTransaction().commit();
					sessionFactory.close();
					
					return "Servcio id:"+id+ servicio.toString();
							
		}catch (Exception e) {
			e.printStackTrace();
			return "Error al intenatar leer servicio";
		}
	}	
		public void ListadoServicio() {
			SessionFactory sessionFactory = new 
					Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			try {
						session.beginTransaction();
						CriteriaQuery <Servicio> cq= session.getCriteriaBuilder().createQuery(Servicio.class);
						cq.from(Servicio.class);
						List<Servicio> servicios = session.createQuery(cq).getResultList();
						
						System.out.println("");
						System.out.println("LISTA DE SERVICIOS \n--------------------------");
						for(Servicio s :servicios) {
							System.out.println("Nombre: "+ s + "\n");
							System.out.println("ID: " + s.getId() );
							System.out.println("Tipo de servicio: " + s.getNombre()+"\n------------------------------------");
						}
						sessionFactory.close();
								
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error al intentar leer la lista de servicios");
			}
		
	}
}
