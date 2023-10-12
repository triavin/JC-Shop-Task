package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.AddProduct;
import com.juaracoding.page.Login;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddProductTest {
    private WebDriver driver;
    private AddProduct addProduct;
    private Login login;
    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URLMYACCOUNT);
        DriverSingleton.delay(Constants.SORTDELAY);
        addProduct = new AddProduct();
        login = new Login();
    }

    @AfterClass
    public void finish(){
        DriverSingleton.delay(Constants.SORTDELAY);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void addProduct(){
        login.login(Constants.USERNAME,Constants.PASSWORD);

        addProduct.findProduct();
        addProduct.addToCart();
        System.out.println("Barang berhasil ditambahkan ke keranjang.");
    }
}
