package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WONegativeLoginTests extends TestBase {
    @Test
    public void test1(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/");
        //Save the current url
         String currentURL=driver.getCurrentUrl();
        //Enter username “Test”
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Test");
        //Enter password “Test”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Test");
        //Click on Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //Verify title still equals “Web Orders Login”
        String currentTitle=driver.getTitle();
       Assert.assertTrue(currentTitle.contains("Web Orders Login"));
       //Verify the current url equals the string saved in step 4
         String lastURL=driver.getCurrentUrl();
       Assert.assertEquals(currentURL,lastURL);

    }
    //Negative Login Test Wrong Password
    @Test
    public void wrongTestPWD(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/");
        //3. Verify title equals “Web Orders Login”
     String beforeTitle=driver.getTitle();
        //4. Save the current url
        String beforeURL=driver.getCurrentUrl();
        //5. Enter username “Tester”
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //6. Enter password “Tester”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("Tester");
        //7. Click on Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //8. Verify title still equals “Web Orders Login”
        String afterTitle=driver.getTitle();
        Assert.assertEquals(beforeTitle,afterTitle);
        //9. Verify the current url equals the string saved in step 4
        String afterURL=driver.getCurrentUrl();
        Assert.assertEquals(beforeURL,afterURL);
    }
    //Negative Login Test Blank Username
    @Test
    public void testBlankUserName(){
        //1. Open browser
       // 2. Go to website
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/l
        //ogin.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/");
        //3. Verify title equals “Web Orders Login”
        String beforeTitle=driver.getTitle();
        //4. Save the current url
        String beforeURL=driver.getCurrentUrl();
        //5. Enter password “test”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //6. Click on Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //7. Verify title still equals “Web Orders Login”
        String afterTitle=driver.getTitle();
        Assert.assertEquals(beforeTitle,afterTitle);
        //8. Verify the current url equals the string saved in step 4
       String afterURL=driver.getCurrentUrl();
       Assert.assertEquals(beforeURL,afterURL);
    }
    //Negative Login Test Blank Password
    @Test
    public void testBlankPWD(){
         // 1. Open browser
         // 2. Go to website
        // http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/l
        // ogin.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/");
         // 3. Verify title equals “Web Orders Login”
        String beforeTitle=driver.getTitle();
        // 4. Save the current url
        String beforeURL=driver.getCurrentUrl();
        // 5. Enter username “Tester”
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
       // 6. Click on Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        // 7. Verify title still equals “Web Orders Login”
        String afterTitle=driver.getTitle();
        Assert.assertEquals(beforeTitle,afterTitle);
       // 8. Verify the current url equals the string saved in step 4
        String afterURL=driver.getCurrentUrl();
        Assert.assertEquals(beforeURL,afterURL);

    }


}
