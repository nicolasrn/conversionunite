package cor.volume;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.volume.FactoryDeciMetreCube;
import conversion.factory.unite.volume.FactoryLitre;
import cor.CORSpe;
import cor.generique.COR;

public class LitreVersDeciMetreCube extends CORSpe {

	public LitreVersDeciMetreCube() {
		this(null);
	}
	
	public LitreVersDeciMetreCube(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryDeciMetreCube().creerUnite());
	}
	
}
