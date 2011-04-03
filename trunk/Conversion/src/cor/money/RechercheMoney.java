package cor.money;

import java.util.ArrayList;

import graphe.Arrete;
import graphe.Dijkstra;
import graphe.Graphe;
import graphe.Sommet;
import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.money.FactoryDollar;
import conversion.factory.money.FactoryEuro;
import conversion.factory.money.FactoryYen;
import cor.CORSpe;
import cor.generique.COR;

public class RechercheMoney extends CORSpe {

	public RechercheMoney() {
		super();
	}

	public RechercheMoney(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Grandeur _resoudre(Unite probleme, Grandeur source) {
		Grandeur g = null;

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

		// il faut reconstituer la liste des arretes afin de rŽcupŽrer les
		// CORSpe de conversion vers la solution finale
		ArrayList<Arrete> arretes = new ArrayList<Arrete>();
		if (trouve && list != null) 
		{
			for (int i = 0; i < list.size() - 1; i++) 
			{
				Sommet origine = list.get(i);
				// parcours des voisins pour trouvŽ la bonne arrete
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
				g = arretes.get(i).getObjDeConversion().resoudre(arretes.get(i).getExtremite().getUnite(), g);
				// System.out.println(g);
			}

			if (g.getUnite().equals(source.getUnite()))
				g = null;
		}
		// System.out.println("g vaut maintenant : " + g);
		return g;
	}

}
