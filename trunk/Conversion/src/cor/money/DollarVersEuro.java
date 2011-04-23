package cor.money;

import conversion.Mesure;
import conversion.Unite;
import conversion.factory.unite.money.FactoryDollar;
import conversion.factory.unite.money.FactoryEuro;
import cor.CORSpe;
import cor.generique.COR;

public class DollarVersEuro extends CORSpe {

	public DollarVersEuro() {
		super();
	}

	public DollarVersEuro(COR<Mesure, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryEuro().creerUnite()) && source.getUnite().equals(new FactoryDollar().creerUnite()))
			g = new Mesure(source.getValeur() * 0.705119165, probleme);  
		
		return g;
	}

}
