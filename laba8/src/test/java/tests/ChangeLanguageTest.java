package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ChangeLanguageTest extends BaseTest {
    private static final String MESSAGE = "Szeroki wybór kursów";

    @Test(priority = 1)
    public void changeLanguageTest() {
        String actualMessage = new HomePage(driver)
                .clickOnLanguageButton()
                .clickOnPolskiButton()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }

}
