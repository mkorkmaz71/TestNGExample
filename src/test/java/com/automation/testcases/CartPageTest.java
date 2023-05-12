package com.automation.testcases;


import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test(groups = {"Smoke Test","Aidai Test"})
    public  void  verifyUserCanAddProductToCart(){
        System.out.println("verify user can add item");
    }
    @Test (groups = "Aidai Test")
    public  void  verifyUserCanRemoveProductFromCart(){
        System.out.println("verify user can remove item");
    }
    @Test(groups = {"Smoke Test"})
    public  void  verifyUserCanChangeQuantityOfItem(){
        System.out.println("verify user can change quantity of item");
    }
}
