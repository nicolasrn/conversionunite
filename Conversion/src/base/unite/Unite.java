package base.unite;

import base.grandeur.Grandeur;
import base.grandeur.factory.ICreerGrandeur;

public abstract class Unite implements Cloneable {
	private String nom;
	private String abr;
	private Grandeur grandeur;
	
	/**
	 * 
	 * @param nom
	 * @param abr
	 * @param grandeur
	 */
	public Unite(String nom, String abr, Grandeur grandeur) {
		super();
		this.nom = nom;
		this.abr = abr;
		this.grandeur = grandeur;
	}
	
	/**
	 * 
	 * @param nom
	 * @param abr
	 * @param grandeur
	 */
	public Unite(String nom, String abr, ICreerGrandeur grandeur) {
		this(nom, abr, grandeur.creerGrandeur());
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the abr
	 */
	public String getAbr() {
		return abr;
	}

	public Grandeur getGrandeur() {
		return grandeur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abr == null) ? 0 : abr.hashCode());
		result = prime * result
				+ ((grandeur == null) ? 0 : grandeur.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unite other = (Unite) obj;
		if (abr == null) {
			if (other.abr != null)
				return false;
		} else if (!abr.equals(other.abr))
			return false;
		if (grandeur == null) {
			if (other.grandeur != null)
				return false;
		} else if (!grandeur.equals(other.grandeur))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return abr;
	}	
}
