package com.utilities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserUtils  {

    public static  void   verifyTextMatches(String one,String two){
        Assert.assertEquals(one,two);

    }

    public static void verifyTextContains(String one, String two){
        Assert.assertTrue(one.contains(two));
    }
}
