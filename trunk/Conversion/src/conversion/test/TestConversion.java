package conversion.test;

import base.mesure.Mesure;
import conversion.factory.unite.acceleration.FactoryMetreSecondeCarre;
import conversion.factory.unite.acceleration.FactoryPiedMinuteCarre;
import conversion.factory.unite.acceleration.FactoryPiedSecondeCarre;
import conversion.factory.unite.distance.FactoryCentiMetre;
import conversion.factory.unite.distance.FactoryMetre;
import conversion.factory.unite.distance.FactoryPied;
import conversion.factory.unite.masse.FactoryGramme;
import conversion.factory.unite.masse.FactoryKiloGramme;
import conversion.factory.unite.money.FactoryDollar;
import conversion.factory.unite.money.FactoryEuro;
import conversion.factory.unite.money.FactoryYen;
import conversion.factory.unite.pression.FactoryAtmosphere;
import conversion.factory.unite.pression.FactoryBar;
import conversion.factory.unite.pression.FactoryPascal;
import conversion.factory.unite.surface.FactoryCentiMetreCarre;
import conversion.factory.unite.surface.FactoryDeciMetreCarre;
import conversion.factory.unite.surface.FactoryMetreCarre;
import conversion.factory.unite.temperature.FactoryCelsius;
import conversion.factory.unite.temperature.FactoryFahrenheit;
import conversion.factory.unite.temperature.FactoryKelvin;
import conversion.factory.unite.vitesse.FactoryMetreSeconde;
import conversion.factory.unite.vitesse.FactoryPiedMinute;
import conversion.factory.unite.vitesse.FactoryPiedSeconde;
import conversion.factory.unite.volume.FactoryDeciMetreCube;
import conversion.factory.unite.volume.FactoryMetreCube;
import conversion.factory.unite.volume.FactoryMiliLitre;
import cor.factory.ConvertisseurAcceleration;
import cor.factory.ConvertisseurDistance;
import cor.factory.ConvertisseurMasse;
import cor.factory.ConvertisseurMoney;
import cor.factory.ConvertisseurPression;
import cor.factory.ConvertisseurTemperature;
import cor.factory.ConvertisseurVitesse;
import cor.factory.ConvertisseurSurface;
import cor.factory.ConvertisseurVolume;
import junit.framework.TestCase;

public class TestConversion extends TestCase 
{
	public void testOperationSurMesure() throws CloneNotSupportedException 
	{
		System.out.println("--------------Test operation-----------------");
		Mesure a = new Mesure(12, new FactoryEuro());
		Mesure b = new Mesure(6, new FactoryEuro());
		
		Mesure c = new Mesure(12, new FactoryYen());
		Mesure d = new Mesure(6, new FactoryDollar());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(a.add(b));
		System.out.println(b.add(a));
		
		System.out.println(a.sub(b));
		System.out.println(b.sub(a));
		
	}
	
	public void testDistance() throws CloneNotSupportedException
	{
		System.out.println("--------------Test distance-----------------");
		Mesure b = new Mesure(12.21, new FactoryMetre());
		
		b.setConvertisseur(new ConvertisseurDistance());
		Mesure d = b.convertir(new FactoryPied());
		Mesure e = b.convertir(new FactoryCentiMetre());
		
		Mesure oe, od;
		e.setConvertisseur(new ConvertisseurDistance());
		d.setConvertisseur(new ConvertisseurDistance());
		
		oe = e.convertir(new FactoryMetre());
		od = d.convertir(new FactoryMetre());
		
		System.out.println(b + " = " + d);
		System.out.println(b + " = " + e);
		
		System.out.println(e + " = " + oe);
		System.out.println(d + " = " + od);
	}
	
	public void testVitesse() throws CloneNotSupportedException
	{
		System.out.println("--------------Test vitesse-----------------");
		Mesure b = new Mesure(8.3, new FactoryMetreSeconde());
		
		b.setConvertisseur(new ConvertisseurVitesse());
		Mesure d = b.convertir(new FactoryPiedSeconde());
		Mesure e = b.convertir(new FactoryPiedMinute());
		
		System.out.println(b + " = " + d);
		System.out.println(b + " = " + e);
		
	}
	
