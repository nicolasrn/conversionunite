package test;

import conversion.test.TestConversion;
import graphe.test.TestGraphe;
import cor.test.TestCOR;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCOR.class);
		suite.addTestSuite(TestGraphe.class);
		suite.addTestSuite(TestConversion.class);
		//$JUnit-END$
		return suite;
	}

}
