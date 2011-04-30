package base.grandeur;

import java.util.HashMap;

public class Constante extends ElementFonction {
	private double val;
	
	public Constante(double val)
	{
		this.abr = "";
		this.val = val;
	}

	@Override
	public String toString() {
		return "" + val;
	}

	@Override
	public double evaluer(HashMap<String, Double> val) {
		return this.val;
	}

	@Override
	public String ecrireEvaluation(HashMap<String, Double> val) {
		return "" + this.val;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(val);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Constante other = (Constante) obj;
		if (Double.doubleToLongBits(val) != Double.doubleToLongBits(other.val))
			return false;
		return true;
	}
}
