package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by faraon on 05.08.2015.
 */
public class drivers {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe"); //ключ
        WebDriver driver1 = new ChromeDriver(); //WebDriver
        driver1.get("https://stage.tether.to");
       // Assert.assertEquals("Google",driver1.getTitle());
        //System.out.println(driver1.getTitle());//google
        WebElement j = driver1.findElement(By.name("q"));//poisk imeni peremnnoj polja koncoli vvoga v goggle  findElement(By.name())
        j.sendKeys("cats");
        j.sendKeys(Keys.ENTER); //push button Enter



//
     //   String  xpath="//input[@value='Generated' and not(@disabled)]";
     //   int i;
     //   for (int i1=0; i1<600; i1++){
       //     if (driver1.findElements(By.xpath(xpath)).size()>0){
       //     break;}
      //      slp(100);
      //  }
      //  if (i1>=600){
       //     System.out.println("Test FAILED"+ xpath +"not found");
       //     throw new Exception("Element" + xpath + "not found");
       //     driver1.findElement(By.xpath(xpath));
       // }


       // slp(2);
        //driver1.findElementByName("btnG").click(); //push button on code
        //Thread.sleep(2000);//vremya zaderjki 2 sek
     //   slp(2);//zaderjka

     //   WebElement d=driver1.findElement(By.className("srg")); //poisk klassa   findElement(By.className())
       //List<WebElement> res= driver1.findElementsByTagName("a"); //ssilki na stranice
     //   List<WebElement> res = d.findElements(By.tagName("a")); //poisk element vnytri klassa po imeni zadannoj peremennoj
     //   System.out.println(res.get(0).getText()); //poychit' pervuij rezyl'tat - oisk po indeksy (0)
      //  WebElement res1=res.get(0);//poisk pervoj ssilki i predacha ee v peremennyy
      //  res1.click();//click
       // slp(1);//zaderjka
       // System.out.println(driver1.getTitle());//polychaem title
       // driver1.navigate().back();//vozvrawaemsja nazad

     //  for (WebElement w:res){
     //      System.out.println(w.getText());//polychaem tekst i pechataem v cukle
     //  }


      //  slp(1);
       driver1.quit(); //zakrit' browser
   // }


    //public static void slp(long msec) {
      //  try {
      //      Thread.sleep(msec);
     //   } catch (InterruptedException e) {
     //       e.printStackTrace();
     //   }
  }



}
