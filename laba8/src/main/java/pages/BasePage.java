package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    private static final int TIMEOUT = 30;
    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        PageFactory.initElements(driver,this);
    }

    protected void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    }
}
