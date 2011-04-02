package cor.factory;

import cor.CORSpe;
import cor.money.DollarVersEuro;
import cor.money.EuroVersYen;
import cor.money.RechercheMoney;

public class ConvertisseurMoney implements ICreerCOR
{

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor;
		
		cor = new RechercheMoney();
		cor = new DollarVersEuro(cor);
		cor = new EuroVersYen(cor);
		
		return cor;
	}
	
}
