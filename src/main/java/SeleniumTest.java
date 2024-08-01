import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main (String[] args) {
        System.setProperty ("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get ("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

         driver.quit();

    }

}

