package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StartPageTest extends BaseTests {

    @Test
    public void inputSearchString() throws InterruptedException {

        final String SEARCH_STRING = "Google Cloud Platform Pricing Calculator";
        final String INSTANCES_NUMBER = "4";

        getStartPage().clickSearchBtn();
        getStartPage().inputSearchString(SEARCH_STRING);
        getStartPage().submitSearch();
        getStartPage().implicitWait(20);
        getStartPage().openCalculator();
        getStartPage().implicitWait(20);
        //Thread.sleep(2000000);
        //System.out.println(getCalculatorPage().titleText());
        getCalculatorPage().inputInstancesNumber(INSTANCES_NUMBER);

        //getCalculatorPage().selectLocation();
        Thread.sleep(5000);

    }
}
