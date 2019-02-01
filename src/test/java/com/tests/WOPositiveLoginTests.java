package com.tests;
import com.google.common.collect.HashBasedTable;
import com.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WOPositiveLoginTests extends TestBase {

     @Test
    public void test1(){
         //Go to website
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders");
         //verify the error
      // Enter username “Tester”
         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
         //Enter password “test”
         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
         //Click on Login button
         driver.findElement(By.id("ctl00_MainContent_login_button")).click();
         //Verify title equals “Web Orders”
          String exTitle =driver.getTitle();
          String acTilte="Web Orders";
         Assert.assertEquals(exTitle,acTilte);
         //Verify url equals
        String currentUEL= driver.getCurrentUrl();
        String actualURL="http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/";
         Assert.assertEquals(currentUEL,actualURL);
     }
     }

