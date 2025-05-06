package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.producttocart;

public class producttocarttest extends Baseclass 
{
	@Test
	public void mthd() throws InterruptedException 
	{
		producttocart ob=new producttocart(driver);
		ob.buyCoconutOil();
}
}