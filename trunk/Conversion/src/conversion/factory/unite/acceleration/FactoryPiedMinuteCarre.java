package conversion.factory.unite.acceleration;

import base.grandeur.factory.composite.FactoryAcceleration;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryPied;
import conversion.factory.unite.temps.FactoryMinute;

public class FactoryPiedMinuteCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("pied par minute carré", "p/min^2", new FactoryAcceleration().creerGrandeur());
		FactoryPied m = new FactoryPied();
		FactoryMinute s = new FactoryMinute();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}

}
