package cor.factory;

import cor.CORSpe;
import cor.pression.PascalVersAtmosphere;
import cor.pression.PascalVersBar;

public class ConvertisseurPression implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new PascalVersBar();
		cor = new PascalVersAtmosphere(cor);
		return cor;
	}

}
