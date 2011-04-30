package base.test;

import java.util.HashMap;

import base.grandeur.Grandeur;
import base.grandeur.factory.composite.FactoryAcceleration;
import base.grandeur.factory.composite.FactoryPression;
import base.grandeur.factory.composite.FactorySurface;
import base.grandeur.factory.composite.FactoryVitesse;
import junit.framework.TestCase;

public class TestGrandeur extends TestCase {
	public void testGrandeur()
	{
		System.out.println("--------------test grandeur--------------------------");
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put(Grandeur.Distance, 5.);
		map.put(Grandeur.Temps, 2.3);
		map.put(Grandeur.Surface, 4.);
		map.put(Grandeur.Force, 3.1);
		map.put(Grandeur.Acceleration, 9.81);
		map.put(Grandeur.Masse, 5.);
		
		Grandeur d;
		FactoryVitesse fv = new FactoryVitesse();
		d = fv.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		System.out.println(d + " = " + d.ecrireEvaluation(map));
		
		FactorySurface fs = new FactorySurface();
		d = fs.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		System.out.println(d + " = " + d.ecrireEvaluation(map));
		
		FactoryAcceleration fa = new FactoryAcceleration();
		d = fa.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		System.out.println(d + " = " + d.ecrireEvaluation(map));
		
		FactoryPression fp = new FactoryPression();
		d = fp.creerGrandeur();
		System.out.println(d + " = " + d.evaluer(map));
		System.out.println(d + " = " + d.ecrireEvaluation(map));
	}
}
