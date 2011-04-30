package cor.test;

import cor.CORSpe;
import cor.money.DollarVersEuro;
import cor.money.EuroVersYen;
import junit.framework.TestCase;


public class TestCOR extends TestCase 
{
	public void testCORConstruction1()
	{
		System.out.println("--------------test COR construction--------------------------");
		CORSpe cor = new DollarVersEuro();
		cor = new EuroVersYen(cor);
		
		cor = new DollarVersEuro();
		cor.add(new EuroVersYen());	
	}
}
