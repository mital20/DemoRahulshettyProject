package WebTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
    public void setUpBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
        driver.get("https://rahulshettyacademy.com/#/index");
    }

    public void setUpCloseBrowser ()
    {
        driver.close();
    }
}
