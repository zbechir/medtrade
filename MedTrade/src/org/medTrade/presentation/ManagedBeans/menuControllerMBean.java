package org.medTrade.presentation.ManagedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class menuControllerMBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 443272433464492231L;
	
	

	public menuControllerMBean() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String goToAddUser(){
		return "addUser";
	}
}
