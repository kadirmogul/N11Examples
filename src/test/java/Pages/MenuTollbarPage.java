import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MenuTollbarPage {
    private final  WebDriver driver;
    private final By searchTextLocator=By.id("searchData");
    private final By basketTotalNumberLocator=By.className("basketTotalNum");

    public MenuTollbarPage(WebDriver driver){
        this.driver=driver;
    }
    public void setSearchText(String searchText){
        driver.findElement(searchTextLocator).sendKeys(searchText+ Keys.ENTER);
    }
    public String getBasketTotalNumber(){
        return driver.findElement(basketTotalNumberLocator).getText();
    }


}
