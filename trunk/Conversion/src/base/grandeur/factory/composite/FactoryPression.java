package base.grandeur.factory.composite;

import base.grandeur.Division;
import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.Operateur;
import base.grandeur.factory.ICreerGrandeur;

public class FactoryPression implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		//Operateur mul = new Puissance(new FactoryTemps().creerGrandeur(), new Constante(2));
		//Operateur mul = new Multiplication(new FactoryTemps(), new FactoryTemps());
		//Operateur tete = new Division(new FactoryDistance().creerGrandeur(), mul);
		Operateur tete = new Division(new FactoryForce(), new FactorySurface());
		Grandeur g = new GrandeurCompose("pression", Grandeur.Pression, tete);
		
		return g;
	}

}
