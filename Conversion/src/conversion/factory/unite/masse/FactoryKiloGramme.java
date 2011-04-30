package conversion.factory.unite.masse;

import base.grandeur.factory.atomique.FactoryMasse;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryKiloGramme implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("kilogramme", "kg", new FactoryMasse());
	}

}
