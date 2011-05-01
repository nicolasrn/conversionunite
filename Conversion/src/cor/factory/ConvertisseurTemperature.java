package cor.factory;

import cor.CORSpe;
import cor.temperature.CelsiusVersFahrenheit;
import cor.temperature.CelsiusVersKelvin;
import cor.temperature.FahrenheitVersCelsius;

public class ConvertisseurTemperature implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new CelsiusVersFahrenheit();
		cor = new FahrenheitVersCelsius(cor);
		cor = new CelsiusVersKelvin(cor);
		return cor;
	}

}
