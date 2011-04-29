package conversion.factory.unite.vitesse;

import base.grandeur.factory.composite.FactoryVitesse;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryPied;
import conversion.factory.unite.temps.FactoryMinute;

public class FactoryPiedMinute implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("pieds par seconde", "p/min", new FactoryVitesse().creerGrandeur());
		FactoryPied m = new FactoryPied();
		FactoryMinute s = new FactoryMinute();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}

}
