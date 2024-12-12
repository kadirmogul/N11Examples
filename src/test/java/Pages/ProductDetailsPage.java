import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    private final  WebDriver driver;

    private final  By addBasketLocator=By.className("addBasketUnify");

    public ProductDetailsPage(WebDriver driver){
        this.driver=driver;
    }
    public void addToCart(){
        driver.findElement(addBasketLocator).click();
    }

}
