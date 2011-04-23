package conversion.factory.unite.money;

import java.util.Currency;
import java.util.Locale;

import conversion.Unite;
import conversion.UniteAtomique;
import conversion.factory.ICreationUnite;
import conversion.factory.grandeur.atomique.FactoryMonnaie;

public class FactoryDollar implements ICreationUnite 
{
	@Override
	public Unite creerUnite() {
		return new UniteAtomique("Dollar", Currency.getInstance(Locale.US).getSymbol(), new FactoryMonnaie().creerGrandeur());
	}
}
