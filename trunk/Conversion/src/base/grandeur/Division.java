package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Division extends Operateur {

	public Division(ElementFonction a, ElementFonction b) {
		super(a, b, "/");
	}

	public Division(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}
	
	@Override
	public double calculer(double va, double vb) {
		return va / vb;
	}

}
