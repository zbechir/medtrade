package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FactureFournisseurHasArticleId generated by hbm2java
 */
@Embeddable
public class FactureFournisseurHasArticleId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3229187289538376774L;
	private int factureFournisseurIdFactureFournisseur;
	private int articleIdArticle;

	public FactureFournisseurHasArticleId() {
	}

	public FactureFournisseurHasArticleId(
			int factureFournisseurIdFactureFournisseur, int articleIdArticle) {
		this.factureFournisseurIdFactureFournisseur = factureFournisseurIdFactureFournisseur;
		this.articleIdArticle = articleIdArticle;
	}

	@Column(name = "FactureFournisseur_idFactureFournisseur", nullable = false)
	public int getFactureFournisseurIdFactureFournisseur() {
		return this.factureFournisseurIdFactureFournisseur;
	}

	public void setFactureFournisseurIdFactureFournisseur(
			int factureFournisseurIdFactureFournisseur) {
		this.factureFournisseurIdFactureFournisseur = factureFournisseurIdFactureFournisseur;
	}

	@Column(name = "Article_idArticle", nullable = false)
	public int getArticleIdArticle() {
		return this.articleIdArticle;
	}

	public void setArticleIdArticle(int articleIdArticle) {
		this.articleIdArticle = articleIdArticle;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FactureFournisseurHasArticleId))
			return false;
		FactureFournisseurHasArticleId castOther = (FactureFournisseurHasArticleId) other;

		return (this.getFactureFournisseurIdFactureFournisseur() == castOther
				.getFactureFournisseurIdFactureFournisseur())
				&& (this.getArticleIdArticle() == castOther
						.getArticleIdArticle());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getFactureFournisseurIdFactureFournisseur();
		result = 37 * result + this.getArticleIdArticle();
		return result;
	}

}
