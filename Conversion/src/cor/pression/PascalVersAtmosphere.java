package cor.pression;

import java.util.HashMap;

import conversion.factory.unite.pression.FactoryAtmosphere;
import conversion.factory.unite.pression.FactoryPascal;

import base.fonction.Fonction;
import base.grandeur.Constante;
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
		super(suivant, new Fonction(new Constante(1./101325), new HashMap<String, Double>()), new FactoryPascal().creerUnite(), new FactoryAtmosphere().creerUnite());
	}
}
