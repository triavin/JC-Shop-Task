package com.juaracoding.driver.Strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{

    @Override
    public WebDriver setStrategy(){
        // add path chrome driver
        String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\chromedriver.exe";
        // set property
        System.setProperty("webdriver.chrome.driver",path);
        // add new object option
        ChromeOptions options = new ChromeOptions();
        // set driver option
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        return new ChromeDriver(options);
    }
}
