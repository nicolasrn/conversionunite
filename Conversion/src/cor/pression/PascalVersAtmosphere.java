package cor.pression;

import conversion.factory.unite.pression.FactoryAtmosphere;
import conversion.factory.unite.pression.FactoryPascal;

import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class PascalVersAtmosphere extends CORSpe 
{
	public PascalVersAtmosphere() {
		this(null);
	}
	
	public PascalVersAtmosphere(COR<Mesure, Unite> suivant) {
		super(suivant, 1/101325., new FactoryPascal().creerUnite(), new FactoryAtmosphere().creerUnite());
	}
}
