package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by faraon on 17.09.2015.
 */
public class AnyWayAnyDay {

     public static ChromeDriver drv;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
        drv = new ChromeDriver();
        drv.get("https://www.anywayanyday.com/");
        System.out.println(drv.getTitle());//title
        //  WebElement lang=driver1.findElement(By.xpath("//span[@class='b-menu-item-button-text--title j-current_culture']"));
        //System.out.println(lang.getText());
        setlanguage("English");

        slp(2);

        drv.quit();

    }

        public static void setlanguage (String language)
    {
        drv.findElement(By.xpath("//span[@class='b-menu-item-button-text--title j-current_culture']")).click();
        drv.findElement(By.xpath("//span[text()='" + language +"']")).click();

    }


    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}