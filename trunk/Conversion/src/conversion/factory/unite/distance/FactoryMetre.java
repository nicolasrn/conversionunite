package conversion.factory.unite.distance;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;
import conversion.factory.grandeur.atomique.FactoryDistance;

public class FactoryMetre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("metre", "m", new FactoryDistance().creerGrandeur());
	}

}
