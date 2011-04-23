package conversion.factory.grandeur.atomique;

import conversion.Grandeur;
import conversion.GrandeurAtomique;
import conversion.factory.ICreerGrandeur;

public class FactoryTemps implements ICreerGrandeur{

	@Override
	public Grandeur creerGrandeur() {
		return new GrandeurAtomique("temps");
	}

}
