package conversion.factory.unite.volume;

import test.Main;
import base.grandeur.factory.composite.FactoryVolume;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;

public class FactoryGallon implements ICreationUnite {

	@Override
	public Unite creerUnite() {
		if (Main.trace) System.out.println("instanciation unité destination : " + this.getClass().getSimpleName());
		UniteCompose u = new UniteCompose("gallon", "gal", new FactoryVolume());
		
		return u;
	}

}
