package base.grandeur.factory.composite;

import base.grandeur.Constante;
import base.grandeur.ElementFonction;
import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.Puissance;
import base.grandeur.factory.ICreerGrandeur;
import base.grandeur.factory.atomique.FactoryDistance;

public class FactorySurface implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		ElementFonction tete = new Puissance(new FactoryDistance().creerGrandeur(), new Constante(2));
		
		Grandeur g = new GrandeurCompose("Surface", Grandeur.Surface, tete);
		
		return g;
	}

}
