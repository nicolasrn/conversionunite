package cor.masse;

import conversion.factory.unite.masse.FactoryGramme;
import conversion.factory.unite.masse.FactoryKiloGramme;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class KilogrammeVersGramme extends CORSpe {

	public KilogrammeVersGramme() {
		this(null);
	}

	public KilogrammeVersGramme(COR<Mesure, Unite> suivant) {
		super(suivant, 1000, new FactoryKiloGramme().creerUnite(), new FactoryGramme().creerUnite());
	}

}
