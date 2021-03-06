package org.medTrade.persistance.model;

// Generated 23 d�c. 2014 10:48:16 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CommandeFournisseurHasArticleId generated by hbm2java
 */
@Embeddable
public class CommandeFournisseurHasArticleId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722724925227713510L;
	private int commandeFournisseurIdCommandeFournisseur;
	private int articleIdArticle;

	public CommandeFournisseurHasArticleId() {
	}

	public CommandeFournisseurHasArticleId(
			int commandeFournisseurIdCommandeFournisseur, int articleIdArticle) {
		this.commandeFournisseurIdCommandeFournisseur = commandeFournisseurIdCommandeFournisseur;
		this.articleIdArticle = articleIdArticle;
	}

	@Column(name = "CommandeFournisseur_idCommandeFournisseur", nullable = false)
	public int getCommandeFournisseurIdCommandeFournisseur() {
		return this.commandeFournisseurIdCommandeFournisseur;
	}

	public void setCommandeFournisseurIdCommandeFournisseur(
			int commandeFournisseurIdCommandeFournisseur) {
		this.commandeFournisseurIdCommandeFournisseur = commandeFournisseurIdCommandeFournisseur;
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
		if (!(other instanceof CommandeFournisseurHasArticleId))
			return false;
		CommandeFournisseurHasArticleId castOther = (CommandeFournisseurHasArticleId) other;

		return (this.getCommandeFournisseurIdCommandeFournisseur() == castOther
				.getCommandeFournisseurIdCommandeFournisseur())
				&& (this.getArticleIdArticle() == castOther
						.getArticleIdArticle());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ this.getCommandeFournisseurIdCommandeFournisseur();
		result = 37 * result + this.getArticleIdArticle();
		return result;
	}

}
