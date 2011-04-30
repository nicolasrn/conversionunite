package cor.pression;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.factory.ConvertisseurSurface;
import cor.factory.ConvertisseurTemps;

public class SolvePression extends CORSpe 
{
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) 
	{
		Mesure g = null;
		UniteCompose u = (UniteCompose)probleme,
		su = (UniteCompose) source.getUnite();
		
		Mesure ml = new Mesure(10, su.getLast());
		ml.setConvertisseur(new ConvertisseurSurface());
		ml = ml.convertir(u.getLast());
		
		//application selon la regle de grandeur
		Grandeur gr = source.getUnite().getGrandeur();
		HashMap<String, Double> val = new HashMap<String, Double>();
		val.put(Grandeur.Surface, ml.getValeur());
		val.put(Grandeur.Force, 1.0);
		
		System.out.println(gr.ecrireEvaluation(val));
		g = new Mesure(source.getValeur() * gr.evaluer(val), probleme);
		
		return g;
	}
}
