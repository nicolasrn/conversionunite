package cor.factory;

import cor.CORSpe;
import cor.distance.MetreVersPied;

public class ConvertiseurDistance implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new MetreVersPied();
		return cor;
	}

}
