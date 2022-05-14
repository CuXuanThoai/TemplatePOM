package TestCases;

import Base.Base;
import Page.Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

    public class TestCase extends Base {
        WebDriver driver;
        Page page;
        @BeforeClass
        public void setUp() {
            driver = getDriver();
        }
        @AfterClass
        public void tearDown() throws Exception {
            Thread.sleep(2000);
            driver.quit();
        }
        // TC
    }

