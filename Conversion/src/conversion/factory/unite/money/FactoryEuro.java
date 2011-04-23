package conversion.factory.unite.money;

import java.util.Currency;
import java.util.Locale;

import conversion.GrandeurAtomique;
import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;

public class FactoryEuro implements ICreationUnite
{
	@Override
	public Unite creerUnite() {
		return new UniteAtomique("Euro", Currency.getInstance(Locale.FRANCE).getSymbol(), new GrandeurAtomique("Argent"));
	}	
}
