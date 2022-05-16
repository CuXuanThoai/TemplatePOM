package DataDriven;

import java.io.IOException;

import java.util.stream.Stream;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriventTest  {

    WebDriver driver;
   static String path ="C:\\Users\\ad\\IntelliJIDEAProjects\\TemplatePOM\\src\\test\\java\\Files\\loginData.xlsx";
    @BeforeClass
    public void setup() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String exp) throws InterruptedException {

        WebElement txtEmail=driver.findElement(By.id("Email"));
        txtEmail.clear();
        Thread.sleep(2000);
        txtEmail.sendKeys(user);
             Thread.sleep(2000);
        WebElement txtPassword=driver.findElement(By.id("Password"));
        txtPassword.clear();
        Thread.sleep(2000);
        txtPassword.sendKeys(pwd);
        Thread.sleep(2000);
    }

    @DataProvider(name = "LoginData")
         public  static String[][] getData () throws IOException {
             String loginData [][] = Excel.DataProvider(path, "Sheet1");
             return loginData ;
    }

}

