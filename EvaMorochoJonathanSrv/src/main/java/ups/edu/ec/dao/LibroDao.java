package ups.edu.ec.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.Model.Libro;


@Stateless
public class LibroDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Libro lbr) {
		em.persist(lbr);
	}
	
	public void update(Libro lbr) {
		em.merge(lbr);
	}
	
	public Libro read(int id) {
		Libro p = em.find(Libro.class, id);
		return p;
	}
	
	public void delete(int id) {
		Libro p = em.find(Libro.class, id);
		em.remove(p);
	}

	
	public List<Libro> getList (){
		//String jpql2="SELECT p FROM Persona p";
		//nombre= nombre+"%";
		//Query query= em.createQuery(jpql2, Libro.class);
		//query.setParameter(1, nombre);
		
		List<Libro> listado= new  ArrayList<Libro>();
		String jpql2="SELECT p FROM Libro p";
		Query query= em.createQuery(jpql2, Libro.class);
		
		listado= query.getResultList();
		return listado;
	}
}
