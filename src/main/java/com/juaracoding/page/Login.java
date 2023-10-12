package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;
    private JavascriptExecutor jse;
    private int windowHeight;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement regisBtn;
    @FindBy(xpath = "//li[normalize-space()='The password field is empty.']")
    private WebElement passRequired;
    @FindBy(xpath = "//li[normalize-space()='Username is required.']")
    private WebElement userRequired;
    @FindBy(xpath = "//li[normalize-space()=': The username or password you entered is incorrect. Lost your password?']")
    private WebElement txtInvalid;
//    @FindBy(xpath = "//contains(text(),': The username or password you entered is incorrect. Lost your password?')")
//    private WebElement txtInvalid;
    //div[@id='primary']//li[1]




    // constructor registration
    public Login(){
        this.driver = DriverSingleton.getDriver();
        this.jse = DriverSingleton.getJse();
        this.windowHeight = DriverSingleton.getWindowHeight();
        PageFactory.initElements(driver, this);
    }

    // Login
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        regisBtn.click();
    }

    public void findForm(){
        System.out.println(windowHeight);
//        System.out.println(driver.manage().window().getSize());

        if (windowHeight > 1382){
            jse.executeScript("window.scrollBy(0,500)");
            System.out.println("Scroll Down page by 500px");
        } else {
            jse.executeScript("window.scrollBy(0,600)");
            System.out.println("Scroll Down page by 600px");
        }

    }

    public String getUserRequired(){
        System.out.println(userRequired.getText());
        return userRequired.getText();
    }
    public String getPassRequired(){
        System.out.println(passRequired.getText());
        return passRequired.getText();
    }
    public String getInvalid(){
        System.out.println(txtInvalid.getText());
        return txtInvalid.getText();
    }

}
