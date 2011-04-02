package graphe;

import cor.CORSpe;

public class Arrete {
	private Sommet extremite;
	private double weight;
	private CORSpe objDeConversion;
	
	/**
	 * 
	 * @param ext
	 * @param weight
	 * @param objConv
	 */
	public Arrete(Sommet ext, double weight, CORSpe objConv)
	{
		this.extremite = ext;
		this.weight = weight;
		this.objDeConversion = objConv;
	}
	
	/**
	 * 
	 * @param ext
	 * @param weight
	 */
	public Arrete(Sommet ext, double weight)
	{
		this(ext, weight, null);
	}
	
	/**
	 * @return the extremite
	 */
	public Sommet getExtremite() {
		return extremite;
	}
	
	/**
	 * @param extremite the extremite to set
	 */
	public void setExtremite(Sommet extremite) {
		this.extremite = extremite;
	}
	
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * @return the objDeConversion
	 */
	public CORSpe getObjDeConversion() {
		return objDeConversion;
	}
	
	/**
	 * @param objDeConversion the objDeConversion to set
	 */
	public void setObjDeConversion(CORSpe objDeConversion) {
		this.objDeConversion = objDeConversion;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return extremite.getNum() + " (" + extremite.getName() + " " + weight + ")";
	}
}
