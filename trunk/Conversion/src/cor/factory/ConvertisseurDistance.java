package cor.factory;

import cor.CORSpe;
import cor.distance.MetreVersCentimetre;
import cor.distance.MetreVersPied;

public class ConvertisseurDistance implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new MetreVersPied();
		cor = new MetreVersPied().getInverseInstance(cor);
		cor = new MetreVersCentimetre(cor);
		cor = new MetreVersCentimetre().getInverseInstance(cor);
		return cor;
	}

}
