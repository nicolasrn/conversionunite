package conversion.factory.unite.volume;

import base.grandeur.factory.composite.FactoryVolume;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;

public class FactoryLitre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("litre", "L", new FactoryVolume());
		
		return u;
	}

}
