package br.com.lovelo.actions;

import br.com.lovelo.controller.UserController;
import br.com.lovelo.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = -655771957124532784L;
	
	private User user = new User();
	private UserController userController = new UserController();
	
	public String loginUser(){		
		userController.save(user);
		this.user.setUserLogged(user.getUser());
		this.user.emptyUser();;
		this.clearErrors();
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
	
	public void validate(){
		if(this.user.isLoginNotValid()){
			this.user = null;
			this.clearErrors();
			addFieldError("user.user", "O usu‡rio ou a senha est‹o inv‡lidos.");
		}else if(!userController.isUserUnique(user)){
			this.user = null;
			this.clearErrors();
			addFieldError("user.user", "Este usu‡rio j‡ existe. Favor ingressar com outro.");
		}
	}
	
}
