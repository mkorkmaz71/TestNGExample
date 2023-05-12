package com.automation.testcases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

        @Test(groups = {"Smoke Test","Chirag Test"})
        @Parameters("browser")
        public void verifyUserCanLogin(String browser) {
            System.out.println("Opening browser"+browser);
        }

        @Test(groups = "Chirag Test")
        public void verifyUserCanNotLoginWithInvalidCredentials() {
            System.out.println("verify login unsuccessful for invalid credentials");
        }

        @Test(groups = "Smoke Test")
        public void verifyUserCanResetPassword() {
            System.out.println("verify user can reset password");
        }
}
