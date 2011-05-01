package cor.volume;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.unite.volume.FactoryLitre;
import conversion.factory.unite.volume.FactoryMiliLitre;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.generique.COR;

public class SolveMetreCube extends CORSpe {

	public SolveMetreCube() {
		this(null);
	}
	
	public SolveMetreCube(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryMiliLitre().creerUnite());
	}
	
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		
		UniteCompose su = (UniteCompose)source.getUnite();
		UniteCompose u = (UniteCompose)probleme;
		
		if (su.size() > 0 && u.size() > 0)
		{
			Mesure tmp = new Mesure(1, su.getFirst());
			tmp.setConvertisseur(new ConvertisseurDistance());
			
			tmp = tmp.convertir(u.getFirst());
			
			if (tmp != null)
			{
				//application selon la regle de grandeur
				Grandeur gr = source.getUnite().getGrandeur();
				HashMap<String, Double> val = new HashMap<String, Double>();
				val.put(Grandeur.Distance, tmp.getValeur());
				
				g = new Mesure(source.getValeur() * gr.evaluer(val), probleme);
			}
		}
		return g;
	}
}
