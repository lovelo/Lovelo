package br.com.lovelo.controller;

import br.com.lovelo.dao.UserDAO;
import br.com.lovelo.model.User;

public class UserController {

	UserDAO userDAO = new UserDAO();
	
	public void save(User user){
		userDAO.save(user);
	}
	
	public Boolean isUserUnique(User user){
		return userDAO.isUserUnique(user.getUser());	
	}
	
}
