import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheapTripValidation {
    WebDriver driver;
    String cityFromText = "Kiev";
    String cityToText = "Moscow";

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://lowcoststrip.com/search/");
    }

    @Test
    public void searchTripPositiveTest() throws InterruptedException {
        WebElement cityFrom = driver.findElement(By.id("mat-input-0"));
        fillField(cityFrom, cityFromText);
        Thread.sleep(1000);
        WebElement submitCityFrom = driver.findElement(By.cssSelector("span.mat-option-text"));
        submitCityFrom.click();

        WebElement cityTo = driver.findElement(By.id("mat-input-1"));
        fillField(cityTo, cityToText);
        Thread.sleep(1000);
        WebElement submitCityTo = driver.findElement(By.cssSelector("span.mat-option-text"));
        submitCityTo.click();

        WebElement letsGoButton = driver.findElement(By.cssSelector("button.mat-primary"));
        letsGoButton.click();

        Thread.sleep(5000);

        WebElement searchResultArea = driver.findElement(By.className("aside"));
        if (searchResultArea.isDisplayed()){
            System.out.println("Test Passed!");
        }
        else {
            System.out.println("Test Failed!");
        }

    }

    public void fillField(WebElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void clickOnButton(WebElement element){
        element.click();
    }



    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }



}
