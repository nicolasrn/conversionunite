package conversion.factory.distance;

import conversion.GrandeurAtomique;
import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryPied implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("pied", "p", new GrandeurAtomique());
	}

}
