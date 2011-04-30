package conversion.factory.unite.surface;

import base.grandeur.factory.composite.FactorySurface;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryCentiMetre;

public class FactoryCentiMetreCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("centimetre carré", "cm^2", new FactorySurface());
		u.add(new FactoryCentiMetre().creerUnite());
		u.add(new FactoryCentiMetre().creerUnite());
		return u;
	}
}
