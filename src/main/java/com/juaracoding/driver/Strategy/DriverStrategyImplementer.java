package com.juaracoding.driver.Strategy;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseImplementer(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
