package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class producttocart 
{
	WebDriver driver;
    
    @FindBy(xpath = "/html/body/div[2]/main/section[2]/div/div/div/div[5]/a/img")
    WebElement product;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[2]/div[1]/div/p/a") 
    WebElement addproduct;
    @FindBy(xpath = "//*[@id=\"product-628\"]/div[2]/form/button") 
    WebElement addToCart;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[4]/div[2]/a[3]")
    WebElement checkout;

    public producttocart (WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  
    public void buyCoconutOil() throws InterruptedException
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,300)");
    	product.click();
    	
    	js.executeScript("window.scrollBy(0,300)");
    	addproduct.click();
    	
        Thread.sleep(3000); 
        addToCart.click();
        Thread.sleep(3000); 
        checkout.click();
        Thread.sleep(3000);
    }
}

