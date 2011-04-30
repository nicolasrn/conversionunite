package cor.distance;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.distance.FactoryCentiMetre;
import conversion.factory.unite.distance.FactoryMetre;
import cor.CORSpe;
import cor.generique.COR;

public class MetreVersCentimetre extends CORSpe {

	public MetreVersCentimetre() {
		this(null);
	}

	public MetreVersCentimetre(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(100.), new HashMap<String, Double>()), new FactoryMetre().creerUnite(), new FactoryCentiMetre().creerUnite());
	}
}
