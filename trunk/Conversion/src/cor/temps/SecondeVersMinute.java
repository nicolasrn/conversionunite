package cor.temps;

import conversion.factory.unite.temps.FactoryMinute;
import conversion.factory.unite.temps.FactorySeconde;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class SecondeVersMinute extends CORSpe {

	public SecondeVersMinute() {
		this(null);
	}

	public SecondeVersMinute(COR<Mesure, Unite> suivant) {
		super(suivant, 1./60, new FactorySeconde().creerUnite(), new FactoryMinute().creerUnite());
	}

}
