package conversion.factory.unite.volume;

import base.grandeur.factory.composite.FactoryVolume;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryDeciMetre;

public class FactoryDeciMetreCube implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("decimetre cube", "dm^3", new FactoryVolume());
		
		ICreationUnite f = new FactoryDeciMetre();
		
		u.add(f.creerUnite());
		u.add(f.creerUnite());
		u.add(f.creerUnite());
		
		return u;
	}

}
