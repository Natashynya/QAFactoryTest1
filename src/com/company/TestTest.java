package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/**
 * Created by faraon on 01.09.2015.
 */
public class TestTest {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe"); //ключ
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");
        System.out.println(driver1.getTitle());//title
       // slp(1);

        //select
        WebElement s=driver1.findElement(By.xpath("//select[@id='ts_type']"));
        Select sel= new Select(s);
        System.out.println(
                sel.getFirstSelectedOption().getText());
       //System.out.println(sel.getAllSelectedOptions().);

        sel.selectByVisibleText("мотоцикл или мотороллер");
        slp(1);

        List<WebElement> res= driver1.findElementsByXPath("//select[@id='ts_type']");
        for (WebElement w:res){
            System.out.println(w.getText());
        };

        System.out.println("************");

        WebElement s1=driver1.findElement(By.xpath("//*[@id='ts_details_type']"));
        Select sel1=new Select(s1);
        System.out.println(sel1.getFirstSelectedOption().getText());
        sel1.selectByVisibleText("объем двигателя более 300 см³");
        slp(2);

        sel1.selectByValue("a1");
        slp(5);

        sel1.selectByIndex(0);
        slp(2);



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
