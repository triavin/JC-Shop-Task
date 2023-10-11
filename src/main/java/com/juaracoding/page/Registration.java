package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
    private WebDriver driver;
    private JavascriptExecutor jse;
    private int windowHeight;

    @FindBy(xpath = "//input[@id='reg_username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='reg_email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='reg_password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='reg_password']")
    private WebElement regisBtn;
    @FindBy(xpath = "//input[@id='reg_password']")
    private WebElement url;
    @FindBy(xpath = "//h2[normalize-space()='Register']")
    private WebElement regisHeader;
    @FindBy(xpath = "//form[@class='woocommerce-form woocommerce-form-register register']")
    private WebElement regisForm;




    // constructor registration
    public Registration(){
        this.driver = DriverSingleton.getDriver();
        this.jse = DriverSingleton.getJse();
        this.windowHeight = DriverSingleton.getWindowHeight();
        PageFactory.initElements(driver, this);
    }

    // Registration
    public void regisData(String username, String password){
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
            jse.executeScript("window.scrollBy(0,550)");
            System.out.println("Scroll Down page by 550px");
        }


    }

}
