package base.test;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.grandeur.factory.composite.FactoryAcceleration;
import base.grandeur.factory.composite.FactorySurface;
import base.grandeur.factory.composite.FactoryVitesse;
import junit.framework.TestCase;

public class TestGrandeur extends TestCase {
	public void testGrandeur()
	{
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put(Grandeur.Distance, 5.);
		map.put(Grandeur.Temps, 2.3);
		map.put(Grandeur.Surface, 4.);
		
		FactoryVitesse fv = new FactoryVitesse();
		Grandeur d = fv.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		
		FactorySurface fs = new FactorySurface();
		d = fs.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		
		FactoryAcceleration fa = new FactoryAcceleration();
		d = fa.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
	}
}
