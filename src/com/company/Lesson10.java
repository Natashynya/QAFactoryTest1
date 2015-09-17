package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by faraon on 03.09.2015.
 */
public class Lesson10 {

    @Test
    public void test1 ()
    {
        AngelPage.passw("masterPass");
        AngelPage.siteName("google.com");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
    }

     @Before
    public void abrakadanra()
     {
         TestHelper.setup(AngelPage.url);
     }


   @After
    public void close ()
    {
        TestHelper.quit();
    }

    @Test
    public void test2 ()   //http://oxogamestudio.com/passwd.current3.htm
    {
        AngelPage.passw("hello");
        AngelPage.siteName("google.com");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(true, AngelPage.getMasterName());
        System.out.println(AngelPage.getMasterName());
    }

    @Test
    public void test3 ()  ////http://oxogamestudio.com/passwd.current2.htm
    {
        AngelPage.passw("qwe123");
        AngelPage.siteName("gmail.com");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "mKJAakDvwbhi6@1a");
        Assert.assertEquals("qwe123",AngelPage.getMasterAtribute());
    }

    @Test
    public void test4 ()////http://oxogamestudio.com/passwd.current4.htm
    {
        AngelPage.passw("qwe123");
        AngelPage.siteName("gmail.com");
        AngelPage.sendEnter();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "mKJAakDvwbhi6@1a");
        Assert.assertEquals(true, AngelPage.getSiteName());
        Assert.assertEquals(true, AngelPage.getGeneratePassword());
    }

    @Test
    public void test5 ()//"http://oxogamestudio.com/passwd.current5.htm";
    {
        AngelPage.passw("");
        AngelPage.siteName("");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "BaefBs8/Z/cm2@1a");
        Assert.assertEquals("Your master password",AngelPage.getPasswordFildName());
    }

    @Test
    public void test51 () //http://oxogamestudio.com/passwd.current6.htm
    {
        AngelPage.passw(" ");
        AngelPage.siteName(" ");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "2YQR63Cwft+D6@1a");
    }

    @Test
    public void test6 ()
    {
        AngelPage.passw("333");
        AngelPage.siteName("111");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "CD/iUTsNwzV4v@1a");
    }

    @Test
    public void test7 ()
    {
        AngelPage.passw("111");
        AngelPage.siteName("333");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "A61tAOVfX4wCm@1a");
    }

    @Test
    public void test8 ()
    {
        AngelPage.passw("/%123&1245");
        AngelPage.siteName("/%123&1245");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "5nhhqLrpaRlaV@1a");
    }

    @Test
    public void test9 ()
    {
        AngelPage.passw("acd");
        AngelPage.siteName("ACD");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "NCblKUIrzgb2s@1a");
    }

    @Test
    public void test10 ()
    {
        AngelPage.passw("ACD");
        AngelPage.siteName("acd");
        AngelPage.clk();
        System.out.println(AngelPage.generate());
        Assert.assertEquals(AngelPage.generate(), "Re5z2/0b9O8go@1a");
    }



}



