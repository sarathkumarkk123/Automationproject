package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registratin 
{
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/div/div[2]/ul/li/a")WebElement loginicon;
	@FindBy(xpath="/html/body/div[3]/div[1]/div[2]/div/div[2]/a")WebElement Resgisterbtn;
	@FindBy(xpath=" //*[@id=\"reg_billing_first_name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"reg_billing_last_name\"]")WebElement lastname; 
	@FindBy(xpath="//*[@id=\"reg_username\"]")WebElement username1;
	@FindBy(xpath="//*[@id=\"reg_email\"]")WebElement email;
	@FindBy(xpath="//*[@id=\"reg_password\"]")WebElement pass;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[6]/button")WebElement registerbtn;
	public registratin(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	public void log()
	{
		loginicon.click();
	}
	public void Resgisterbtn()
	{
		Resgisterbtn.click();
		firstname.sendKeys("sanvi");
		lastname.sendKeys("sarath");
		username1.sendKeys("sanvisarath02@gmail.com");
		email.sendKeys("sanvisarath2@gmail.com");
		pass.sendKeys("sanvi6282777977");
		
	}
	public void clk()
	{
		registerbtn.click();
	}
	}


