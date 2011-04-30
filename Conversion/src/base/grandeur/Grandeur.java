package base.grandeur;

public abstract class Grandeur extends ElementFonction implements Cloneable {
	public static final String Argent = "A";
	public static final String Temps = "T";
	public static final String Distance = "D";
	public static final String Surface = "S";
	public static final String Acceleration = "Ac";
	public static final String Vitesse = "V";
	
	public static final String Force = "F";
	public static final String Pression = "P";
	public static final String Masse = "M";
	
	protected String nom;
	
	public Grandeur(String nom, String abr)
	{
		this.nom = nom;
		this.abr = abr;
	}

	@Override
	public String toString() {
		return nom;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Grandeur other = (Grandeur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
}
