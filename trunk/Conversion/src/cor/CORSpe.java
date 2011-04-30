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
	protected double valeur;
	protected Unite uSource, uDest;
	
	public CORSpe()
	{
		this(null, 0, null, null);
	}
	
	public CORSpe(double valeur, Unite source, Unite dest) {
		this(null, valeur, source, dest);
	}

	public CORSpe(COR<Mesure, Unite> suivant, double valeur, Unite source, Unite dest) {
		super(suivant);
		this.valeur = valeur;
		this.uSource = source;
		this.uDest = dest;
	}

	/* (non-Javadoc)
	 * @see cor.generique.COR#_resoudre(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected Mesure _resoudre(Unite probleme, Mesure source) {
		Mesure g = null;
		if (probleme.equals(source.getUnite()))
			g = source;
		else if (probleme.equals(uDest) && source.getUnite().equals(uSource))
			g = new Mesure(source.getValeur() * valeur, probleme);  
		
		return g;
	}
}
