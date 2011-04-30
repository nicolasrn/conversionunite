package cor.temperature;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.grandeur.Division;
import base.grandeur.Multiplication;
import base.grandeur.Soustraction;
import base.grandeur.Variable;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.temperature.FactoryCelsius;
import conversion.factory.unite.temperature.FactoryFahrenheit;
import cor.CORSpe;
import cor.generique.COR;

public class FahrenheitVersCelsius extends CORSpe {

	public FahrenheitVersCelsius() {
		this(null);
	}
	
	public FahrenheitVersCelsius(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Multiplication(new Soustraction(new Variable("x"), new Constante(32)), new Division(new Constante(5), new Constante(9))), new HashMap<String, Double>()), new FactoryFahrenheit().creerUnite(), new FactoryCelsius().creerUnite());
	}

	/* (non-Javadoc)
	 * @see cor.CORSpe#opererConversion(base.mesure.Mesure)
	 */
	@Override
	protected double opererConversion(Mesure source) {
		valeur.getVariables().put("x", source.getValeur());
		return valeur.evaluer();
	}
}
