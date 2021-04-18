package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Cadaster;
import br.com.fiap.util.EntityManagerFacade;

public class CadasterDAO {
	
	private EntityManager manager = EntityManagerFacade.getEntityManager();
	
	public void save(Cadaster cadaster) {
		
		manager.getTransaction().begin();
		manager.persist(cadaster);
		manager.getTransaction().commit();
		
		manager.clear();
		
	}
	public List<Cadaster> getAll() {
		String jpql = "SELECT c FROM Cadaster c";
		TypedQuery<Cadaster> createQuery = manager.createQuery(jpql, Cadaster.class);
		return createQuery.getResultList();
	}
}
