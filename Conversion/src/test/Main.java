package test;

import base.mesure.Mesure;
import conversion.factory.unite.volume.FactoryGallon;
import conversion.factory.unite.volume.FactoryMetreCube;
import cor.factory.ConvertisseurVolume;

public class Main {
	public static final boolean trace = false;
	public static void main(String[] args) {
		System.out.println("--------------Trace volume-----------------");
		Mesure b = new Mesure(5.34, new FactoryMetreCube());
		b.setConvertisseur(new ConvertisseurVolume());
		
		Mesure d = b.convertir(new FactoryGallon());
		
		System.out.println(b + " = " + d); 
	}
}
