package cor;

import java.util.ArrayList;

import graphe.Arrete;
import graphe.Dijkstra;
import graphe.Graphe;
import graphe.Sommet;
import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.FactoryDollar;
import conversion.factory.FactoryEuro;
import conversion.factory.FactoryYen;
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
				yen = new Sommet("Yen", new FactoryYen());
		
		graphe.addSommet(dollar);
		graphe.addSommet(euro);
		graphe.addSommet(yen);
		
		graphe.addArrete(dollar, new Arrete(euro, 1, new DollarVersEuro()));
		graphe.addArrete(euro, new Arrete(yen, 1, new EuroVersYen()));
		
		Dijkstra dij = new Dijkstra(graphe);
		
		boolean trouve = false;
		ArrayList<Sommet> list = null;
		
		//IL FAUT COMMENCER LE PARCOURS AU NIVEAU DE L UNITE DE BASE JUSQU A L UNITE
		//RECHERCHER CECI EST DONC HAUTEMENT INCORRECTE
		
		//on parcours tous les sommets pour voir s'il existe une conversion possible
		for(int i = 0; !(i >= graphe.size() || trouve == true); i++)
		{
			dij.getListPath(i);
			//on récupère la liste des plus cours chemins
			for(int j = 0; !(j >= graphe.size() || trouve == true); j++)
			{
				if (i != j && graphe.get(j).getUnite().equals(probleme)) // différent de la source
				{
					System.out.println("résultat trouvé");
					list = dij.getShortestPath(j);
					System.out.println(list);
					trouve = true;
				}
			}
		}
		
		//il faut reconstituer la liste des arretes afin de récupérer les CORSpe de conversion vers la solution finale
		ArrayList<Arrete> arretes = new ArrayList<Arrete>();
		if (trouve && list != null)
		{
			for(int i = 0; i < list.size() - 1; i++)
			{
				Sommet origine = list.get(i);
				//parcours des voisins pour trouvé la bonne arrete
				for(int j = 0; j < origine.size(); j++)
				{
					if (origine.get(j).getExtremite().equals(list.get(i+1)))
					{
						arretes.add(origine.get(j));
						break;
					}
				}
			}
			//System.out.println(arretes);
			g = source;
			for(int i = 0; i < arretes.size(); i++)
			{
				g = arretes.get(i).getObjDeConversion().resoudre(arretes.get(i).getExtremite().getUnite(), g);
				System.out.println(g);
			}
			
			if (g.getUnite().equals(source.getUnite()))
				g = null;
		}
		//System.out.println("g vaut maintenant : " + g);
		return g;
	}

}
