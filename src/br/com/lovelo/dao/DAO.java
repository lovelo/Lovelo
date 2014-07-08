package br.com.lovelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class DAO{
	@PersistenceContext
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public DAO() {
		this.emf = Persistence.createEntityManagerFactory("lovelo");
		this.em = emf.createEntityManager();
	}
	
	public void save(Object obj){
		DAO dao = new DAO();
		EntityTransaction tx = dao.getEm().getTransaction();
		try{
			tx.begin();
			dao.getEm().persist(obj);
			tx.commit();			
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(tx.isActive()){
				dao.getEmf().close();
			}
		}
	}

	public void remove(Object obj){
		DAO dao = new DAO();
		EntityTransaction tx = dao.getEm().getTransaction();
		try{
			tx.begin();
			dao.getEm().remove(obj);
			tx.commit();			
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(tx.isActive()){
				dao.getEmf().close();
			}
		}
	}
	
	public void update(Object obj){
		DAO dao = new DAO();
		EntityTransaction tx = dao.getEm().getTransaction();
		try{
			tx.begin();
			dao.getEm().refresh(obj);
			tx.commit();			
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(tx.isActive()){
				dao.getEmf().close();
			}
		}
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}


	public EntityManager getEm() {
		return em;
	}
}
