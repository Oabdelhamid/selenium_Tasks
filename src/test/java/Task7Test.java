import POM.checkCountryTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task7Test {
    WebDriver driver ;

    @BeforeMethod
    public void Setup(){
     driver = new ChromeDriver();
     driver.manage().window().maximize();
    }
    @AfterMethod
    public void TearDown(){
        driver.close();

    }

    @Test
    public void checkCountry(){
       String ActualCountry = new checkCountryTest(driver).Negative().scrollDown().checkTheCountry("Ernst Handel","Roland Mendel");
        Assert.assertEquals(ActualCountry,"Austria") ;

    }

}
