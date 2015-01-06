package org.medTrade.presentation.ManagedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@ManagedBean
@RequestScoped
public class menuMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6572768005977762284L;
	private MenuModel model;
	private MenuModel modelAdmin;
	

	public menuMBean() {
		createAdminMenu();
		createMenu();
	}

	public void createAdminMenu() {
		modelAdmin = new DefaultMenuModel();

		// Utilisateurs
		DefaultSubMenu submenu = new DefaultSubMenu("Gestion des Utilisateurs");
		DefaultMenuItem menuItem = new DefaultMenuItem("Ajouter Utilisateur");
		menuItem.setCommand("#{menuControllerMBean.goToAddUser}");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Modifier Utilisateur");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Lister Utilisateur");
		submenu.addElement(menuItem);
		modelAdmin.addElement(submenu);
		// Marchants
		submenu = new DefaultSubMenu("Gestion des Marchants");
		menuItem = new DefaultMenuItem("Ajouter Marchant");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Modifier Marchant");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Supprimer Marchant");
		submenu.addElement(menuItem);
		modelAdmin.addElement(submenu);
		// Marques
		submenu = new DefaultSubMenu("Gestion des Marques");
		menuItem = new DefaultMenuItem("Ajouter Marque");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Modifier Marque");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Supprimer Marque");
		submenu.addElement(menuItem);
		modelAdmin.addElement(submenu);
		// Categories
		submenu = new DefaultSubMenu("Gestion des Categories");
		menuItem = new DefaultMenuItem("Ajouter Categorie");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Modifier Categorie");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Supprimer Categorie");
		submenu.addElement(menuItem);
		modelAdmin.addElement(submenu);
		// Conditionnement
		submenu = new DefaultSubMenu("Gestion des Conditionnements");
		menuItem = new DefaultMenuItem("Ajouter Conditionnement");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Modifier Conditionnement");
		submenu.addElement(menuItem);
		menuItem = new DefaultMenuItem("Supprimer Conditionnement");
		submenu.addElement(menuItem);
		modelAdmin.addElement(submenu);
	}

	public void createMenu() {
		model = new DefaultMenuModel();
		DefaultMenuItem acceuil = new DefaultMenuItem();
		acceuil.setUrl("/administration/backOffice/main.xhtml");
		acceuil.setValue("Acceuil");
		model.addElement(acceuil);

		DefaultMenuItem logout = new DefaultMenuItem();
		logout.setCommand("#{authentificationMBean.logout}");
		logout.setValue("logout");
		model.addElement(logout);
	}

	public MenuModel getModelAdmin() {
		return modelAdmin;
	}

	public MenuModel getModel() {
		return model;
	}
	
	

	
}
