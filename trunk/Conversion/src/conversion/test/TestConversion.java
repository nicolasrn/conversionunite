package conversion.test;

import conversion.Grandeur;
import conversion.factory.FactoryDollar;
import conversion.factory.FactoryEuro;
import conversion.factory.FactoryYen;
import cor.factory.ConvertisseurMoney;
import junit.framework.TestCase;

public class TestConversion extends TestCase 
{
	public void testMoney() throws CloneNotSupportedException 
	{
		Grandeur a = new Grandeur(12, new FactoryEuro().creerUnite());
		Grandeur b = new Grandeur(6, new FactoryEuro().creerUnite());
		
		Grandeur c = new Grandeur(12, new FactoryYen().creerUnite());
		Grandeur d = new Grandeur(6, new FactoryDollar().creerUnite());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(a.add(b));
		System.out.println(b.add(a));
		
		System.out.println(a.sub(b));
		System.out.println(b.sub(a));
	}
	
	public void testConversion()
	{
		Grandeur a = new Grandeur(14, new FactoryDollar());
		a.setConvertisseur(new ConvertisseurMoney());
		
		Grandeur dest;
		//conversion Dollar Yen retourne null
		dest = a.convertir(new FactoryYen());
		System.out.println(dest);
		assertNull(dest);
		
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
