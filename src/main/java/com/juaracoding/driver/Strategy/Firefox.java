package com.juaracoding.driver.Strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy{

    @Override
    public WebDriver setStrategy(){
        // add path gecko driver
        String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\geckodriver.exe";
        // set property
        System.setProperty("webdriver.gecko.driver",path);
        // add Firefox driver
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
