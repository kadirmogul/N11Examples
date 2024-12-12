package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuTollbarPage extends BasePage {

    @FindBy (id = "searchData")
    private WebElement searchData;

    @FindBy(className = "basketTotalNum")
    private WebElement basketTotalNum;

    public MenuTollbarPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void setSearchText(String searchText){
        searchData.sendKeys(searchText+ Keys.ENTER);
    }
    public String getBasketTotalNumber(){
        return basketTotalNum.getText();
    }


}
