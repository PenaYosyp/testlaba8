package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//img[@src='/staticx/udemy/images/v7/logo-udemy.svg']" )
    private WebElement logo;

    @FindBy(xpath = "//button[contains(@class,'ud-btn udlite-btn ud-btn-medium udlite-btn-medium ud-btn-s')]")
    private WebElement languageButton;

    @FindBy(xpath = "//span[@lang='pl']")
    private WebElement polskiButton;

    @FindBy(xpath = "//input[@placeholder='Search for anything']")
    private WebElement searchField;

    private String courseName = "Java";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnLanguageButton() {
        implicitlyWait();
        languageButton.click();
        return this;
    }

    public LanguageSuccessPage clickOnPolskiButton() {
        implicitlyWait();
        polskiButton.click();
        return new LanguageSuccessPage(driver);
    }

    public boolean hasLogo() {
        implicitlyWait();
        return logo.isDisplayed();
    }

    public HomePage enterCourseName() {
        implicitlyWait();
        searchField.sendKeys(courseName);
        return this;
    }

    public CoursesSuccessPage pressEnter() {
        implicitlyWait();
        searchField.sendKeys(Keys.ENTER);
        return new CoursesSuccessPage(driver);
    }
}
