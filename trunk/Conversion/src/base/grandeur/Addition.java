package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Addition extends Operateur {

	public Addition(ElementFonction a, ElementFonction b) {
		super(a, b, "+");
	}

	public Addition(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}

	@Override
	public double calculer(double va, double vb) {
		return va + vb;
	}

}
