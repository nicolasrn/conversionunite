package base.test;

import base.grandeur.Grandeur;
import base.grandeur.factory.composite.FactoryVitesse;
import junit.framework.TestCase;

public class TestGrandeur extends TestCase {
	public void testGrandeur()
	{
		FactoryVitesse fv = new FactoryVitesse();
		Grandeur d = fv.creerGrandeur();
		System.out.println(d.evaluer());
	}
}
