import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ZoomOnPage {
    @Test
    public void zoomOnPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        Thread.sleep(5000);
//        WebElement html = driver.findElement(By.tagName("html"));
//        html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));

//        new Actions(driver)
//                .sendKeys(html, Keys.CONTROL, Keys.ADD, Keys.NULL)
//                .perform();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom = '0.5'");

        Thread.sleep(5000);
        driver.quit();
    }
}
