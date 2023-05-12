package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    WebDriver driver;

    public  void setUpMethod() throws MalformedURLException {
        driver=getCloudDriver();
        driver=getLocalDriver();
        driver.get("https://www.amazon.com");
    }
    public WebDriver getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-WBAXH");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-mustafakorkmaz71-8ecd4:98eaa9fb-b995-49c0-8c2d-b68480149ac6@ondemand.us-west-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }
    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    @AfterMethod
    public void cleanUpMethod() {
        driver=new ChromeDriver();
        driver.quit();
    }
}
