package cor.vitesse;

import base.mesure.Mesure;
import base.unite.Unite;
import conversion.factory.unite.vitesse.FactoryMetreSeconde;
import conversion.factory.unite.vitesse.FactoryPiedSeconde;
import cor.CORSpe;
import cor.generique.COR;

public class MetreSecondeVersPiedSeconde extends CORSpe {

	public MetreSecondeVersPiedSeconde() {
		super();
	}

	public MetreSecondeVersPiedSeconde(COR<Mesure, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryPiedSeconde().creerUnite()) && source.getUnite().equals(new FactoryMetreSeconde().creerUnite()))
			g = new Mesure(source.getValeur() * 3.2808399, probleme);
		
		return g;
	}

}