	public void testAcceleration() throws CloneNotSupportedException
	{
		System.out.println("--------------Test acceleration-----------------");
		Mesure b = new Mesure(12.21, new FactoryMetreSecondeCarre());
		
		b.setConvertisseur(new ConvertisseurAcceleration());
		Mesure d = b.convertir(new FactoryPiedSecondeCarre());
		Mesure e = b.convertir(new FactoryPiedMinuteCarre());
		
		System.out.println(b + " = " + d);
		System.out.println(b + " = " + e);
		
	}
	
	public void testMasse() throws CloneNotSupportedException
	{
		System.out.println("--------------Test masse-----------------");
		Mesure b = new Mesure(1, new FactoryKiloGramme());
		b.setConvertisseur(new ConvertisseurMasse());
		
		Mesure d = b.convertir(new FactoryGramme());
		
		System.out.println(b + " = " + d);
	}
	
	public void testSurface() throws CloneNotSupportedException
	{
		System.out.println("--------------Test surface-----------------");
		Mesure b = new Mesure(1, new FactoryMetreCarre());
		b.setConvertisseur(new ConvertisseurSurface());
		
		Mesure d = b.convertir(new FactoryCentiMetreCarre());
		Mesure e = b.convertir(new FactoryDeciMetreCarre());
		
		System.out.println(b + " = " + d);
		System.out.println(b + " = " + e);
	}
	
	public void testPression() throws CloneNotSupportedException
	{
		System.out.println("--------------Test pression-----------------");
		Mesure b = new Mesure(5, new FactoryPascal());
		b.setConvertisseur(new ConvertisseurPression());
		
		Mesure d = b.convertir(new FactoryBar());
		Mesure e = b.convertir(new FactoryAtmosphere());
		System.out.println(b + " = " + d);
		System.out.println(b + " = " + e);
	}
	
	public void testTemperature() throws CloneNotSupportedException
	{
		System.out.println("--------------Test temperature-----------------");
		Mesure b = new Mesure(5, new FactoryCelsius());
		b.setConvertisseur(new ConvertisseurTemperature());
		
		Mesure d = b.convertir(new FactoryFahrenheit());
		System.out.println(b + " = " + d);
		d.setConvertisseur(new ConvertisseurTemperature());
		Mesure e = d.convertir(new FactoryCelsius());
		System.out.println(d + " = " + e);
		Mesure f = b.convertir(new FactoryKelvin());
		System.out.println(b + " = " + f);
	}
	
	public void testVolume() throws CloneNotSupportedException
	{
		System.out.println("--------------Test volume-----------------");
		Mesure b = new Mesure(5, new FactoryMetreCube());
		b.setConvertisseur(new ConvertisseurVolume());
		
		Mesure d = b.convertir(new FactoryDeciMetreCube());
		System.out.println(b + " = " + d);
		
		Mesure e = b.convertir(new FactoryMiliLitre());
		
		System.out.println(b + " = " + e);
	}
	
	public void testConversionAvecGraphe()
	{
		System.out.println("--------------Test conversion-----------------");
		Mesure a = new Mesure(14.3, new FactoryDollar());
		a.setConvertisseur(new ConvertisseurMoney());
		
		Mesure dest;
		//conversion Dollar Yen retourne null
		dest = a.convertir(new FactoryYen());
		System.out.println(dest);
		assertNotNull(dest);
		
		//conversion dollar euro retourne ok
		dest = a.convertir(new FactoryEuro());
		System.out.println(dest);
		assertNotNull(dest);
		
		//conversion euro yen retourne ok
		dest.setConvertisseur(new ConvertisseurMoney());
		dest = dest.convertir(new FactoryYen());
		System.out.println(dest);
		assertNotNull(dest);
	}
}
