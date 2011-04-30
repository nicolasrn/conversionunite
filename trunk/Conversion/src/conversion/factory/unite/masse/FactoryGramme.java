package conversion.factory.unite.masse;

import base.grandeur.factory.atomique.FactoryMasse;
import base.unite.Unite;
import base.unite.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryGramme implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		return new UniteAtomique("gramme", "g", new FactoryMasse());
	}

}
