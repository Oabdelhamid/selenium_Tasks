package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class checkCountryTest {
    WebDriver driver ;

    public checkCountryTest( WebDriver driver){
        this.driver = driver ;

    }

    public checkCountryTest Negative(){
        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        return  this;
    }
    public checkCountryTest scrollDown(){
        By submitButton = By.cssSelector("button[type='submit']");
        new Actions(driver).scrollToElement(driver.findElement(submitButton)).perform();  // scrollDown
        return this;

    }

    public String checkTheCountry(String company ,String ContactNumber){
        By country = By.xpath("//tr[contains(.,'"+company+"')][contains(.,'"+ContactNumber+"')]/td[3]");
       return driver.findElement(country).getText();
    }

}
