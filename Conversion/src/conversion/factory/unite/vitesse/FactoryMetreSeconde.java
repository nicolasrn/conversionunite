package conversion.factory.unite.vitesse;

import base.grandeur.factory.composite.FactoryVitesse;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryMetre;
import conversion.factory.unite.temps.FactorySeconde;

public class FactoryMetreSeconde implements ICreationUnite{

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("metre par seconde", "m/s", new FactoryVitesse().creerGrandeur());
		FactoryMetre m = new FactoryMetre();
		FactorySeconde s = new FactorySeconde();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}
	
}
