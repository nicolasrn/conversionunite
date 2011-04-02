package cor;

import conversion.Grandeur;
import conversion.Unite;
import conversion.factory.FactoryEuro;
import conversion.factory.FactoryYen;
import cor.generique.COR;

public class EuroVersYen extends CORSpe {

	public EuroVersYen() {
		super();
	}

	public EuroVersYen(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}

	@Override
	protected Grandeur _resoudre(Unite probleme, Grandeur source) {
		Grandeur g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(new FactoryYen().creerUnite()) && source.getUnite().equals(new FactoryEuro().creerUnite()))
			g = new Grandeur(source.getValue() * 0.705119165, probleme);  
		
		return g;
	}

}
