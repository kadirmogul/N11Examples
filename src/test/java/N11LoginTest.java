import Pages.BasePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class N11Login extends BaseTest {
    LoginPage loginPage;

    @Test
    public void n11LoginTest(){
        loginPage=new LoginPage(driver);
        loginPage.getUrl("https://www.n11.com/giris-yap");
        loginPage.setEmail("mogulabdulkadir@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickToButton();
        softAssert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    }

}