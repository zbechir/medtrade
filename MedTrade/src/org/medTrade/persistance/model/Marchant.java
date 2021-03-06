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
 * Marchant generated by hbm2java
 */
@Entity
@Table(name = "Marchant", catalog = "MedTrade")
public class Marchant implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2863957098834175636L;
	private Integer idMarchant;
	private User user;
	private String rs;
	private String rc;
	private String tva;
	private String adresse;
	private String email;
	private String status;
	private Date dateCreation;
	private Set<FactureFournisseur> factureFournisseurs = new HashSet<FactureFournisseur>(0);
	private Set<Marque> marques = new HashSet<Marque>(0);

	public Marchant() {
	}

	public Marchant(User user) {
		this.user = user;
	}

	public Marchant(User user, String rs, String rc, String tva,
			String adresse, String email, String status, Date dateCreation,
			Set<FactureFournisseur> factureFournisseurs, Set<Marque> marques) {
		this.user = user;
		this.rs = rs;
		this.rc = rc;
		this.tva = tva;
		this.adresse = adresse;
		this.email = email;
		this.status = status;
		this.dateCreation = dateCreation;
		this.factureFournisseurs = factureFournisseurs;
		this.marques = marques;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idMarchant", unique = true, nullable = false)
	public Integer getIdMarchant() {
		return this.idMarchant;
	}

	public void setIdMarchant(Integer idMarchant) {
		this.idMarchant = idMarchant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "RS")
	public String getRs() {
		return this.rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	@Column(name = "RC")
	public String getRc() {
		return this.rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	@Column(name = "TVA")
	public String getTva() {
		return this.tva;
	}

	public void setTva(String tva) {
		this.tva = tva;
	}

	@Column(name = "Adresse")
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "Email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateCreation", length = 19)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marchant")
	public Set<FactureFournisseur> getFactureFournisseurs() {
		return this.factureFournisseurs;
	}

	public void setFactureFournisseurs(Set<FactureFournisseur> factureFournisseurs) {
		this.factureFournisseurs = factureFournisseurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marchant")
	public Set<Marque> getMarques() {
		return this.marques;
	}

	public void setMarques(Set<Marque> marques) {
		this.marques = marques;
	}

}
