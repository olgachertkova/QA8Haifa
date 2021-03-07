import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingMouse {
        @Test
        public void SeriesActions() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            String baseUrl2 = "http://www.facebook.com/";
            driver.get(baseUrl2);
            WebElement loginField = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            Action seriesOfActions = builder
                        .moveToElement(loginField)
                        .click()
                        .keyDown(loginField, Keys.SHIFT)
                        .sendKeys(loginField, "hello")
                        .keyUp(loginField, Keys.SHIFT)
                        .doubleClick(loginField)
                        .contextClick()
                        .build();

            seriesOfActions.perform();
            Thread.sleep(3000);
            driver.quit();

        }


}

