package conversion.factory.unite.temperature;

import base.grandeur.factory.atomique.FactoryTemperature;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryKelvin implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("kelvin", "¡K", new FactoryTemperature());
	}

}
