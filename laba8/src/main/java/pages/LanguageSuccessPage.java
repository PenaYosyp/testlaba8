package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageSuccessPage extends BasePage {
    private WebElement actualMessage = driver.findElement(By.xpath
            ("//h2[@id='Szeroki wybór kursów']"));

    public LanguageSuccessPage(WebDriver driver) {
        super(driver);
    }
    public String getActualMessage() {
        implicitlyWait();
        return actualMessage.getText();
    }
}
