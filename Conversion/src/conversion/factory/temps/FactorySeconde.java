package conversion.factory.temps;

import conversion.GrandeurAtomique;
import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactorySeconde implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("seconde", "s", new GrandeurAtomique("Argent"));
	}

}
