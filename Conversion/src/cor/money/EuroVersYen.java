package cor.money;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
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
		super(suivant, new Fonction(new Constante(120.340633), new HashMap<String, Double>()), new FactoryEuro().creerUnite(), new FactoryYen().creerUnite());
	}

}
