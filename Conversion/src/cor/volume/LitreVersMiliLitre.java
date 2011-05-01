package cor.volume;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.volume.FactoryLitre;
import conversion.factory.unite.volume.FactoryMiliLitre;
import cor.CORSpe;
import cor.generique.COR;

public class LitreVersMiliLitre extends CORSpe {

	public LitreVersMiliLitre() {
		this(null);
	}
	
	public LitreVersMiliLitre(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1000), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryMiliLitre().creerUnite());
	}

}
