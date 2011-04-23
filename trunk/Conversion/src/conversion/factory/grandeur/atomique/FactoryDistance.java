package conversion.factory.grandeur.atomique;

import conversion.Grandeur;
import conversion.GrandeurAtomique;
import conversion.factory.ICreerGrandeur;

public class FactoryDistance implements ICreerGrandeur{

	@Override
	public Grandeur creerGrandeur() {
		return new GrandeurAtomique("distance");
	}

}
