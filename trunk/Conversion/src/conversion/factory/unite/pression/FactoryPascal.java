package conversion.factory.unite.pression;

import base.grandeur.factory.composite.FactoryPression;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.acceleration.FactoryMetreSecondeCarre;
import conversion.factory.unite.masse.FactoryKiloGramme;
import conversion.factory.unite.surface.FactoryMetreCarre;

public class FactoryPascal implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		UniteCompose u = new UniteCompose("pascal", "Pa", new FactoryPression());
		u.add(new FactoryKiloGramme().creerUnite());
		u.add(new FactoryMetreSecondeCarre().creerUnite());
		u.add(new FactoryMetreCarre().creerUnite());
		
		return u;
	}
}
