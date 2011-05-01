package cor.volume;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.volume.FactoryGallon;
import conversion.factory.unite.volume.FactoryLitre;
import cor.CORSpe;
import cor.generique.COR;

public class LitreVersGallon extends CORSpe {

	public LitreVersGallon() {
		this(null);
	}
	
	public LitreVersGallon(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1./3.785411784), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryGallon().creerUnite());
	}

}
