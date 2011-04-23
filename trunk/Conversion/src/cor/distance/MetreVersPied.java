package cor.distance;

import conversion.Mesure;
import conversion.Unite;
import conversion.factory.distance.FactoryMetre;
import conversion.factory.distance.FactoryPied;
import cor.CORSpe;
import cor.generique.COR;

public class MetreVersPied extends CORSpe {

	public MetreVersPied() {
		super();
	}

	public MetreVersPied(COR<Mesure, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryPied().creerUnite()) && source.getUnite().equals(new FactoryMetre().creerUnite()))
			g = new Mesure(source.getValeur() * 3.2808399, probleme);  
		
		return g;
	}

}
