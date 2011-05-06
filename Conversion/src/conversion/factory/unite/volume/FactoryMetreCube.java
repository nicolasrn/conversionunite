package conversion.factory.unite.volume;

import test.Main;
import base.grandeur.factory.composite.FactoryVolume;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.distance.FactoryMetre;

public class FactoryMetreCube implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		if (Main.trace) System.out.println("instanciation Unité metre cube");
		UniteCompose u = new UniteCompose("metre cube", "m^3", new FactoryVolume());
		
		ICreationUnite f = new FactoryMetre();
		
		u.add(f.creerUnite());
		u.add(f.creerUnite());
		u.add(f.creerUnite());
		
		return u;
	}

}
