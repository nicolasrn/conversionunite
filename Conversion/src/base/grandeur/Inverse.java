package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Inverse extends Operateur {

	public Inverse(ElementFonction b) {
		super(new Constante(1), b, "/");
	}

	public Inverse(ICreerGrandeur b) {
		this(b.creerGrandeur());
	}
	
	@Override
	public double calculer(double va, double vb) {
		return va / vb;
	}

}
