package base.grandeur.factory.atomique;

import base.grandeur.Grandeur;
import base.grandeur.GrandeurAtomique;
import base.grandeur.factory.ICreerGrandeur;

public class FactoryTemps implements ICreerGrandeur{

	@Override
	public Grandeur creerGrandeur() {
		return new GrandeurAtomique("temps", Grandeur.Temps);
	}

}
