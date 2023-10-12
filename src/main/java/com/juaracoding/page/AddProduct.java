package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProduct {
    private WebDriver driver;
    private JavascriptExecutor jse;
    private int windowHeight;
    @FindBy(xpath = "//li[normalize-space()='The password field is empty.']")
    private WebElement passRequired;
    @FindBy(xpath = "//li[normalize-space()='Username is required.']")
    private WebElement userRequired;
    @FindBy(xpath = "//li[normalize-space()=': The username or password you entered is incorrect. Lost your password?']")
    private WebElement txtInvalid;
    @FindBy(xpath = "//a[normalize-space()='Black Cross Back Maxi Dress']")
    private WebElement targetProduct;

//    @FindBy(xpath = "//contains(text(),': The username or password you entered is incorrect. Lost your password?')")
//    private WebElement txtInvalid;
    //div[@id='primary']//li[1]




    // constructor AddProduct
    public AddProduct(){
        this.driver = DriverSingleton.getDriver();
        this.jse = DriverSingleton.getJse();
        this.windowHeight = DriverSingleton.getWindowHeight();
        PageFactory.initElements(driver, this);
    }

    public void findProduct(){
//        Select pilihWarna = new Select(driver.findElement(By.id("oldSelectMenu")));
//
//        // click element
//        pilihWarna.selectByValue("4");
//        pilihWarna.selectByVisibleText("Blue");
//        pilihWarna.selectByValue("8");
//        pilihWarna.selectByVisibleText("Red");
        driver.get(Constants.URLHOMEPAGE);

        System.out.println(windowHeight);
//        System.out.println(driver.manage().window().getSize());

        if (windowHeight > 1382){
            jse.executeScript("window.scrollBy(0,1500)");
            System.out.println("Scroll Down page by 1500px");
        } else {
            jse.executeScript("window.scrollBy(0,2000)");
            System.out.println("Scroll Down page by 2000px");
        }

    }

    public void addToCart(){
        targetProduct.click();
    }


}
