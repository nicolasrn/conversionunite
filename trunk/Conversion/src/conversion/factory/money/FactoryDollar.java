package conversion.factory.money;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryDollar implements ICreationUnite 
{
	@Override
	public Unite creerUnite() {
		return new UniteAtomique("Dollar", Currency.getInstance(Locale.US).getSymbol());
	}
}
