package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.registratin;

public class registrationtest 
{
	public class RegisterTest extends Baseclass 
	{
           @Test
		public void set() throws Exception
		{
			registratin ob=new registratin (driver);
			ob.log();
			Thread.sleep(1000);
			ob.Resgisterbtn();
			Thread.sleep(1000);
			ob.clk();
		}
	}
}
