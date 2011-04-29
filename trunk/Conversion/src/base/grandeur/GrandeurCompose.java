package base.grandeur;

import java.util.HashMap;

public class GrandeurCompose extends Grandeur {
	private ElementFonction tete;
	
	public GrandeurCompose(String nom, String abr, ElementFonction a) {
		super(nom, abr);
		this.tete = a;
	}
	
	@Override
	public double evaluer(HashMap<String, Double> val) {
		return tete.evaluer(val);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " : " + tete;
	}

	/**
	 * @return the tete
	 */
	public ElementFonction getTete() {
		return tete;
	}

	/**
	 * @param tete the tete to set
	 */
	public void setTete(ElementFonction tete) {
		this.tete = tete;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tete == null) ? 0 : tete.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrandeurCompose other = (GrandeurCompose) obj;
		if (tete == null) {
			if (other.tete != null)
				return false;
		} else if (!tete.equals(other.tete))
			return false;
		return true;
	}
}
