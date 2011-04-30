package cor.money;

import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.money.FactoryDollar;
import conversion.factory.unite.money.FactoryEuro;
import cor.CORSpe;
import cor.generique.COR;

public class DollarVersEuro extends CORSpe {

	public DollarVersEuro() {
		this(null);
	}

	public DollarVersEuro(COR<Mesure, Unite> suivant) {
		super(suivant, 0.705119165, new FactoryDollar().creerUnite(), new FactoryEuro().creerUnite());
	}

}
