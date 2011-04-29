package conversion.factory.unite.acceleration;

import base.grandeur.factory.composite.FactoryAcceleration;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryMetre;
import conversion.factory.unite.temps.FactorySeconde;

public class FactoryMetreSecondeCarre implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("metre par seconde carré", "m/s^2", new FactoryAcceleration().creerGrandeur());
		FactoryMetre m = new FactoryMetre();
		FactorySeconde s = new FactorySeconde();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}

}
