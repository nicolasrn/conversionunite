package conversion.factory.unite.surface;

import base.grandeur.factory.composite.FactorySurface;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryPied;

public class FactoryPiedCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("pied carré", "p^2", new FactorySurface());
		u.add(new FactoryPied().creerUnite());
		u.add(new FactoryPied().creerUnite());
		return u;
	}
}
