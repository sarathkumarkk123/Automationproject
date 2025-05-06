package pagepackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginpage {

	
		WebDriver driver;
		@FindBy(xpath="/html/body/div[2]/header/div[1]/div/div/div[2]/ul/li/a/i")WebElement login;
		@FindBy(xpath="//*[@id=\"username\"]")WebElement username;
		@FindBy(xpath="//*[@id=\"password\"]")WebElement pass;
		@FindBy(xpath="/html/body/div[3]/div[1]/div[2]/div/div[1]/div/form/p[3]/button")WebElement loginbtn;
		@FindBy(xpath="/html/body/div[2]/main/section[2]/div/div/div/div[5]/a/img")WebElement coconutoil;
		@FindBy(xpath="/html/body/div[2]/header/div[2]/div/div/div[2]/a/img")WebElement logo;
		public void logo_check()
		{
			boolean l=logo.isDisplayed();
			if(l==true)
			{
				System.out.println("Logo is present");
			}
			else
			{
				System.out.println("Logo is not present");
			}
		}

		public void title_check()
		{
			String exp="Buy Mattress and Furniture Online | Kerala state Rubber Co-operative Limited";
			String act=driver.getTitle();
			Assert.assertEquals(exp,act);
			
			System.out.println("Title Matched");
		}
		public loginpage(WebDriver driver) 
		{
			this.driver=driver;	
			PageFactory.initElements(driver, this);
		}
		public void loginclick()
		{
			login.click();
		}
		public void setvalues(String email,String password)
		{
			username.sendKeys(email);
			
			pass.sendKeys(password);

		}
		public void login_btn()
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
//		        Actions act=new Actions(driver);
//		        act.moveToElement(loginbtn).perform();
			loginbtn.click();
		
		}
		public void screenshot() throws Exception
		{
			File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileHandler.copy(s,new File("./Screenshots/Login_screen.png"));
		
			System.out.println("Screenshot saved successfully");
			
		}
	    }
