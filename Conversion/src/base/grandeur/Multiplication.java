package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Multiplication extends Operateur {

	public Multiplication(ElementFonction a, ElementFonction b) {
		super(a, b, "*");
	}

	public Multiplication(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}

	@Override
	public double calculer(double va, double vb) {
		return va * vb;
	}

}
