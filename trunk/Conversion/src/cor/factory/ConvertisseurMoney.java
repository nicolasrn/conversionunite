package cor.factory;

import cor.CORSpe;
import cor.DollarVersEuro;
import cor.EuroVersYen;

public class ConvertisseurMoney implements ICreerCOR
{

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new DollarVersEuro();
		cor.add(new EuroVersYen());
		return cor;
	}
	
}
