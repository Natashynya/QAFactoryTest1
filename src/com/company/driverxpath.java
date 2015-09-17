package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

/**
 * Created by faraon on 13.08.2015.
 */
public class driverxpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); //ключ
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("http://angel.net/~nic/passwd.current.html");
        System.out.println(driver1.getTitle());//title
        WebElement j = driver1.findElementByXPath("//td/input[@name='master']");
        j.sendKeys("mypass");
        WebElement i=driver1.findElementByXPath("//td/input[@name='site']");
        i.sendKeys("mysite");
        i.sendKeys(Keys.ENTER);

        WebElement x=driver1.findElementByXPath("//td/input[@type='password']");
        System.out.println(x.getAttribute("value"));

        slp(3);
        driver1.quit();

    }



    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}