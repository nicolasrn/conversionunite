package cor.surface;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;

public class SolveSurface extends CORSpe {

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		
		UniteCompose su = (UniteCompose)source.getUnite();
		UniteCompose u = (UniteCompose)probleme;
		
		Mesure tmp = new Mesure(1, su.getFirst());
		tmp.setConvertisseur(new ConvertisseurDistance());
		tmp = tmp.convertir(u.getFirst());
		
		//application selon la regle de grandeur
		Grandeur gr = source.getUnite().getGrandeur();
		HashMap<String, Double> val = new HashMap<String, Double>();
		val.put(Grandeur.Distance, tmp.getValeur());
		
		g = new Mesure(source.getValeur() * gr.evaluer(val), probleme);
		
		return g;
	}

}
