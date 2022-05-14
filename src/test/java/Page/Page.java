package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page {
    public class AddCart {
        WebDriver driver;
        Actions act;
        Select slt;

        public AddCart(WebDriver driver) {
            this.driver = driver;
            act = new Actions(driver);
        }
        // Declare By , method
    }
}