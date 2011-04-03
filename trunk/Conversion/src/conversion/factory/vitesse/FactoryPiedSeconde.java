package conversion.factory.vitesse;

import conversion.Unite;
import conversion.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.distance.FactoryPied;
import conversion.factory.temps.FactorySeconde;

public class FactoryPiedSeconde implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("pieds par seconde", "p/s");
		FactoryPied m = new FactoryPied();
		FactorySeconde s = new FactorySeconde();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}

}
