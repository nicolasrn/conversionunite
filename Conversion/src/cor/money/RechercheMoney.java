package cor.money;

import java.util.ArrayList;

import base.mesure.Mesure;
import base.unite.Unite;



import graphe.Arrete;
import graphe.Dijkstra;
import graphe.Graphe;
import graphe.Sommet;
import conversion.factory.unite.money.FactoryDollar;
import conversion.factory.unite.money.FactoryEuro;
import conversion.factory.unite.money.FactoryYen;
import cor.CORSpe;

public class RechercheMoney extends CORSpe {

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;

		Graphe graphe = new Graphe();
		Sommet 	dollar = new Sommet("Dollar", new FactoryDollar()),
				euro = new Sommet("Euro", new FactoryEuro()), 
				yen = new Sommet("Yen",	new FactoryYen());

		graphe.addSommet(dollar);
		graphe.addSommet(euro);
		graphe.addSommet(yen);

		graphe.addArrete(dollar, new Arrete(euro, 1, new DollarVersEuro()));
		graphe.addArrete(euro, new Arrete(yen, 1, new EuroVersYen()));

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
