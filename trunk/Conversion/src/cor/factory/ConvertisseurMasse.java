package cor.factory;

import cor.CORSpe;
import cor.masse.KilogrammeVersGramme;

public class ConvertisseurMasse implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new KilogrammeVersGramme();
		return cor;
	}

}
