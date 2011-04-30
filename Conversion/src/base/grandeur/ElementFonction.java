package base.grandeur;

import java.util.HashMap;

public abstract class ElementFonction {
	protected String abr;
	
	/**
	 * @return the abr
	 */
	public String getAbr() {
		return abr;
	}
	
	public abstract double evaluer(HashMap<String, Double> val);
	
	public abstract String ecrireEvaluation(HashMap<String, Double> val);

	public abstract String toString();
}
