package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public void getBrowserTitle(){
        driver.getTitle();
    }
    public void getPageURL(){
        driver.getCurrentUrl();
    }
    public void getUrl(String urlAdress){
        driver.get(urlAdress);

    }

}
