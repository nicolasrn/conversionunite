package cor.distance;

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
		super(suivant, 100, new FactoryMetre().creerUnite(), new FactoryCentiMetre().creerUnite());
	}
}
