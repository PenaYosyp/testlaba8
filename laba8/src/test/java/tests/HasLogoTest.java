package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HasLogoTest extends BaseTest {
    @Test(priority = 2)
    public  void hasLogoTest() {
        boolean isLogoDisplayed = new HomePage(driver)
                .hasLogo();
        Assert.assertTrue(isLogoDisplayed);
    }
}
