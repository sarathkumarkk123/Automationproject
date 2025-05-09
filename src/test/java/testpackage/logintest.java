package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.loginpage;
import uitilities.exceluitilities;


public class logintest extends Baseclass
{
	@Test
	public void datadriven() throws Exception
	{
		loginpage ob=new loginpage (driver);
		
		ob.title_check();
		ob.logo_check();
		String xl="C:\\Users\\welcome\\Desktop\\Rubco2.xlsx";
		String Sheet="Sheet1";
		int rowCount=exceluitilities.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			
			String Username=exceluitilities.getCellValString(xl,Sheet,i,0);
			System.out.println("Username="+Username);
			
			String pwd=exceluitilities.getCellValString(xl,Sheet,i,1);
			System.out.println("Password="+pwd);
			ob.loginclick();
			ob.setvalues(Username, pwd);
			ob.login_btn();
			Thread.sleep(1000);
			driver.navigate().refresh();
			driver.get(" https://www.rubcogroup.com/");

			

			
		}
		ob.screenshot();
				
	}
}


