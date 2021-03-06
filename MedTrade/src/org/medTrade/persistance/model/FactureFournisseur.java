package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FactureFournisseur generated by hbm2java
 */
@Entity
@Table(name = "FactureFournisseur", catalog = "MedTrade")
public class FactureFournisseur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4165056505793698465L;
	private Integer idFactureFournisseur;
	private Marchant marchant;
	private String code;
	private Date dateReception;
	private Date dateLivraison;
	private double montantHt;
	private double taxes;
	private double montantTtc;
	private String statut;
	private Set<FactureFournisseurHasArticle> factureFournisseurHasArticles = new HashSet<FactureFournisseurHasArticle>(0);

	public FactureFournisseur() {
	}

	public FactureFournisseur(Marchant marchant, String code,
			Date dateReception, Date dateLivraison, double montantHt,
			double taxes, double montantTtc, String statut) {
		this.marchant = marchant;
		this.code = code;
		this.dateReception = dateReception;
		this.dateLivraison = dateLivraison;
		this.montantHt = montantHt;
		this.taxes = taxes;
		this.montantTtc = montantTtc;
		this.statut = statut;
	}

	public FactureFournisseur(Marchant marchant, String code,
			Date dateReception, Date dateLivraison, double montantHt,
			double taxes, double montantTtc, String statut,
			Set<FactureFournisseurHasArticle> factureFournisseurHasArticles) {
		this.marchant = marchant;
		this.code = code;
		this.dateReception = dateReception;
		this.dateLivraison = dateLivraison;
		this.montantHt = montantHt;
		this.taxes = taxes;
		this.montantTtc = montantTtc;
		this.statut = statut;
		this.factureFournisseurHasArticles = factureFournisseurHasArticles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFactureFournisseur", unique = true, nullable = false)
	public Integer getIdFactureFournisseur() {
		return this.idFactureFournisseur;
	}

	public void setIdFactureFournisseur(Integer idFactureFournisseur) {
		this.idFactureFournisseur = idFactureFournisseur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Marchant_idMarchant", nullable = false)
	public Marchant getMarchant() {
		return this.marchant;
	}

	public void setMarchant(Marchant marchant) {
		this.marchant = marchant;
	}

	@Column(name = "Code", nullable = false)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateReception", nullable = false, length = 19)
	public Date getDateReception() {
		return this.dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateLivraison", nullable = false, length = 19)
	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	@Column(name = "MontantHT", nullable = false, precision = 22, scale = 0)
	public double getMontantHt() {
		return this.montantHt;
	}

	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}

	@Column(name = "TAXES", nullable = false, precision = 22, scale = 0)
	public double getTaxes() {
		return this.taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	@Column(name = "MontantTTC", nullable = false, precision = 22, scale = 0)
	public double getMontantTtc() {
		return this.montantTtc;
	}

	public void setMontantTtc(double montantTtc) {
		this.montantTtc = montantTtc;
	}

	@Column(name = "Statut", nullable = false)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "factureFournisseur")
	public Set<FactureFournisseurHasArticle> getFactureFournisseurHasArticles() {
		return this.factureFournisseurHasArticles;
	}

	public void setFactureFournisseurHasArticles(
			Set<FactureFournisseurHasArticle> factureFournisseurHasArticles) {
		this.factureFournisseurHasArticles = factureFournisseurHasArticles;
	}

}
