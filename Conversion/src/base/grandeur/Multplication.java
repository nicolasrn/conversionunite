package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Multplication extends Operateur {

	public Multplication(ElementFonction a, ElementFonction b) {
		super(a, b);
	}

	public Multplication(ICreerGrandeur a, ICreerGrandeur b) {
		super(a, b);
	}

	@Override
	public Object evaluer() {
		return a.evaluer() + "*" + b.evaluer();
	}

}
