package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.Registration;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    private static WebDriver driver;
    private static Registration registration;
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();
        registration = new Registration();

        driver.get(Constants.URLMYACCOUNT);

        DriverSingleton.delay(Constants.SORTDELAY);

        registration.findForm();
        registration.regis(Constants.USERNAME, Constants.PASSWORD, Constants.EMAIL);

        DriverSingleton.delay(Constants.SORTDELAY);

        // DriverSingleton.closeObjectInstance();

    }
}
