package conversion;

import conversion.factory.ICreationUnite;
import cor.CORSpe;
import cor.factory.ICreerCOR;

public class Grandeur implements Cloneable {
	private long value;
	
	private Unite unite;
	
	private CORSpe convertisseur;
	
	/**
	 * 
	 * @param value
	 * @param unite
	 */
	public Grandeur(long value, Unite unite)
	{
		this.value = value;
		this.unite = unite;
	}
	
	/**
	 * 
	 * @param value
	 * @param factory
	 */
	public Grandeur(long value, ICreationUnite factory)
	{
		this(value, factory.creerUnite());
	}
	
	/**
	 * permet de sommer des grandeurs
	 * @param other
	 * @return
	 * @throws CloneNotSupportedException 
	 */
	public Grandeur add(Grandeur other) throws CloneNotSupportedException
	{
		if (this.unite.equals(other.unite))
		{
			Grandeur g = (Grandeur)this.clone();
			g.setValue(value + other.getValue());
			return g;
		}
		throw new IllegalArgumentException("Operation interdite sur ces types d'unité : " + unite.getClass() + " et " + other.getUnite().getClass());
	}
	
	/**
	 * permet de soustraire des grandeurs
	 * @param other
	 * @return
	 * @throws CloneNotSupportedException 
	 */
	public Grandeur sub(Grandeur other) throws CloneNotSupportedException 
	{
		return this.add(new Grandeur(- other.getValue(), other.getUnite()));
	}
	
	/**
	 * permet la conversion d'unité
	 * @return Grandeur
	 */
	public Grandeur convertir(ICreationUnite dest)
	{
		return convertisseur.resoudre(dest.creerUnite(), this);
	}
	
	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}
	
	/**
	 * @param value the value to set
	 */
	public void setValue(long value) {
		this.value = value;
	}
	
	/**
	 * @return the unite
	 */
	public Unite getUnite() {
		return unite;
	}
	
	/**
	 * @return the convertisseur
	 */
	public CORSpe getConvertisseur() {
		return convertisseur;
	}
	
	/**
	 * @param convertisseur the convertisseur to set
	 */
	public void setConvertisseur(ICreerCOR convertisseur) {
		this.convertisseur = convertisseur.creerConvertisseur();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return value + " " + unite;
	}
}
