import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    private final WebDriver driver;

    private final  By resultTotalLocator=By.className("resultText");
    private final By productLocator=By.className("columnContent");

    public ResultPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getResultWebElement(){
    return driver.findElement(resultTotalLocator);
    }

    public void clickToFirstProduct(){
       driver.findElement(productLocator).click();
    }

}
