package cor.factory;

import cor.CORSpe;
import cor.acceleration.SolveAcceleration;

public class ConvertisseurAcceleration implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor = new SolveAcceleration();
		return cor;
	}

}
