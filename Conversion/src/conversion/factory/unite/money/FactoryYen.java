package conversion.factory.unite.money;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;
import conversion.factory.grandeur.atomique.FactoryMonnaie;

public class FactoryYen implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		return new UniteAtomique("Yen", Currency.getInstance(Locale.JAPAN).getSymbol(), new FactoryMonnaie().creerGrandeur());
	}
}
