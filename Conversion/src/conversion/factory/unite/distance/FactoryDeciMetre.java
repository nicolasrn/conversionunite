package conversion.factory.unite.distance;

import base.grandeur.factory.atomique.FactoryDistance;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryDeciMetre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("decimetre", "dm", new FactoryDistance().creerGrandeur());
	}

}
