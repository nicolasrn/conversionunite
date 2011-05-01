package conversion.factory.unite.surface;

import base.grandeur.factory.composite.FactorySurface;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryDeciMetre;

public class FactoryDeciMetreCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("decimetre carré", "dm^2", new FactorySurface());
		u.add(new FactoryDeciMetre().creerUnite());
		u.add(new FactoryDeciMetre().creerUnite());
		return u;
	}
}
