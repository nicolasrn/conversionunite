package base.grandeur;

import java.util.HashMap;

public class Variable extends ElementFonction {
	
	public Variable(String abr)
	{
		this.abr = abr;
	}

	@Override
	public String toString() {
		return abr;
	}

	@Override
	public double evaluer(HashMap<String, Double> val) {
		return val.get(this.abr);
	}

	@Override
	public String ecrireEvaluation(HashMap<String, Double> val) {
		return "" + val.get(this.abr);
	}

}
