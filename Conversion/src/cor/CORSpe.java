package cor;

import conversion.Mesure;
import conversion.Unite;
import cor.generique.COR;

/**
 * 
 * spécialisation du template COR
 *
 */
public abstract class CORSpe extends COR<Mesure, Unite> 
{
	public CORSpe() {
		super();
	}

	public CORSpe(COR<Mesure, Unite> suivant) {
		super(suivant);
	}
}
