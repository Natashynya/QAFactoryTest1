package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by faraon on 08.09.2015.
 */
public class AngelPage {

    public static String url = "http://oxogamestudio.com/passwd.current6.htm";
            //"http://angel.net/~nic/passwd.current.html"; original site

    public static void passw(String value) {
        TestHelper.drv.findElement(By.xpath("//input[@type='password']")).sendKeys(value);
    }

    public static void siteName(String value) {
        TestHelper.drv.findElement(By.xpath("//tr[2]/td/input")).sendKeys(value);
                // "//input[@name='site']")).sendKeys(value);
    }

    public static void clk() {

        TestHelper.drv.findElement(By.xpath("//input[@value='Generate']")).click();
    }

    public static String generate() {
        return TestHelper.drv.findElement(By.xpath("//tr[4]/td/input")).getAttribute("value");
    }

    public static void sendEnter() {
        TestHelper.drv.findElement(By.xpath("//tr[2]/td/input")).sendKeys(Keys.ENTER);
    }

    public static boolean getMasterName() {

        return TestHelper.drv.findElement(By.xpath("//input[@type='password']")).isEnabled();
    }

    public static boolean getSiteName ()
    {
        return TestHelper.drv.findElement(By.xpath("//tr[2]/td/input")).isEnabled();
    }

    public static String getMasterAtribute ()
    {
       return TestHelper.drv.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
    }

    public static boolean getGeneratePassword ()
    {
        return TestHelper.drv.findElement(By.xpath("//input[@type='password']]")).isEnabled();
    }

    public static String getPasswordFildName()
    {
        return TestHelper.drv.findElement(By.xpath("//tr/td[1]")).getText();
    }

}