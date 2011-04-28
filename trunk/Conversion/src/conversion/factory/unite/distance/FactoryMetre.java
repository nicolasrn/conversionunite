package conversion.factory.unite.distance;

import base.grandeur.factory.atomique.FactoryDistance;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryMetre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("metre", "m", new FactoryDistance().creerGrandeur());
	}

}
