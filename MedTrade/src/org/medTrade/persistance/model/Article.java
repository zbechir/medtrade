package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

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

/**
 * Article generated by hbm2java
 */
@Entity
@Table(name = "Article", catalog = "MedTrade")
public class Article implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7586308267303325801L;
	private int idArticle;
	private Categorie categorie;
	private Conditionnement conditionnement;
	private Marque marque;
	private String nom;
	private Double prixAchat;
	private Double prixVente;
	private Double tva;
	private Integer stock;
	private String code;
	private Set<Images> imageses = new HashSet<Images>(0);
	private Set<CommandeFournisseurHasArticle> commandeFournisseurHasArticles = new HashSet<CommandeFournisseurHasArticle>(0);
	private Set<FactureFournisseurHasArticle> factureFournisseurHasArticles = new HashSet<FactureFournisseurHasArticle>(0);
	private Set<CaracteristiquesProduits> caracteristiquesProduitses = new HashSet<CaracteristiquesProduits>(0);
	private Set<PanierHasArticle> panierHasArticles = new HashSet<PanierHasArticle>(0);

	public Article() {
	}

	public Article(int idArticle, Categorie categorie,
			Conditionnement conditionnement, Marque marque) {
		this.idArticle = idArticle;
		this.categorie = categorie;
		this.conditionnement = conditionnement;
		this.marque = marque;
	}

	public Article(int idArticle, Categorie categorie,
			Conditionnement conditionnement, Marque marque, String nom,
			Double prixAchat, Double prixVente, Double tva, Integer stock,
			String code, Set<Images> imageses, Set<CommandeFournisseurHasArticle> commandeFournisseurHasArticles,
			Set<FactureFournisseurHasArticle> factureFournisseurHasArticles, Set<CaracteristiquesProduits> caracteristiquesProduitses,
			Set<PanierHasArticle> panierHasArticles) {
		this.idArticle = idArticle;
		this.categorie = categorie;
		this.conditionnement = conditionnement;
		this.marque = marque;
		this.nom = nom;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.tva = tva;
		this.stock = stock;
		this.code = code;
		this.imageses = imageses;
		this.commandeFournisseurHasArticles = commandeFournisseurHasArticles;
		this.factureFournisseurHasArticles = factureFournisseurHasArticles;
		this.caracteristiquesProduitses = caracteristiquesProduitses;
		this.panierHasArticles = panierHasArticles;
	}

	@Id
	@Column(name = "idArticle", unique = true, nullable = false)
	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Categorie_idCategorie", nullable = false)
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Conditionnement_idConditionnement", nullable = false)
	public Conditionnement getConditionnement() {
		return this.conditionnement;
	}

	public void setConditionnement(Conditionnement conditionnement) {
		this.conditionnement = conditionnement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Marque_idMarque", nullable = false)
	public Marque getMarque() {
		return this.marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Column(name = "Nom")
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PrixAchat", precision = 22, scale = 0)
	public Double getPrixAchat() {
		return this.prixAchat;
	}

	public void setPrixAchat(Double prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Column(name = "PrixVente", precision = 22, scale = 0)
	public Double getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	@Column(name = "TVA", precision = 22, scale = 0)
	public Double getTva() {
		return this.tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	@Column(name = "Stock")
	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Column(name = "Code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<Images> getImageses() {
		return this.imageses;
	}

	public void setImageses(Set<Images> imageses) {
		this.imageses = imageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<CommandeFournisseurHasArticle> getCommandeFournisseurHasArticles() {
		return this.commandeFournisseurHasArticles;
	}

	public void setCommandeFournisseurHasArticles(
			Set<CommandeFournisseurHasArticle> commandeFournisseurHasArticles) {
		this.commandeFournisseurHasArticles = commandeFournisseurHasArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<FactureFournisseurHasArticle> getFactureFournisseurHasArticles() {
		return this.factureFournisseurHasArticles;
	}

	public void setFactureFournisseurHasArticles(
			Set<FactureFournisseurHasArticle> factureFournisseurHasArticles) {
		this.factureFournisseurHasArticles = factureFournisseurHasArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<CaracteristiquesProduits> getCaracteristiquesProduitses() {
		return this.caracteristiquesProduitses;
	}

	public void setCaracteristiquesProduitses(Set<CaracteristiquesProduits> caracteristiquesProduitses) {
		this.caracteristiquesProduitses = caracteristiquesProduitses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
	public Set<PanierHasArticle> getPanierHasArticles() {
		return this.panierHasArticles;
	}

	public void setPanierHasArticles(Set<PanierHasArticle> panierHasArticles) {
		this.panierHasArticles = panierHasArticles;
	}

}
