package cor.money;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
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
		super(suivant, new Fonction(new Constante(0.673945276), new HashMap<String, Double>()), new FactoryDollar().creerUnite(), new FactoryEuro().creerUnite());
	}

}
