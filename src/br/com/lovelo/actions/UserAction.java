package br.com.lovelo.actions;

import br.com.lovelo.controller.UserController;
import br.com.lovelo.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = -655771957124532784L;
//	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	private UserController userController = new UserController();
	
	
	public String login(){
		return "success";
	}
	public String loginUser(){
		userController.save(user);
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserController getUserController() {
		return userController;
	}
	public void setUserController(UserController userController) {
		this.userController = userController;
	}
	
}
