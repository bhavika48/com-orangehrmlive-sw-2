package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        driver=new ChromeDriver();

        // Launch the url
        driver.get(baseUrl);

        // maximize the windows
        driver.manage().window().maximize();

        // implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    public void closeBrowser(){
        driver.quit();
    }
}
