package cor.volume;

import java.util.HashMap;

import test.Main;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.grandeur.Grandeur;
import base.grandeur.Multiplication;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.unite.volume.FactoryLitre;
import conversion.factory.unite.volume.FactoryMiliLitre;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.generique.COR;

public class SolveCube extends CORSpe {

	public SolveCube() {
		this(null);
	}
	
	public SolveCube(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryMiliLitre().creerUnite());
	}
	
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		if (Main.trace) System.out.println("résolution dans COR : " + this.getClass().getSimpleName());
		Mesure g = null;
		
		UniteCompose su = (UniteCompose)source.getUnite();
		UniteCompose u = (UniteCompose)probleme;
		
		if (su.size() > 0 && u.size() > 0)
		{
			Mesure tmp = new Mesure(1, su.getFirst());

			if (Main.trace) System.out.println("instanciation COR distance pour résoudre la conversion m^3 vers dm^3 : " + this.getClass().getSimpleName());
			tmp.setConvertisseur(new ConvertisseurDistance());
			
			tmp = tmp.convertir(u.getFirst());

			if (Main.trace) System.out.println("fin de conversion de distance dans : " + this.getClass().getSimpleName() + " valeur de conversion trouvé pour le taux : " + tmp);
			if (tmp != null)
			{
				//application selon la regle de grandeur
				Grandeur gr = source.getUnite().getGrandeur();
				HashMap<String, Double> val = new HashMap<String, Double>();

				if (Main.trace) System.out.println("résolution de la distance grace à la grandeur (passage de paramètre): ");
				val.put(Grandeur.Distance, tmp.getValeur());
				
				Fonction f = new Fonction(new Multiplication(new Constante(source.getValeur()), gr), val);
				g = new Mesure(f.evaluer(), probleme);
				if (Main.trace) System.out.println("valeur de la mesure conversion m^3 vers dm^3 : " + g + " détail du calcul : " + f.getTete().ecrireEvaluation(f.getVariables()));
			}
		}
		return g;
	}
}
