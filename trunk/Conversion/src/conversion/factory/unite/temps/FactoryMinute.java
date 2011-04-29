package conversion.factory.unite.temps;

import base.grandeur.factory.atomique.FactoryTemps;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryMinute implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("minute", "min", new FactoryTemps().creerGrandeur());
	}

}
