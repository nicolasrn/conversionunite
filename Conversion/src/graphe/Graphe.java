package graphe;

import java.util.ArrayList;

public class Graphe {
	private ArrayList<Sommet> list;
	
	/**
	 * 
	 * @param nbElt
	 */
	public Graphe(int nbElt)
	{
		list = new ArrayList<Sommet>(nbElt);
	}
	
	/**
	 * 
	 */
	public Graphe()
	{
		this(10);
	}
	
	/**
	 * 
	 * @param s
	 */
	public void addSommet(Sommet s)
	{
		list.add(s);
		s.setNum(list.size()-1);
	}
	
	/**
	 * 
	 * @param s
	 * @param a
	 */
	public void addArrete(Sommet s, Arrete a)
	{
		list.get(s.getNum()).add(a);
	}
	
	/**
	 * @param arg0
	 * @return
	 * @see java.util.ArrayList#get(int)
	 */
	public Sommet get(int arg0) {
		return list.get(arg0);
	}

	/**
	 * @return
	 * @see java.util.ArrayList#size()
	 */
	public int size() {
		return list.size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < list.size(); i++)
		{
			s.append(i + " (" + list.get(i).getName() + ")" + " <- ");
			for(int j = 0; j < list.get(i).size(); j++)
				s.append(list.get(i).get(j) + " <- ");
			s.append("//" + "\n");
		}
		return s.toString();
	}
}
