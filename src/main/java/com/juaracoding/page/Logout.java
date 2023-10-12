package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    private WebDriver driver;
    private JavascriptExecutor jse;
    private int windowHeight;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    private WebElement logoutBtn;


    // constructor Logout
    public Logout(){
        this.driver = DriverSingleton.getDriver();
        this.jse = DriverSingleton.getJse();
        this.windowHeight = DriverSingleton.getWindowHeight();
        PageFactory.initElements(driver, this);
    }

    // Logout
    public void login(String username, String password, String email){
        if (driver.getCurrentUrl().equals(Constants.URLMYACCOUNT)){
            logoutBtn.click();
        } else {
            driver.get(Constants.URLMYACCOUNT);
            logoutBtn.click();
        }
    }
}
