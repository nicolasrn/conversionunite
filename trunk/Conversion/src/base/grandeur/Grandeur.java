package base.grandeur;

public abstract class Grandeur extends ElementFonction implements Cloneable {
	protected String nom;
	
	public Grandeur(String nom)
	{
		this.nom = nom;
	}
}
