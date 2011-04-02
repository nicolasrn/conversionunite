package cor.test;

import cor.CORSpe;
import cor.DollarVersEuro;
import cor.EuroVersYen;
import junit.framework.TestCase;


public class TestCOR extends TestCase 
{
	public void testCORConstruction1()
	{
		CORSpe cor = new DollarVersEuro();
		cor = new EuroVersYen(cor);
	}
	
	public void testCORConstruction2()
	{
		CORSpe cor = new DollarVersEuro();
		cor.add(new EuroVersYen());	
	}
}
