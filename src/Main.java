import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Chrome browser!");
        String baseURL = "https://www.facebook.com/";
        String expectTitle = "Facebook – log in or sign up";
        String actTitle;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        actTitle = driver.getTitle();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (actTitle.contentEquals(expectTitle)){
            System.out.println("TEST PASSED!");
        }
        else {
            System.out.println("TEST FAILED!");
        }

        WebElement loginField = driver.findElement(By.id("email"));
        WebElement logF = driver.findElement(By.cssSelector("#email"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("test");

        WebElement passField = driver.findElement(By.name("pass"));
        WebElement pasF = driver.findElement(By.cssSelector("[name='pass']"));
        passField.click();
        passField.clear();
        passField.sendKeys("123123");



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement forgotPassLink = driver.findElement(By.linkText("Forgotten password?"));
        System.out.println(forgotPassLink.getText());

        WebElement createNewAccountButton = driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
        System.out.println(createNewAccountButton.getText());

        WebElement loginButton = driver.findElement(By.tagName("button"));
        System.out.println(loginButton.getText());
        loginButton.click();


        driver.close();
        driver.quit();

    }
}
