package conversion;

public abstract class Unite implements Cloneable {
	private String nom;
	private String abr;
	
	/**
	 * 
	 * @param nom
	 * @param abr
	 */
	public Unite(String nom, String abr) {
		super();
		this.nom = nom;
		this.abr = abr;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abr == null) ? 0 : abr.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getAbr();
	}
}
