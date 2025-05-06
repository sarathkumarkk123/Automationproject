package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.checkoutpayment;


public class checkoutpaymenttest extends Baseclass
{
	@Test
	public void paymentclick() throws Exception 
	{
		
    checkoutpayment  ob=new checkoutpayment(driver);
	ob.checkout_info( "sanvi","sarath","kmk street1","aluva","683105","9999888866","sanvisarath2@gmail.com");
	ob.screenshot1();
	
	}
}
