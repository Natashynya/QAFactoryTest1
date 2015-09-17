package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by faraon on 08.09.2015.
 */
public class TestHelper {

    public static ChromeDriver drv;


    public static void setup ()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        drv = new ChromeDriver();
    }

    public static void setup (String abs)
    {
        setup();
        drv.get(abs);
    }

    public static void get (String url)

    {
        drv.get(url);
    }

    public static void quit ()
    {
        drv.quit();
    }


    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
