package br.com.lovelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.lovelo.model.User;

public class UserDAO extends DAO{
	
//	@SuppressWarnings("unchecked")
//	public List<User> listAll(){
//		EntityManager em = getEntityManager();
//		Query query = em.createQuery("select object(u) from User as u");
//		List<User> list = query.getResultList();
//		return list!=null ?list : new ArrayList<User>();
//		
//	}
}
