package cor.money;

import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.money.FactoryDollar;
import conversion.factory.money.FactoryEuro;
import cor.CORSpe;
import cor.generique.COR;

public class DollarVersEuro extends CORSpe {

	public DollarVersEuro() {
		super();
	}

	public DollarVersEuro(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Grandeur _resoudre(Unite probleme, Grandeur source) {
		Grandeur g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryEuro().creerUnite()) && source.getUnite().equals(new FactoryDollar().creerUnite()))
			g = new Grandeur(source.getValue() * 0.705119165, probleme);  
		
		return g;
	}

}
