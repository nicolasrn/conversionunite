package conversion.factory.money;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryYen implements ICreationUnite 
{
	@Override
	public Unite creerUnite() 
	{
		return new UniteAtomique("Yen", Currency.getInstance(Locale.JAPAN).getSymbol());
	}
}
