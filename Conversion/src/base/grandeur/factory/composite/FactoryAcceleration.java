package base.grandeur.factory.composite;

import base.grandeur.Division;
import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.Multiplication;
import base.grandeur.factory.ICreerGrandeur;
import base.grandeur.factory.atomique.FactoryDistance;
import base.grandeur.factory.atomique.FactoryTemps;

public class FactoryAcceleration implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		Multiplication mul = new Multiplication(new FactoryTemps(), new FactoryTemps());
		Division tete = new Division(new FactoryDistance().creerGrandeur(), mul);
		Grandeur g = new GrandeurCompose("acceleration", Grandeur.Acceleration, tete);
		
		return g;
	}

}
