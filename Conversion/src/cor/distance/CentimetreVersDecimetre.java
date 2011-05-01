package cor.distance;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.distance.FactoryCentiMetre;
import conversion.factory.unite.distance.FactoryDeciMetre;
import cor.CORSpe;
import cor.generique.COR;

public class CentimetreVersDecimetre extends CORSpe {

	public CentimetreVersDecimetre() {
		this(null);
	}

	public CentimetreVersDecimetre(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1/10.), new HashMap<String, Double>()), new FactoryCentiMetre().creerUnite(), new FactoryDeciMetre().creerUnite());
	}
}
