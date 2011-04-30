package base.grandeur.factory.composite;

import base.grandeur.Grandeur;
import base.grandeur.GrandeurCompose;
import base.grandeur.Multiplication;
import base.grandeur.Operateur;
import base.grandeur.factory.ICreerGrandeur;
import base.grandeur.factory.atomique.FactoryMasse;

public class FactoryForce implements ICreerGrandeur {

	@Override
	public Grandeur creerGrandeur() {
		//Operateur mul = new Puissance(new FactoryTemps().creerGrandeur(), new Constante(2));
		//Operateur mul = new Multiplication(new FactoryTemps(), new FactoryTemps());
		//Operateur tete = new Division(new FactoryDistance().creerGrandeur(), mul);
		Operateur tete = new Multiplication(new FactoryMasse(), new FactoryAcceleration());
		Grandeur g = new GrandeurCompose("force", Grandeur.Force, tete);
		
		return g;
	}

}
