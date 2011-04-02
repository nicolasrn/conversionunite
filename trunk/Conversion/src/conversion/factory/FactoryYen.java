package conversion.factory;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;

public class FactoryYen implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		return new UniteAtomique("Yen", Currency.getInstance(Locale.JAPAN).getSymbol());
	}
}