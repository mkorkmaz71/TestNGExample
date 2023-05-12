package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
    LoginFeatures loginFeature=new LoginFeatures();
    @Test(dataProvider = "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials(String username, String password){
        boolean result= loginFeature.doLogin(username,password);
        Assert.assertEquals(result, false);
    }
    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData(){
        String[][]credentials={
                {"admin","admin@111"},
                {"admin123","admin@123"},
                {"admin","admin@122"},
                {"adminwednesday3","admin1@123"},
                {"Admin","admin123"},
                {"Chirag","admin@123"},
                {"",""},
                {"","admin123"},
        };
        return credentials;
    }
    @Test
    public void verifyLoginSuccessfulWithValidCredentials(){
        String username="admin", password="admin@123";
        boolean result= loginFeature.doLogin(username,password);
        Assert.assertEquals(result, true);
    }
}
