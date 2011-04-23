package conversion.factory.vitesse;

import conversion.GrandeurCompose;
import conversion.Unite;
import conversion.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.distance.FactoryMetre;
import conversion.factory.temps.FactorySeconde;

public class FactoryMetreSeconde implements ICreationUnite{

	@Override
	public Unite creerUnite() {
		UniteCompose u = new UniteCompose("metre par seconde", "m/s", new GrandeurCompose());
		FactoryMetre m = new FactoryMetre();
		FactorySeconde s = new FactorySeconde();
		u.add(m.creerUnite());
		u.add(s.creerUnite());
		
		return u;
	}
	
}
