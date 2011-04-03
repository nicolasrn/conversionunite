package cor.vitesse;

import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.vitesse.FactoryMetreSeconde;
import conversion.factory.vitesse.FactoryPiedSeconde;
import cor.CORSpe;
import cor.generique.COR;

public class MetreSecondeVersPiedSeconde extends CORSpe {

	public MetreSecondeVersPiedSeconde() {
		super();
	}

	public MetreSecondeVersPiedSeconde(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Grandeur _resoudre(Unite probleme, Grandeur source) {
		Grandeur g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryPiedSeconde().creerUnite()) && source.getUnite().equals(new FactoryMetreSeconde().creerUnite()))
			g = new Grandeur(source.getValue() * 3.2808399, probleme);
		
		return g;
	}

}
