package org.medTrade.presentation.ManagedBeans;

import java.io.Serializable;

import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean
@RequestScoped
public class authentificationMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4558814424254163321L;
	private String userName = null;
	private String password = null;

	@ManagedProperty(value = "#{authenticationManager}")
	private AuthenticationManager authenticationManager = null;

	public String login() {
		try {
			Authentication request = new UsernamePasswordAuthenticationToken(
					this.getUserName(), this.getPassword());
			Authentication result = authenticationManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "incorrect";
		}
		return "correct";
	}

	public String cancel() {
		return null;
	}

	public String logout() {
		SecurityContextHolder.clearContext();
		return "loggedout";
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(
			AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
