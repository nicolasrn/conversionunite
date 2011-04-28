package base.grandeur;

import base.grandeur.factory.ICreerGrandeur;

public abstract class Operateur extends ElementFonction {

	protected ElementFonction a, b;
	
	public Operateur(ElementFonction a, ElementFonction b) {
		this.a = a;
		this.b = b;
	}
	
	public Operateur(ICreerGrandeur a, ICreerGrandeur b) {
		this(a.creerGrandeur(), b.creerGrandeur());
	}
}
