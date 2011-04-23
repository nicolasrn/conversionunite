package conversion;

import conversion.factory.ICreationUnite;
import conversion.factory.unite.vitesse.FactoryPiedSeconde;
import cor.CORSpe;
import cor.factory.ConvertisseurMoney;
import cor.factory.ICreerCOR;

public class Mesure implements Cloneable{
	private double valeur;
	private Unite unite;
	private CORSpe convertisseur;
	
	public Mesure(double valeur, ICreationUnite unite)
	{
		this.valeur = valeur;
		this.unite = unite.creerUnite();
	}
	
	public Mesure(double valeur, Unite unite)
	{
		this.valeur = valeur;
		this.unite = unite;
	}

	public Mesure add(Mesure b) throws CloneNotSupportedException {
		Mesure m = null;
		if (unite.equals(b.unite))
		{
			m = (Mesure)this.clone();
			m.valeur = valeur + b.valeur;
		}
		return m;
	}
	
	public Mesure sub(Mesure b) throws CloneNotSupportedException {
		Mesure m = null;
		if (unite.equals(b.unite))
		{
			m = (Mesure)this.clone();
			m.valeur = valeur - b.valeur;
		}
		return m;
	}

	public CORSpe getConvertisseur() {
		return convertisseur;
	}

	public void setConvertisseur(ICreerCOR convertisseur) {
		this.convertisseur = convertisseur.creerConvertisseur();
	}

	public double getValeur() {
		return valeur;
	}

	public Unite getUnite() {
		return unite;
	}

	public Mesure convertir(ICreationUnite unite) {
		return convertisseur.resoudre(unite.creerUnite(), this);
	}

	@Override
	public String toString() {
		return "Mesure [valeur=" + valeur + ", unite=" + unite + "]";
	}
}
