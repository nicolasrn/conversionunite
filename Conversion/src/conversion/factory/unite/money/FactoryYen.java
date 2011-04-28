package conversion.factory.unite.money;

import java.util.Currency;
import java.util.Locale;

import base.grandeur.factory.atomique.FactoryMonnaie;
import base.unite.Unite;
import base.unite.UniteAtomique;


import conversion.factory.ICreationUnite;

public class FactoryYen implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		return new UniteAtomique("Yen", Currency.getInstance(Locale.JAPAN).getSymbol(), new FactoryMonnaie().creerGrandeur());
	}
}
