import Pages.MenuTollbarPage;
import Pages.ProductDetailsPage;
import Pages.ResultPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N11TestTest extends BaseTest{

    MenuTollbarPage menuTollbarPage;
    ResultPage resultPage;
    ProductDetailsPage productDetailsPage;

    @Test(priority = 1)
    public void searchProduct(){
        driver.get("https://www.n11.com/");
        menuTollbarPage=new MenuTollbarPage(driver);
        menuTollbarPage.setSearchText("Laptop");
    }
    @Test(priority = 2)
    public void selectResultProduct(){
       resultPage=new ResultPage(driver);
       WebElement resultWebElement=resultPage.getResultWebElement();
       softAssert.assertTrue(resultWebElement.isDisplayed());
       resultPage.clickToFirstProduct();
    }

    @Test(priority = 3)
    public void addToCart(){
        productDetailsPage=new ProductDetailsPage(driver);
        productDetailsPage.addToCart();
    }
}
