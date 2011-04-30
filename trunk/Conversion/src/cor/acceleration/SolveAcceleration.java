package cor.acceleration;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.factory.ConvertisseurTemps;

public class SolveAcceleration extends CORSpe
{
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		UniteCompose u = (UniteCompose)probleme,
		su = (UniteCompose) source.getUnite();
		
		Mesure mf = new Mesure(1, su.getFirst());
		mf.setConvertisseur(new ConvertisseurDistance());
		mf = mf.convertir(u.getFirst());
		
		Mesure ml = new Mesure(1, su.getLast());
		ml.setConvertisseur(new ConvertisseurTemps());
		ml = ml.convertir(u.getLast());
		
		if (mf != null && ml != null)
		{
			//application selon la regle de grandeur
			Grandeur gr = source.getUnite().getGrandeur();
			HashMap<String, Double> val = new HashMap<String, Double>();
			val.put(Grandeur.Distance, mf.getValeur());
			val.put(Grandeur.Temps, ml.getValeur());
			
			g = new Mesure(source.getValeur() * gr.evaluer(val), probleme);
		}
		return g;
	}
}
