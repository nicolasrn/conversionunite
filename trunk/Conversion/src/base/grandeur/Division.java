package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public class Division extends Operateur {

	public Division(ElementFonction a, ElementFonction b) {
		super(a, b);
	}

	public Division(ICreerGrandeur a, ICreerGrandeur b) {
		super(a, b);
	}

	@Override
	public Object evaluer() {
		return a.evaluer() + "/" + b.evaluer();
	}

}
