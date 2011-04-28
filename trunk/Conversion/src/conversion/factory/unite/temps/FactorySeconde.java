package conversion.factory.unite.temps;

import base.grandeur.GrandeurAtomique;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactorySeconde implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("seconde", "s", new GrandeurAtomique("Argent"));
	}

}
