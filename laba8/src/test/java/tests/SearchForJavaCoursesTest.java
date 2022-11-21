package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchForJavaCoursesTest extends BaseTest {
    private static final String MESSAGE = "10,000 results";

    @Test(priority = 3)
    public  void searchForJavaCoursesTest() {
        String actualMessage = new HomePage(driver)
                .enterCourseName()
                .pressEnter()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }
}
