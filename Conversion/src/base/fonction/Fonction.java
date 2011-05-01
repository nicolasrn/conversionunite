package base.fonction;

import java.util.HashMap;

import base.grandeur.Constante;
import base.grandeur.ElementFonction;
import base.grandeur.Multiplication;

public class Fonction {
	private ElementFonction tete;
	private HashMap<String, Double> variables;
	
	/**
	 * permet la construction d'une fonction associé d'une liste de variables
	 * @param tete
	 * @param variables
	 */
	public Fonction(ElementFonction tete, HashMap<String, Double> variables)
	{
		this.tete = tete;
		this.variables = variables;
	}
	
	/**
	 * constructeur par défaut, initialise la fonction avec la constante 0 et une liste de variables vide
	 */
	public Fonction()
	{
		this(new Constante(0), new HashMap<String, Double>());
	}
	
	/**
	 * évalue la fonction en fonction des variables
	 * @return double
	 */
	public double evaluer()
	{
		return tete.evaluer(variables);
	}
	
	/**
	 * dans le cas de la conversion d'unité on a besoin de de multiplier la valeur de la mesure par le coefficient obtenu par le calcul de la tete
	 * aussi ce coefficient et rajouter à l'arbre de l'expression avec une multiplication
	 * @param val
	 */
	public void addConversionValue(double val)
	{
		tete = new Multiplication(new Constante(val), tete);
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
