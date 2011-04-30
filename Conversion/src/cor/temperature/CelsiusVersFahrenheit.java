package cor.temperature;

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
		super(suivant, 9./5, new FactoryCelsius().creerUnite(), new FactoryFahrenheit().creerUnite());
	}
	
}
