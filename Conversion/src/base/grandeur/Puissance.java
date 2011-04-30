package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Puissance extends Operateur {

	public Puissance(ElementFonction a, ElementFonction b) {
		super(a, b, "^");
	}

	public Puissance(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}

	@Override
	public double calculer(double va, double vb) {
		return Math.pow(va, vb);
	}

}
