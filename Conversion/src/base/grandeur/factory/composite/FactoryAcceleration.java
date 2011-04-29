package base.grandeur.factory.composite;

import base.grandeur.Division;
import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.Operateur;
import base.grandeur.factory.ICreerGrandeur;
import base.grandeur.factory.atomique.FactoryTemps;

public class FactoryAcceleration implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		//Operateur mul = new Puissance(new FactoryTemps().creerGrandeur(), new Constante(2));
		//Operateur mul = new Multiplication(new FactoryTemps(), new FactoryTemps());
		//Operateur tete = new Division(new FactoryDistance().creerGrandeur(), mul);
		Grandeur gr = new FactoryVitesse().creerGrandeur();
		Operateur tete = new Division(gr, new FactoryTemps().creerGrandeur());
		Grandeur g = new GrandeurCompose("acceleration", Grandeur.Acceleration, tete);
		
		return g;
	}

}
