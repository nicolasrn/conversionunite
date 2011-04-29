package cor.factory;

import cor.CORSpe;
import cor.temps.SecondeVersMinute;

public class ConvertisseurTemps implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new SecondeVersMinute();
		return cor;
	}

}
