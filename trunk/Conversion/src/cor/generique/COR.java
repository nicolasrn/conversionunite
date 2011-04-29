package cor.generique;

/**
 * 
 * met en oeuvre le DP Chain Of Responsability 
 *
 * @param <SolutionAttendu> la solution attendu
 * @param <ProblemeAResoudre> le probleme
 */
public abstract class COR<SolutionAttendu, ProblemeAResoudre>
{
	private COR<SolutionAttendu, ProblemeAResoudre> suivant;
	
	/**
	 * constructeur par défaut
	 */
	public COR()
	{
		suivant = null;
	}
	
	/**
	 * Constructeur qui prend en parametre le suivant
	 * @param suivant
	 */
	public COR(COR<SolutionAttendu, ProblemeAResoudre> suivant)
	{
		this.suivant = suivant;
	}
	
	/**
	 * permet d'ajouter un element à la suite du courant
	 * @param suivant
	 * @return le suivant empilé
	 */
	public COR<SolutionAttendu, ProblemeAResoudre> add(COR<SolutionAttendu, ProblemeAResoudre> suivant)
	{
		this.suivant = suivant;
		return suivant;
	}
	
	/**
	 * résolu le problème en cours
	 * @param probleme
	 * @param source
	 * @return
	 */
	public SolutionAttendu resoudre(ProblemeAResoudre probleme, SolutionAttendu source) 
	{
		SolutionAttendu solution = _resoudre(probleme, source); // resolution locale
		
		if (solution != null) // si on a un resultat
			return solution; // on le retourne
		else if (suivant != null) // si on a un suivant 
			return suivant.resoudre(probleme, source); // on retourne la resolution de la récursivité
		
		// si on est ici c'est qu'on a pas de résultat
		return null; //on retourne null
	}
	
	/**
	 * permet la résolution locale du probleme
	 * @param probleme
	 * @return
	 */
	protected abstract SolutionAttendu _resoudre(ProblemeAResoudre probleme, SolutionAttendu source);
}
