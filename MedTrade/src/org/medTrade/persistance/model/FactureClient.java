package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FactureClient generated by hbm2java
 */
@Entity
@Table(name = "FactureClient", catalog = "MedTrade")
public class FactureClient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1335311563419799777L;
	private int idFactureClient;
	private CommandeClient commandeClient;
	private String code;
	private Date dateCreation;
	private Date datelivraison;
	private Double montantHt;
	private Double taxes;
	private Double montantTtc;

	public FactureClient() {
	}

	public FactureClient(int idFactureClient, CommandeClient commandeClient) {
		this.idFactureClient = idFactureClient;
		this.commandeClient = commandeClient;
	}

	public FactureClient(int idFactureClient, CommandeClient commandeClient,
			String code, Date dateCreation, Date datelivraison,
			Double montantHt, Double taxes, Double montantTtc) {
		this.idFactureClient = idFactureClient;
		this.commandeClient = commandeClient;
		this.code = code;
		this.dateCreation = dateCreation;
		this.datelivraison = datelivraison;
		this.montantHt = montantHt;
		this.taxes = taxes;
		this.montantTtc = montantTtc;
	}

	@Id
	@Column(name = "idFactureClient", unique = true, nullable = false)
	public int getIdFactureClient() {
		return this.idFactureClient;
	}

	public void setIdFactureClient(int idFactureClient) {
		this.idFactureClient = idFactureClient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CommandeClient_idCommandeClient", nullable = false)
	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	@Column(name = "Code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date Creation", length = 19)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Datelivraison", length = 19)
	public Date getDatelivraison() {
		return this.datelivraison;
	}

	public void setDatelivraison(Date datelivraison) {
		this.datelivraison = datelivraison;
	}

	@Column(name = "MontantHT", precision = 22, scale = 0)
	public Double getMontantHt() {
		return this.montantHt;
	}

	public void setMontantHt(Double montantHt) {
		this.montantHt = montantHt;
	}

	@Column(name = "TAXES", precision = 22, scale = 0)
	public Double getTaxes() {
		return this.taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	@Column(name = "MontantTTC", precision = 22, scale = 0)
	public Double getMontantTtc() {
		return this.montantTtc;
	}

	public void setMontantTtc(Double montantTtc) {
		this.montantTtc = montantTtc;
	}

}
