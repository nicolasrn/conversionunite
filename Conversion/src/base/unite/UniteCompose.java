package base.unite;


import java.util.LinkedList;

import base.grandeur.Grandeur;
import base.grandeur.factory.ICreerGrandeur;

/**
 * pour représenter le m/s <=> D/T
 * @author nicolasreitz
 *
 */
public class UniteCompose extends Unite 
{
	private LinkedList<Unite> unites;
	
	public UniteCompose(String nom, String abr, Grandeur grandeur) 
	{
		super(nom, abr, grandeur);
		unites = new LinkedList<Unite>();
	}
	
	public UniteCompose(String nom, String abr, ICreerGrandeur grandeur) {
		this(nom, abr, grandeur.creerGrandeur());
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
	 * @param arg0
	 * @return
	 * @see java.util.LinkedList#get(int)
	 */
	public Unite get(int arg0) {
		return unites.get(arg0);
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((unites == null) ? 0 : unites.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniteCompose other = (UniteCompose) obj;
		if (unites == null) {
			if (other.unites != null)
				return false;
		} else if (!unites.equals(other.unites))
			return false;
		return true;
	}
}
