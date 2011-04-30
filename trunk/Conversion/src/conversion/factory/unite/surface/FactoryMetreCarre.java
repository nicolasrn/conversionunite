package conversion.factory.unite.surface;

import base.grandeur.factory.composite.FactorySurface;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryMetre;

public class FactoryMetreCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("metre carré", "m^2", new FactorySurface());
		u.add(new FactoryMetre().creerUnite());
		u.add(new FactoryMetre().creerUnite());
		return u;
	}
}
