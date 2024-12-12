package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(className ="resultText")
    private WebElement resultText;

    //@FindBy(className = "columnContent")
   // private WebElement columnContent;

    @FindAll(@FindBy(className = "columnContent"))
    private List<WebElement> columnContentList;

    public ResultPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public WebElement getResultWebElement(){
    return resultText;
    }

    public void clickToSelectProduct(int index){
       columnContentList.get(index).click();
    }

}
