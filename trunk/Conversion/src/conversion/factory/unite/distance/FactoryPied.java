package conversion.factory.unite.distance;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;
import conversion.factory.grandeur.atomique.FactoryDistance;

public class FactoryPied implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("pied", "p", new FactoryDistance().creerGrandeur());
	}

}
