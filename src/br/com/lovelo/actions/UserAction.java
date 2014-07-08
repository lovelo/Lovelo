package br.com.lovelo.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.lovelo.controller.UserController;
import br.com.lovelo.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = -655771957124532784L;
//	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	private UserController userController = new UserController();
	
	
	
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("lovelo");
        EntityManager em = emf.createEntityManager();
 
        try {
            em.getTransaction().begin();
             
            User user = new User();
//            user.setName("abc123");
            user.setPassword("abc123");
             
            em.persist(user);
             
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
         
        System.out.println("It is over");
    }
	public String login(){
		return "success";
	}
	public String insertUser(){
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
