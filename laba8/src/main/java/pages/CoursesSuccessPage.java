package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesSuccessPage extends BasePage {
    private WebElement actualMessage = driver.findElement(By.xpath
            ("//h1[@class='ud-heading-xl search--header-title--Et0Ha']"));
    public CoursesSuccessPage(WebDriver driver) {
        super(driver);
    }
    public String getActualMessage() {
        implicitlyWait();
        return actualMessage.getText();
    }
}
