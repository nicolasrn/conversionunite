package base.grandeur.factory.atomique;

import base.grandeur.Grandeur;
import base.grandeur.GrandeurAtomique;
import base.grandeur.factory.ICreerGrandeur;

public class FactoryTemperature implements ICreerGrandeur{

	@Override
	public Grandeur creerGrandeur() {
		return new GrandeurAtomique("temperature", Grandeur.Temperature);
	}

}
