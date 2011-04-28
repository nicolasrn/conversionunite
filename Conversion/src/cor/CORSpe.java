package cor;

import base.mesure.Mesure;
import base.unite.Unite;
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
