package base.fonction;

import java.util.HashMap;

import base.grandeur.Constante;
import base.grandeur.ElementFonction;

public class Fonction {
	private ElementFonction tete;
	private HashMap<String, Double> variables;
	
	public Fonction(ElementFonction tete, HashMap<String, Double> variables)
	{
		this.tete = tete;
		this.variables = variables;
	}
	
	public Fonction()
	{
		this(new Constante(0), new HashMap<String, Double>());
	}
	
	public double evaluer()
	{
		return tete.evaluer(variables);
	}

	/**
	 * @return the tete
	 */
	public ElementFonction getTete() {
		return tete;
	}

	/**
	 * @return the variables
	 */
	public HashMap<String, Double> getVariables() {
		return variables;
	}

	/**
	 * @param tete the tete to set
	 */
	public void setTete(ElementFonction tete) {
		this.tete = tete;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(HashMap<String, Double> variables) {
		this.variables = variables;
	}
	
}
