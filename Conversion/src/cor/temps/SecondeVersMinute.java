package cor.temps;

import conversion.factory.unite.temps.FactoryMinute;
import conversion.factory.unite.temps.FactorySeconde;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.CORSpe;
import cor.generique.COR;

public class SecondeVersMinute extends CORSpe {

	public SecondeVersMinute() {
		super();
	}

	public SecondeVersMinute(COR<Mesure, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryMinute().creerUnite()) && source.getUnite().equals(new FactorySeconde().creerUnite()))
			g = new Mesure(source.getValeur() * 1/60, probleme);  
		
		return g;
	}

}
