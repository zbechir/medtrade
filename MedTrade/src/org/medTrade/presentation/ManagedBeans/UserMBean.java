package org.medTrade.presentation.ManagedBeans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.medTrade.persistance.model.Role;
import org.medTrade.persistance.model.User;
import org.medTrade.service.RoleService;
import org.medTrade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;



@RequestScoped
@ManagedBean
public class UserMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4496276161585678826L;
	@ManagedProperty("#{UserService}")
	private transient UserService userService;
	@ManagedProperty("#{RoleService}")
	private  RoleService roleService;

	private String Nom;
	private String Prenom;
	private String login;
	private String password;
	private String Email;
	private Role role;
	private List<Role> allRoles;

	@PostConstruct
	public void init() {
		allRoles = roleService.getAll();
	}

	public UserMBean() {
	}

	public void adduser() {
		User user = new User();
		user.setDateCreation(new Date());
		user.setEmail(Email);
		user.setLogin(login);
		user.setNom(Nom);
		user.setPassword(password);
		user.setPrenom(Prenom);
		user.setRole(role);
		userService.addUser(user);
		
		FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Success!", "User Added successfully!"));
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Role> getAllRoles() {
		return allRoles;
	}

	public void setAllRoles(List<Role> allRoles) {
		this.allRoles = allRoles;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

}
