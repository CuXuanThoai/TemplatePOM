package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.PreparedStatement;
import java.time.Duration;

public class Base {
    public static WebDriver driver ;
    public static WebDriver getDriver() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

}