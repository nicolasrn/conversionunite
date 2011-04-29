package conversion.factory.unite.acceleration;

import base.grandeur.factory.composite.FactoryAcceleration;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryPied;
import conversion.factory.unite.temps.FactorySeconde;

public class FactoryPiedSecondeCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("pied par seconde carré", "p/s^2", new FactoryAcceleration().creerGrandeur());
		FactoryPied m = new FactoryPied();
		FactorySeconde s = new FactorySeconde();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}

}
