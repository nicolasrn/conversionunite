package cor.factory;

import test.Main;
import cor.CORSpe;
import cor.volume.LitreVersDeciMetreCube;
import cor.volume.LitreVersGallon;
import cor.volume.LitreVersMiliLitre;
import cor.volume.SolveCube;
import cor.volume.SolveVolume;

public class ConvertisseurVolume implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		if (Main.trace) System.out.println("instanciation création COR volume");
		CORSpe cor;
		cor = new SolveVolume();
		cor = new SolveCube(cor);
		cor = new LitreVersDeciMetreCube(cor);
		cor = new LitreVersDeciMetreCube().getInverseInstance(cor);
		cor = new LitreVersMiliLitre(cor);
		cor = new LitreVersMiliLitre().getInverseInstance(cor);
		cor = new LitreVersGallon(cor);
		cor = new LitreVersGallon().getInverseInstance(cor);
		return cor;
	}

}
