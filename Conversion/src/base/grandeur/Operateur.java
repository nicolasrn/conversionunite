package base.grandeur;

import java.util.HashMap;

import base.grandeur.factory.ICreerGrandeur;

public abstract class Operateur extends ElementFonction {

	protected ElementFonction a, b;
	
	public Operateur(ElementFonction a, ElementFonction b, String abr) {
		this.a = a;
		this.b = b;
		this.abr = abr;
	}
	
	public Operateur(ICreerGrandeur a, ICreerGrandeur b, String abr) {
		this(a.creerGrandeur(), b.creerGrandeur(), abr);
	}
	
	@Override
	public String ecrireEvaluation(HashMap<String, Double> val)
	{
		//b.ecrireEvaluation(val)
		String 	stra = "" + (val.get(a.abr) != null ? val.get(a.abr) : a.ecrireEvaluation(val)),
				strb = "" + (val.get(b.abr) != null ? val.get(b.abr) : b.ecrireEvaluation(val));
		
		return stra + abr + strb;
	}
	
	@Override
	public String toString()
	{
		return a + abr + b;
	}
	
	@Override
	public double evaluer(HashMap<String, Double> val)
	{
		double va, vb;
		
		//si une valeur est déjà spécifier dans les variables on ne vas pas plus loin
		if (val.get(a.getAbr()) != null) 
			va = val.get(a.getAbr());
		else
			va = a.evaluer(val);
		
		if (val.get(b.getAbr()) != null)
			vb = val.get(b.getAbr());
		else
			vb = b.evaluer(val);
		
		return calculer(va, vb);
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
	
	public abstract double calculer(double va, double vb);
}
