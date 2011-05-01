package cor.factory;

import cor.CORSpe;
import cor.distance.CentimetreVersDecimetre;
import cor.distance.MetreVersCentimetre;
import cor.distance.MetreVersDecimetre;
import cor.distance.MetreVersPied;

public class ConvertisseurDistance implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new MetreVersPied();
		cor = new MetreVersPied().getInverseInstance(cor);
		cor = new MetreVersCentimetre(cor);
		cor = new MetreVersCentimetre().getInverseInstance(cor);
		cor = new CentimetreVersDecimetre(cor);
		cor = new CentimetreVersDecimetre().getInverseInstance(cor);
		cor = new MetreVersDecimetre(cor);
		cor = new MetreVersDecimetre().getInverseInstance(cor);
		return cor;
	}

}
