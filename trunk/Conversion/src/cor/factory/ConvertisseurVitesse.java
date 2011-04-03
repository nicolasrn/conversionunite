package cor.factory;

import cor.CORSpe;
import cor.vitesse.MetreSecondeVersPiedSeconde;

public class ConvertisseurVitesse implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new MetreSecondeVersPiedSeconde();
		return cor;
	}

}
