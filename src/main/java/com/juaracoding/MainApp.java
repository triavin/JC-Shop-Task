package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    private static WebDriver driver;
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();



    }
}
