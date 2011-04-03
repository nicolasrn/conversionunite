package conversion.factory.temps;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactorySeconde implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("seconde", "s");
	}

}
