package com.automation.testcases;


import org.testng.annotations.Test;

public class SearchFunctionalityTest extends BaseTest{
    @Test(groups = {"Smoke Test","Mustafa Test"})
    public  void  verifySearchResultsAreDisplayed(){
        System.out.println("verify search result");
    }
    @Test(groups = "Mustafa Test")
    public  void  verifyMessageWhenThereAreNoResult(){
        System.out.println("verify no result message");
    }
    @Test(groups= "Smoke Test")
    public  void  verifySearchResultHasSearchKeyword(){
        System.out.println("verify search result has search keyword");
    }
}
