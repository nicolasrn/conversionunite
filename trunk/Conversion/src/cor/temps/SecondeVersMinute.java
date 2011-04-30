package cor.temps;

import java.util.HashMap;

import conversion.factory.unite.temps.FactoryMinute;
import conversion.factory.unite.temps.FactorySeconde;
import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class SecondeVersMinute extends CORSpe {

	public SecondeVersMinute() {
		this(null);
	}

	public SecondeVersMinute(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1./60), new HashMap<String, Double>()), new FactorySeconde().creerUnite(), new FactoryMinute().creerUnite());
	}

}
