import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPage {
    WebDriver driver;
    @Test
    public void ByPage() throws InterruptedException {
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Launch the application
        driver.get("http://facebook.com");
        Thread.sleep(5000);
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("alert('Hello')");
        Thread.sleep(5000);
        driver.quit();
    }
}
