package cor.temperature;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Addition;
import base.grandeur.Constante;
import base.grandeur.Division;
import base.grandeur.Multiplication;
import base.grandeur.Variable;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.temperature.FactoryCelsius;
import conversion.factory.unite.temperature.FactoryFahrenheit;
import cor.CORSpe;
import cor.generique.COR;

public class CelsiusVersFahrenheit extends CORSpe {

	public CelsiusVersFahrenheit() {
		this(null);
	}
	
	public CelsiusVersFahrenheit(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Addition(new Multiplication(new Variable("x"), new Division(new Constante(9), new Constante(5))), new Constante(32)), new HashMap<String, Double>()), new FactoryCelsius().creerUnite(), new FactoryFahrenheit().creerUnite());
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
