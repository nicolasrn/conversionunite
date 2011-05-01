package cor.temperature;

import java.util.HashMap;

import base.fonction.Fonction;
import base.grandeur.Addition;
import base.grandeur.Constante;
import base.grandeur.Variable;
import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.temperature.FactoryCelsius;
import conversion.factory.unite.temperature.FactoryKelvin;
import cor.CORSpe;
import cor.generique.COR;

public class CelsiusVersKelvin extends CORSpe {

	public CelsiusVersKelvin() {
		this(null);
	}
	
	public CelsiusVersKelvin(COR<Mesure, Unite> suivant) {
		super(suivant, new Fonction(new Addition(new Variable("x"), new Constante(273.15)), new HashMap<String, Double>()), new FactoryCelsius().creerUnite(), new FactoryKelvin().creerUnite());
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
