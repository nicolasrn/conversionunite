package conversion.factory.unite.temperature;

import base.grandeur.factory.atomique.FactoryTemperature;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryCelsius implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("celsius", "¡C", new FactoryTemperature());
	}

}
