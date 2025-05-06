package pagepackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutpayment {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "billing_first_name")
    WebElement fname;

    @FindBy(id = "billing_last_name")
    WebElement lname;

    @FindBy(id = "billing_address_1")
    WebElement address;

    @FindBy(id = "billing_city")
    WebElement billingcity;

    @FindBy(id = "billing_postcode")
    WebElement postcode;

    @FindBy(id = "billing_phone")
    WebElement phone;

    @FindBy(id = "billing_email")
    WebElement email;

    @FindBy(id = "place_order")
    WebElement placeorder;

    public checkoutpayment(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void checkout_info(String firstname, String lastname, String address1, String billingcity1, String postcode1, String phone1, String email1) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(fname));
        fname.clear();
        fname.sendKeys(firstname);

        wait.until(ExpectedConditions.visibilityOf(lname));
        lname.clear();
        lname.sendKeys(lastname);

        wait.until(ExpectedConditions.visibilityOf(address));
        address.clear();
        address.sendKeys(address1);

        wait.until(ExpectedConditions.visibilityOf(billingcity));
        billingcity.clear();
        billingcity.sendKeys(billingcity1);

        wait.until(ExpectedConditions.visibilityOf(postcode));
        postcode.clear();
        postcode.sendKeys(postcode1);

        wait.until(ExpectedConditions.visibilityOf(phone));
        phone.clear();
        phone.sendKeys(phone1);

        wait.until(ExpectedConditions.visibilityOf(email));
        email.clear();
        email.sendKeys(email1);

        // Scroll to the "Place Order" button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", placeorder);

        // Wait until it's clickable
        wait.until(ExpectedConditions.elementToBeClickable(placeorder));

        try {
            // Try normal click first
            placeorder.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            // If intercepted, try JS click
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeorder);
        }

        Thread.sleep(15000);  // Reduce from 50s unless absolutely needed
    }
    public void screenshot1() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(s,new File("./Screenshots/Payment_screen.png"));
	
		System.out.println("Screenshot saved successfully");
		
	}
}