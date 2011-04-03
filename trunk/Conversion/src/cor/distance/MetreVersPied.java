package cor.distance;

import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.distance.FactoryMetre;
import conversion.factory.distance.FactoryPied;
import cor.CORSpe;
import cor.generique.COR;

public class MetreVersPied extends CORSpe {

	public MetreVersPied() {
		super();
	}

	public MetreVersPied(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Grandeur _resoudre(Unite probleme, Grandeur source) {
		Grandeur g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryPied().creerUnite()) && source.getUnite().equals(new FactoryMetre().creerUnite()))
			g = new Grandeur(source.getValue() * 3.2808399, probleme);  
		
		return g;
	}

}
