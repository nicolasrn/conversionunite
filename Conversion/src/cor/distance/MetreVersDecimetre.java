package cor.distance;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.distance.FactoryDeciMetre;
import conversion.factory.unite.distance.FactoryMetre;
import cor.CORSpe;
import cor.generique.COR;

public class MetreVersDecimetre extends CORSpe {

	public MetreVersDecimetre() {
		this(null);
	}

	public MetreVersDecimetre(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(10.), new HashMap<String, Double>()), new FactoryMetre().creerUnite(), new FactoryDeciMetre().creerUnite());
	}
}
