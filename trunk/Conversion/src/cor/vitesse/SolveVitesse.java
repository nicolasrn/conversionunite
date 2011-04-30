
package cor.vitesse;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.factory.ConvertisseurTemps;
import cor.generique.COR;

public class SolveVitesse extends CORSpe {

	public SolveVitesse() {
		super();
	}

	public SolveVitesse(COR<Mesure, Unite> suivant) {
		super(suivant, 0, null, null);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		/*Mesure g = null;
		Unite z = new FactoryPiedSeconde().creerUnite(),
		y = new FactoryMetreSeconde().creerUnite();
		boolean a = probleme.equals(z),
		b = source.getUnite().equals(y);
		
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (a && b)
			g = new Mesure(source.getValeur() * 3.2808399, probleme);
		
		return g;*/
		Mesure g = null;
		UniteCompose u = (UniteCompose)probleme,
		su = (UniteCompose) source.getUnite();
		
		Mesure mf = new Mesure(1, su.getFirst());
		mf.setConvertisseur(new ConvertisseurDistance());
		mf = mf.convertir(u.getFirst());
		
		Mesure ml = new Mesure(1, su.getLast());
		ml.setConvertisseur(new ConvertisseurTemps());
		ml = ml.convertir(u.getLast());
		
		//application selon la regle de grandeur
		Grandeur gr = source.getUnite().getGrandeur();
		HashMap<String, Double> val = new HashMap<String, Double>();
		val.put(Grandeur.Distance, mf.getValeur());
		val.put(Grandeur.Temps, ml.getValeur());
		
		g = new Mesure(source.getValeur() * gr.evaluer(val), probleme);
		
		return g;
	}
}
