package tests;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.CalculatorPage;
import pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver;

public class BaseTests {
    private WebDriver driver;
    private static final String URL = "https://cloud.google.com/";

    @BeforeTest
    public void profileSetUP() { chromedriver().setup(); }

    @BeforeMethod
    public void testsSetUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public StartPage getStartPage() { return new StartPage(getDriver()); }

    public CalculatorPage getCalculatorPage() { return new CalculatorPage(getDriver()); }

}

