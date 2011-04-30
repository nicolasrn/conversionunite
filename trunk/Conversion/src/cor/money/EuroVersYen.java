package cor.money;

import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.money.FactoryEuro;
import conversion.factory.unite.money.FactoryYen;
import cor.CORSpe;
import cor.generique.COR;

public class EuroVersYen extends CORSpe {

	public EuroVersYen() {
		this(null);
	}

	public EuroVersYen(COR<Mesure, Unite> suivant) {
		super(suivant, 0.705119165, new FactoryEuro().creerUnite(), new FactoryYen().creerUnite());
	}

}
