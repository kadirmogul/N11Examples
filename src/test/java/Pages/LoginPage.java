package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(className = "error-message")
    private WebElement errorMessage;

    public void setEmail(String eMail){
        emailInput.sendKeys(eMail);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickToButton(){
        loginButton.click();
    }
    public WebElement getErrorMessage(){
         return errorMessage;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void getURL(String url){
        driver.get(url);
    }


}
