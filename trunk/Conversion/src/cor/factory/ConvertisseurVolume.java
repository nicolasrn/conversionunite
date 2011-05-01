package cor.factory;

import cor.CORSpe;
import cor.volume.LitreVersDeciMetreCube;
import cor.volume.LitreVersGallon;
import cor.volume.LitreVersMiliLitre;
import cor.volume.SolveMetreCube;
import cor.volume.SolveVolume;

public class ConvertisseurVolume implements ICreerCOR {

	@Override
	public CORSpe creerConvertisseur() {
		CORSpe cor;
		cor = new SolveVolume();
		cor = new SolveMetreCube(cor);
		cor = new LitreVersDeciMetreCube(cor);
		cor = new LitreVersDeciMetreCube().getInverseInstance(cor);
		cor = new LitreVersMiliLitre(cor);
		cor = new LitreVersMiliLitre().getInverseInstance(cor);
		cor = new LitreVersGallon(cor);
		cor = new LitreVersGallon().getInverseInstance(cor);
		return cor;
	}

}
