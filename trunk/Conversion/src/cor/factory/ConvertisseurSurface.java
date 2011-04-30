package cor.factory;

import cor.CORSpe;
import cor.surface.SolveSurface;

public class ConvertisseurSurface implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new SolveSurface();
		return cor;
	}

}
