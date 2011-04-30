package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Soustraction extends Operateur {

	public Soustraction(ElementFonction a, ElementFonction b) {
		super(a, b, "-");
	}

	public Soustraction(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}

	@Override
	public double calculer(double va, double vb) {
		return va - vb;
	}

}
