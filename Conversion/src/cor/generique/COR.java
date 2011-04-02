package cor.generique;

/**
 * 
 * met en oeuvre le DP Chain Of Responsability 
 *
 * @param <X> la solution attendu
 * @param <Y> le probleme
 */
public abstract class COR<X, Y> 
{
	private COR<X, Y> suivant;
	
	/**
	 * constructeur par d�faut
	 */
	public COR()
	{
		suivant = null;
	}
	
	/**
	 * Constructeur qui prend en parametre le suivant
	 * @param suivant
	 */
	public COR(COR<X, Y> suivant)
	{
		this.suivant = suivant;
	}
	
	/**
	 * permet d'ajouter un element � la suite du courant
	 * @param suivant
	 * @return le suivant empil�
	 */
	public COR<X, Y> add(COR<X, Y> suivant)
	{
		this.suivant = suivant;
		return suivant;
	}
	
	public X resoudre(Y probleme, X source) 
	{
		X solution = _resoudre(probleme, source); // resolution locale
		
		if (solution != null) // si on a un resultat
			return solution; // on le retourne
		else if (suivant != null) // si on a un suivant 
			return suivant.resoudre(probleme, source); // on retourne la resolution de la r�cursivit�
		
		// si on est ici c'est qu'on a pas de r�sultat
		return null; //on retourn null
	}
	
	/**
	 * permet la r�solution locale du probleme
	 * @param probleme
	 * @return
	 */
	protected abstract X _resoudre(Y probleme, X source);
}
