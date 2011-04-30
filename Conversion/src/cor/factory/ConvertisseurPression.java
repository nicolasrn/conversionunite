package cor.factory;

import cor.CORSpe;
import cor.pression.SolvePression;

public class ConvertisseurPression implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new SolvePression();
		return cor;
	}

}
