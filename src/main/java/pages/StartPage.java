package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {


    @FindBy (xpath = "//input[@name='q']")
    private WebElement serchBtn;

    @FindBy (xpath = "(//a[contains(@data-ctorig,'calculator')])[1]")
    private WebElement calculatorLink;


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchBtn(){
        serchBtn.click();
    }

    public void inputSearchString(final String search_string){
        serchBtn.sendKeys(search_string);
    }

    public void submitSearch(){
        serchBtn.sendKeys(Keys.ENTER);
    }

    public void openCalculator(){
        calculatorLink.click();
    }


}
