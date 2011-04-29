package base.grandeur;

import java.util.HashMap;

import base.grandeur.factory.ICreerGrandeur;

public class Puissance extends Operateur {

	public Puissance(ElementFonction a, ElementFonction b) {
		super(a, b);
	}

	public Puissance(ICreerGrandeur a, ICreerGrandeur b) {
		super(a, b);
	}

	@Override
	public double evaluer(HashMap<String, Double> val) {
		return Math.pow(a.evaluer(val), b.evaluer(val));
	}

	@Override
	public String symboleOperateur() {
		return "^";
	}
}
