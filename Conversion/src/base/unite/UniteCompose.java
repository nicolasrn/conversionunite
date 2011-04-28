package base.unite;


import java.util.LinkedList;

import base.grandeur.Grandeur;


public class UniteCompose extends Unite 
{
	private LinkedList<Unite> unites;
	
	public UniteCompose(String nom, String abr, Grandeur grandeur) 
	{
		super(nom, abr, grandeur);
		unites = new LinkedList<Unite>();
	}

	/**
	 * @return the unites
	 */
	public LinkedList<Unite> getUnites() {
		return unites;
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.LinkedList#add(java.lang.Object)
	 */
	public boolean add(Unite e) {
		return unites.add(e);
	}

	/**
	 * @param e
	 * @see java.util.LinkedList#addFirst(java.lang.Object)
	 */
	public void addFirst(Unite e) {
		unites.addFirst(e);
	}

	/**
	 * @param e
	 * @see java.util.LinkedList#addLast(java.lang.Object)
	 */
	public void addLast(Unite e) {
		unites.addLast(e);
	}

	/**
	 * @return
	 * @see java.util.LinkedList#getFirst()
	 */
	public Unite getFirst() {
		return unites.getFirst();
	}

	/**
	 * @return
	 * @see java.util.LinkedList#getLast()
	 */
	public Unite getLast() {
		return unites.getLast();
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.LinkedList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return unites.remove(o);
	}

	/**
	 * @return
	 * @see java.util.LinkedList#removeFirst()
	 */
	public Unite removeFirst() {
		return unites.removeFirst();
	}

	/**
	 * @return
	 * @see java.util.LinkedList#removeLast()
	 */
	public Unite removeLast() {
		return unites.removeLast();
	}

	/**
	 * @return
	 * @see java.util.LinkedList#size()
	 */
	public int size() {
		return unites.size();
	}
}
