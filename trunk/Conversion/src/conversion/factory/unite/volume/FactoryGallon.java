package conversion.factory.unite.volume;

import base.grandeur.factory.composite.FactoryVolume;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;

public class FactoryGallon implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("gallon", "gal", new FactoryVolume());
		
		return u;
	}

}
