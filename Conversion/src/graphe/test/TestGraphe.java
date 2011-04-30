package graphe.test;

import graphe.Arrete;
import graphe.Dijkstra;
import graphe.Graphe;
import graphe.Sommet;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestGraphe extends TestCase {
	public void testGraphe() {
		System.out.println("--------------test graphe--------------------------");
		Graphe graphe = new Graphe();
		
		Sommet 	a = new Sommet("a", null),
				b = new Sommet("b", null), 
				c = new Sommet("c", null), 
				d = new Sommet("d", null), 
				e = new Sommet("e", null);
		
		graphe.addSommet(a);
		graphe.addSommet(b);
		graphe.addSommet(c);
		graphe.addSommet(d);
		graphe.addSommet(e);
		
		graphe.addArrete(a, new Arrete(b, 10));
		graphe.addArrete(a, new Arrete(c, 5));
		graphe.addArrete(b, new Arrete(c, 2));
		graphe.addArrete(b, new Arrete(d, 1));
		graphe.addArrete(c, new Arrete(b, 3));
		graphe.addArrete(c, new Arrete(d, 9));
		graphe.addArrete(c, new Arrete(e, 2));
		graphe.addArrete(d, new Arrete(e, 4));
		graphe.addArrete(e, new Arrete(d, 6));
		graphe.addArrete(e, new Arrete(a, 7));
		
		System.out.println(graphe);
		
		Dijkstra dij = new Dijkstra(graphe);
		ArrayList<Sommet> list = dij.getListPath(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " "
					+ (list.get(i) != null ? list.get(i).getNum() : "-1"));
		}
		
		ArrayList<Sommet> shortestPath = dij.getShortestPath(4);
		for (Sommet s : shortestPath) {
			System.out.print(s.getNum() + " - ");
		}
		System.out.println("/");
		
		System.out.println("------------------------------------------------");
		
		list = dij.getListPath(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " "
					+ (list.get(i) != null ? list.get(i).getNum() : "-1"));
		}
		
		shortestPath = dij.getShortestPath(0);
		for (Sommet s : shortestPath) {
			System.out.print(s.getNum() + " - ");
		}
		System.out.println("/");
	}
}
