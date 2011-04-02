package conversion.factory;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;

public class FactoryEuro implements ICreationUnite
{
	@Override
	public Unite creerUnite() {
		return new UniteAtomique("Euro", Currency.getInstance(Locale.FRANCE).getSymbol());
	}	
}
