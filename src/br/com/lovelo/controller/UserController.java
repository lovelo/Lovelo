package br.com.lovelo.controller;

import br.com.lovelo.dao.UserDAO;
import br.com.lovelo.model.User;

public class UserController {

	public void save(User user){
		UserDAO userDAO = new UserDAO();
		userDAO.save(user);
	}
}