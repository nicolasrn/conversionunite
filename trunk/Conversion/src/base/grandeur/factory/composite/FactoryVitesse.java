package base.grandeur.factory.composite;

import base.grandeur.Division;
import base.grandeur.ElementFonction;
import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.factory.ICreerGrandeur;
import base.grandeur.factory.atomique.FactoryDistance;
import base.grandeur.factory.atomique.FactoryTemps;

public class FactoryVitesse implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		Division tete = new Division(new FactoryDistance(), new FactoryTemps());
		
		Grandeur g = new GrandeurCompose("vitesse", tete);
		
		return g;
	}

}
