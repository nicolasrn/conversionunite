package cor;

import base.fonction.Fonction;
import base.grandeur.Constante;
import base.grandeur.Division;
import base.grandeur.ElementFonction;
import base.grandeur.Multiplication;
import base.mesure.Mesure;
import base.unite.Unite;
import cor.generique.COR;

/**
 * 
 * sp�cialisation du template COR
 *
 */
public class CORSpe extends COR<Mesure, Unite> 
{
	protected Fonction valeur;
	protected Unite uSource, uDest;
	
	public CORSpe()
	{
		this(null, new Fonction(), null, null);
	}
	
	public CORSpe(Fonction valeur, Unite source, Unite dest) {
		this(null, valeur, source, dest);
	}
	
	public CORSpe(COR<Mesure, Unite> suivant, Fonction valeur, Unite source, Unite dest) {
		super(suivant);
		this.valeur = valeur;
		this.uSource = source;
		this.uDest = dest;
	}
	
	/**
	 * m�thode a tester qui retourne la conversion inverse de l'actuel
	 * @return
	 */
	public CORSpe getInverseInstance()
	{
		Fonction f = new Fonction(new Division(new Constante(1.0), valeur.getTete()), valeur.getVariables());
		return new CORSpe(f, uDest, uSource);
	}
	
	/**
	 * m�thode a tester qui retourne la conversion inverse de l'actuel
	 * @return
	 */
	public CORSpe getInverseInstance(COR<Mesure, Unite> suivant)
	{
		Fonction f = new Fonction(new Division(new Constante(1.0), valeur.getTete()), valeur.getVariables());
		return new CORSpe(suivant, f, uDest, uSource);
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
			g = new Mesure(opererConversion(source), probleme);
		
		return g;
	}
	
	protected double opererConversion(Mesure source)
	{
		ElementFonction elt = valeur.getTete();
		Multiplication mul = new Multiplication(new Constante(source.getValeur()), elt);
		valeur.setTete(mul);
		
		return valeur.evaluer();
	}
}
