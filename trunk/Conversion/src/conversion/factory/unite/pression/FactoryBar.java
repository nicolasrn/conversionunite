package conversion.factory.unite.pression;

import base.grandeur.factory.composite.FactoryPression;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.ICreationUnite;
import conversion.factory.unite.acceleration.FactoryMetreSecondeCarre;
import conversion.factory.unite.masse.FactoryKiloGramme;
import conversion.factory.unite.surface.FactoryCentiMetreCarre;

public class FactoryBar implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		UniteCompose u = new UniteCompose("bar", "bar", new FactoryPression());
		u.add(new FactoryKiloGramme().creerUnite());
		u.add(new FactoryMetreSecondeCarre().creerUnite());
		u.add(new FactoryCentiMetreCarre().creerUnite());
		
		return u;
	}
}
