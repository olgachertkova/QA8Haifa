import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowTest {
    @Test
    public void windowSizeTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        System.out.println("First size: " + driver.manage().window().getSize());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Second size: " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        System.out.println("Third size: " + driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(1000,500));
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getSize());
        driver.quit();
    }

    @Test
    public void navigateTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url1 = "https://www.facebook.com/";
        String url2 = "https://vp.ru/";

        driver.get(url1);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.get(url2);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);


        driver.quit();
    }
}
