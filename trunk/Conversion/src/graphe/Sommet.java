package graphe;

import java.util.ArrayList;

public class Sommet implements Comparable<Sommet>{
	private int num;
	private String name;
	private ArrayList<Arrete> adjacences;
	
	private double minDistance;
	
	/**
	 * 
	 * @param num
	 * @param name
	 * @param adjacences
	 */
	public Sommet(int num, String name, ArrayList<Arrete> adjacences, double minDistance)
	{
		this.num = num;
		this.name = name;
		this.adjacences = adjacences;
		this.minDistance = minDistance;
	}
	
	/**
	 * constructeur par d�faut
	 */
	public Sommet()
	{
		this(-1, "", new ArrayList<Arrete>(), Double.POSITIVE_INFINITY);
	}
	
	/**
	 * constructeur qui donne un nom au Sommet cr��
	 * @param name
	 */
	public Sommet(String name)
	{
		this(-1, name, new ArrayList<Arrete>(), Double.POSITIVE_INFINITY);
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Arrete e) {
		return adjacences.add(e);
	}

	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#get(int)
	 */
	public Arrete get(int index) {
		return adjacences.get(index);
	}

	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#remove(int)
	 */
	public Arrete remove(int index) {
		return adjacences.remove(index);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return adjacences.remove(o);
	}
	
	/**
	 * @return
	 * @see java.util.ArrayList#size()
	 */
	public int size() {
		return adjacences.size();
	}

	/**
	 * @param index
	 * @param element
	 * @return
	 * @see java.util.ArrayList#set(int, java.lang.Object)
	 */
	public Arrete set(int index, Arrete element) {
		return adjacences.set(index, element);
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the minDistance
	 */
	public double getMinDistance() {
		return minDistance;
	}

	/**
	 * @param minDistance the minDistance to set
	 */
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	/**
	 * @return the adjacences
	 */
	public ArrayList<Arrete> getAdjacences() {
		return adjacences;
	}

	@Override
	public int compareTo(Sommet o) {
		return Double.compare(minDistance, o.minDistance);
	}
}
