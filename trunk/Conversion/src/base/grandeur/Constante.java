package base.grandeur;

import java.util.HashMap;

public class Constante extends ElementFonction {
	private double val;
	
	public Constante(double val)
	{
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
}
