package base.mesure;

import test.Main;
import base.unite.Unite;
import conversion.factory.ICreationUnite;
import cor.CORSpe;
import cor.factory.ICreerCOR;

public class Mesure implements Cloneable{
	private double valeur;
	private Unite unite;
	private CORSpe convertisseur;
	
	public Mesure(double valeur, ICreationUnite unite)
	{
		if (Main.trace) System.out.println("instanciation mesure");
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
		return convertir(unite.creerUnite());//convertisseur.resoudre(unite.creerUnite(), this);
	}

	public Mesure convertir(Unite unite) {
		if (Main.trace) System.out.println("d�but de la r�solution : " + this.getClass().getSimpleName());
		return convertisseur.resoudre(unite, this);
	}
	
	@Override
	public String toString() {
		return "Mesure [valeur=" + valeur + ", unite=" + unite + "]";
	}
}
