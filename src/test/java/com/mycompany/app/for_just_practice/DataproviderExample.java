package com.mycompany.app.for_just_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
    @DataProvider(name="loginDataProvider")
    public Object[][] getData(){
        Object [][] data={
                {"axample@email.com", "Asd123"},{"qwe@email.com","Asdfghj123"},{"qaz@frem.com","Qaz123"}
        };
        return data;
    }
    @Test(dataProvider = "loginDataProvider")
    public void loginTest(String email, String pass){
        System.out.println(email+  "    "+pass);
    }
}
