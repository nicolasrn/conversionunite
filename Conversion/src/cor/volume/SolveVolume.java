package cor.volume;

import graphe.Arrete;
import graphe.Dijkstra;
import graphe.Graphe;
import graphe.Sommet;

import java.util.ArrayList;
import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.grandeur.Grandeur;
import base.mesure.Mesure;
import base.unite.Unite;
import base.unite.UniteCompose;
import conversion.factory.unite.money.FactoryDollar;
import conversion.factory.unite.money.FactoryEuro;
import conversion.factory.unite.money.FactoryYen;
import conversion.factory.unite.volume.FactoryDeciMetreCube;
import conversion.factory.unite.volume.FactoryLitre;
import conversion.factory.unite.volume.FactoryMetreCube;
import conversion.factory.unite.volume.FactoryMiliLitre;
import cor.CORSpe;
import cor.factory.ConvertisseurDistance;
import cor.generique.COR;
import cor.money.DollarVersEuro;
import cor.money.EuroVersYen;

public class SolveVolume extends CORSpe {

	public SolveVolume() {
		this(null);
	}
	
	public SolveVolume(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Constante(1), new HashMap<String, Double>()), new FactoryLitre().creerUnite(), new FactoryMiliLitre().creerUnite());
	}
	
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		
		Graphe graphe = new Graphe();
		Sommet 	m3 = new Sommet("metrecube", new FactoryMetreCube()),
				dm3 = new Sommet("decimetre cube", new FactoryDeciMetreCube()), 
				l = new Sommet("litre",	new FactoryLitre()),
				ml = new Sommet("litre",	new FactoryMiliLitre());
		
		graphe.addSommet(m3);
		graphe.addSommet(dm3);
		graphe.addSommet(l);
		graphe.addSommet(ml);

		graphe.addArrete(m3, new Arrete(dm3, 1, new SolveMetreCube()));
		graphe.addArrete(dm3, new Arrete(l, 1, new LitreVersDeciMetreCube().getInverseInstance()));
		graphe.addArrete(l, new Arrete(ml, 1, new LitreVersMiliLitre()));

		Dijkstra dij = new Dijkstra(graphe);

		boolean trouve = false;
		ArrayList<Sommet> list = null;

		int idSource = -1, idDest = -1;
		for (int i = 0; i < graphe.size(); i++)
			if (graphe.get(i).getUnite().equals(source.getUnite()))
				idSource = graphe.get(i).getNum();

		for (int i = 0; i < graphe.size(); i++)
			if (graphe.get(i).getUnite().equals(probleme))
				idDest = graphe.get(i).getNum();

		// System.out.println(idSource + " - " + idDest);

		dij.getListPath(idSource);
		list = dij.getShortestPath(idDest);
		if (list != null)
			trouve = true;
		// System.out.println(list);

		// il faut reconstituer la liste des arretes afin de r�cup�rer les
		// CORSpe de conversion vers la solution finale
		ArrayList<Arrete> arretes = new ArrayList<Arrete>();
		if (trouve && list != null) 
		{
			for (int i = 0; i < list.size() - 1; i++) 
			{
				Sommet origine = list.get(i);
				// parcours des voisins pour trouv� la bonne arrete
				for (int j = 0; j < origine.size(); j++) 
				{
					if (origine.get(j).getExtremite().equals(list.get(i + 1))) 
					{
						arretes.add(origine.get(j));
						break;
					}
				}
			}
			// System.out.println(arretes);
			g = source;
			for (int i = 0; i < arretes.size(); i++) 
			{
				CORSpe cor = arretes.get(i).getObjDeConversion();
				Unite pb = arretes.get(i).getExtremite().getUnite();
				g = cor.resoudre(pb, g);
				// System.out.println(g);
			}

			if (g.getUnite().equals(source.getUnite()))
				g = null;
		}
		// System.out.println("g vaut maintenant : " + g);
		return g;
	}
}
