package base.grandeur;

import java.util.HashMap;

import base.grandeur.factory.ICreerGrandeur;

public class Division extends Operateur {

	public Division(ElementFonction a, ElementFonction b) {
		super(a, b);
	}

	public Division(ICreerGrandeur a, ICreerGrandeur b) {
		super(a, b);
	}

	@Override
	public double evaluer(HashMap<String, Double> val) {
		return a.evaluer(val) / b.evaluer(val);
	}

	@Override
	public String symboleOperateur() {
		return "/";
	}

}
