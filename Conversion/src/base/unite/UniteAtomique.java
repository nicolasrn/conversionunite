package base.unite;

import base.grandeur.Grandeur;
import base.grandeur.factory.ICreerGrandeur;

public class UniteAtomique extends Unite 
{
	public UniteAtomique(String nom, String abr, Grandeur grandeur) 
	{
		super(nom, abr, grandeur);
	}

	public UniteAtomique(String nom, String abr, ICreerGrandeur grandeur) {
		this(nom, abr, grandeur.creerGrandeur());
	}
}
