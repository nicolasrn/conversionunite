package cor.masse;

import java.util.HashMap;

import conversion.factory.unite.masse.FactoryGramme;
import conversion.factory.unite.masse.FactoryKiloGramme;
import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class KilogrammeVersGramme extends CORSpe {

	public KilogrammeVersGramme() {
		this(null);
	}

	public KilogrammeVersGramme(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1000), new HashMap<String, Double>()), new FactoryKiloGramme().creerUnite(), new FactoryGramme().creerUnite());
	}

}
