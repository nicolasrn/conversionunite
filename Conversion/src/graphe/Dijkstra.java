package graphe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Dijkstra {
	private Graphe g;
	private int sourceMem;
	private ArrayList<Sommet> list = null;
	
	/**
	 * constructeur par défaut
	 * @param g
	 */
	public Dijkstra(Graphe g)
	{
		this.g = g;
		sourceMem = Integer.MIN_VALUE;
	}
	
	/**
	 * retourne la liste des pères représentant les plus courts chemins
	 * @param source
	 * @return
	 */
	public ArrayList<Sommet> getListPath(int source)
	{
		if (list == null || sourceMem != source)
			execute(source);
		return list;
	}
	
	/**
	 * retourne le plus court chemin entre la source et la destination
	 * @param dest
	 * @return
	 */
	public ArrayList<Sommet> getShortestPath(int dest)
	{
		if (list == null)
			throw new IllegalArgumentException("Merci d'executer en premier getListPath");
		
		ArrayList<Sommet> l = new ArrayList<Sommet>();
		l.add(g.get(dest));
		
		for(int i = dest; list.get(i) != null; i = list.get(i).getNum())
			l.add(list.get(i));
		
		Collections.reverse(l);
		return l;
	}
	
	/**
	 * execute l'algorithme de calcul
	 * @param source
	 */
	private void execute(int source)
	{
		this.sourceMem = source;
		int nbElt = g.size();
		list = new ArrayList<Sommet>(nbElt);
		
		for(int i = 0; i < nbElt; i++)
		{
			list.add(null);
			g.get(i).setMinDistance(Double.POSITIVE_INFINITY);
		}
		
		PriorityQueue<Sommet> queue = new PriorityQueue<Sommet>();
		queue.add(g.get(source));
		g.get(source).setMinDistance(0);
		
		while(!queue.isEmpty())
		{
			Sommet s = queue.poll();
			
			for(Arrete a : s.getAdjacences())
			{
				Sommet ext = a.getExtremite();
				double 	p = a.getWeight(),
						w = s.getMinDistance() + p;
				
				if (w < ext.getMinDistance())
				{
					//mise a jour de la table des prédécesseurs
					list.set(ext.getNum(), s);
					
					//mise a jour de la file et mise a jour du poids
					ext.setMinDistance(w);
					queue.add(ext);
				}
			}
		}
	}
}
