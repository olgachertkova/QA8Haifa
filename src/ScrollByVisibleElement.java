import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByVisibleElement {
    WebDriver driver;
    @Test
    public void ByVisibleElement() throws InterruptedException {
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application
        driver.get("http://facebook.com");
        Thread.sleep(5000);

        //Find element by class name and store in variable "Element"
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Facebook © 2021')]"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(5000);
        driver.quit();
    }
}
