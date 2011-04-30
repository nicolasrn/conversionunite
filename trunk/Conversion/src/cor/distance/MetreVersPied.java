package cor.distance;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.distance.FactoryMetre;
import conversion.factory.unite.distance.FactoryPied;
import cor.CORSpe;
import cor.generique.COR;

public class MetreVersPied extends CORSpe {

	public MetreVersPied() {
		this(null);
	}

	public MetreVersPied(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(3.2808398950131), new HashMap<String, Double>()), new FactoryMetre().creerUnite(), new FactoryPied().creerUnite());
	}
}
