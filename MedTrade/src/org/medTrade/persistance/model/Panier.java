package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Panier generated by hbm2java
 */
@Entity
@Table(name = "Panier", catalog = "MedTrade")
public class Panier implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2126688534815694761L;
	private int idPanier;
	private Client client;
	private String code;
	private Date dateCreation;
	private String status;
	private Set<PanierHasArticle> panierHasArticles = new HashSet<PanierHasArticle>(0);
	private Set<CommandeClient> commandeClients = new HashSet<CommandeClient>(0);

	public Panier() {
	}

	public Panier(int idPanier, Client client) {
		this.idPanier = idPanier;
		this.client = client;
	}

	public Panier(int idPanier, Client client, String code, Date dateCreation,
			String status, Set<PanierHasArticle> panierHasArticles, Set<CommandeClient> commandeClients) {
		this.idPanier = idPanier;
		this.client = client;
		this.code = code;
		this.dateCreation = dateCreation;
		this.status = status;
		this.panierHasArticles = panierHasArticles;
		this.commandeClients = commandeClients;
	}

	@Id
	@Column(name = "idPanier", unique = true, nullable = false)
	public int getIdPanier() {
		return this.idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Client_idClient", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "Code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateCreation", length = 19)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Column(name = "Status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "panier")
	public Set<PanierHasArticle> getPanierHasArticles() {
		return this.panierHasArticles;
	}

	public void setPanierHasArticles(Set<PanierHasArticle> panierHasArticles) {
		this.panierHasArticles = panierHasArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "panier")
	public Set<CommandeClient> getCommandeClients() {
		return this.commandeClients;
	}

	public void setCommandeClients(Set<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}

}
