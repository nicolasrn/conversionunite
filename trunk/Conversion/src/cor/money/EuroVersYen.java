package cor.money;

import conversion.Grandeur;
import conversion.Mesure;
import conversion.Unite;
import conversion.factory.unite.money.FactoryEuro;
import conversion.factory.unite.money.FactoryYen;
import cor.CORSpe;
import cor.generique.COR;

public class EuroVersYen extends CORSpe {

	public EuroVersYen() {
		super();
	}

	public EuroVersYen(COR<Mesure, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryYen().creerUnite()) && source.getUnite().equals(new FactoryEuro().creerUnite()))
			g = new Mesure(source.getValeur() * 0.705119165, probleme);  
		
		return g;
	}

}
