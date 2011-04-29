package cor.factory;

import cor.CORSpe;
import cor.vitesse.SolveVitesse;

public class ConvertisseurVitesse implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new SolveVitesse();
		return cor;
	}

}
