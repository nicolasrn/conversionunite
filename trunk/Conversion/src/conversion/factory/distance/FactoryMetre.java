package conversion.factory.distance;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryMetre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("metre", "m");
	}

}