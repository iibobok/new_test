package pages;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CalculatorPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//input[@id='input_87']")
    private WebElement instancesNumber;

    @FindBy (xpath = "//div[@class='md-toolbar-tools flex-gt-sm-50']//h2")
    private WebElement title;

    @FindBy (xpath = "/html/body/md-content/md-card/md-card-content/md-card/md-card-content/h2")
    private WebElement text;

    @FindBy (xpath = "//*[@title='Compute Engine']")
    private WebElement button;


    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void inputInstancesNumber(final String number) {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("myFrame"));
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(instancesNumber));

        instancesNumber.click();
        instancesNumber.sendKeys(number);
    }

    public void selectLocation(){
        driver.findElement(By.xpath("(//span[@class='md-select-icon'])[14]")).click();
        driver.findElement(By.xpath("//md-option[@value='europe-west3']")).click();
    }

    public String titleText(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='md-toolbar-tools flex-gt-sm-50']//h2")));
        return driver.findElement(By.xpath("//div[@class='md-toolbar-tools flex-gt-sm-50']//h2")).getText();
    }

    public void clickButton(){
        button.click();
    }

    public void wtfText(){
        driver.findElement(ByAngular.model("listingCtrl.computeServer.quantity")).sendKeys("4");
    }

}
