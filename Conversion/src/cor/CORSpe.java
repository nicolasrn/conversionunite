package cor;

import conversion.Grandeur;
import conversion.Unite;
import cor.generique.COR;

/**
 * 
 * sp�cialisation du template COR
 *
 */
public abstract class CORSpe extends COR<Grandeur, Unite> 
{
	public CORSpe() {
		super();
	}

	public CORSpe(COR<Grandeur, Unite> suivant) {
		super(suivant);
	}
}
