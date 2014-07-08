package br.com.saleservice.controller;

import br.com.saleservice.dao.UserDAO;
import br.com.saleservice.model.User;

public class UserController {

	public void save(User user){
		UserDAO userDAO = new UserDAO();
		userDAO.save(user);
	}
}
