package conversion.factory.unite.distance;

import base.grandeur.factory.atomique.FactoryDistance;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryCentiMetre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("centimetre", "cm", new FactoryDistance().creerGrandeur());
	}

}
