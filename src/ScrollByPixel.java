import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPixel {
    WebDriver driver;
    @Test
    public void ByPixel() throws InterruptedException {
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application
        driver.get("http://facebook.com");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(5000);

        driver.quit();
    }
}
