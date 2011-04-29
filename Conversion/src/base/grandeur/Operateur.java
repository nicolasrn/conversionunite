package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public abstract class Operateur extends ElementFonction {

	protected ElementFonction a, b;
	
	public Operateur(ElementFonction a, ElementFonction b) {
		this.a = a;
		this.b = b;
	}
	
	public Operateur(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}
	
	@Override
	public String toString()
	{
		return a + symboleOperateur() + b;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
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
		Operateur other = (Operateur) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	public abstract String symboleOperateur();
}
