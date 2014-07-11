package br.com.lovelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import br.com.lovelo.model.User;

public class UserDAO extends DAO{
	
	@SuppressWarnings("unchecked")
	public List<User> listAll(){
		Query query = getEm().createQuery("select object(u) from User as u");
		List<User> list = query.getResultList();
		return list!=null ?list : new ArrayList<User>();
		
	}
	
	public Boolean isUserUnique(String userName){
		Query query = getEm().createQuery("select object(u) from User as u where user = ?").
				setParameter(1, userName);
		List list = query.getResultList();
		return list.isEmpty();
	}
}
