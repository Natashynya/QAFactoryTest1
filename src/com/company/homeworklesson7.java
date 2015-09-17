package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Litvinenko.NV on 18.08.2015.
 */
public class homeworklesson7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe"); //ключ
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://stage.tether.to");
        System.out.println(driver1.getTitle());//title
        //3.Нажать на ссьілку Request access.
        WebElement j = driver1.findElementByXPath("//a[text()='Request access']");
        j.sendKeys(Keys.ENTER);
        slp(1);
        //4.Напечатать в консоль заголовок единственного поля для ввода на открьівшейся странице.
        WebElement x=driver1.findElementByXPath("//label[text()='Email address']");
        System.out.println(x.getText());
       // slp(1);
        //5.Нажать на ссьілку Already have an invite code?
        WebElement y=driver1.findElementByXPath("//a[text()='Already have an invite code?']");
        y.sendKeys(Keys.ENTER);
        slp(1);
       //6. Напечатать в консоль заголовки всех полей кроме вьібора страньі.

        WebElement z1=driver1.findElementByXPath("//label[text()='Invite Code']");
        System.out.println(z1.getText());

        WebElement z2=driver1.findElementByXPath("//label[text()='First Name']");
        System.out.println(z2.getText());

        WebElement z3=driver1.findElementByXPath("//label[text()='Last Name']");
        System.out.println(z3.getText());

        WebElement z4=driver1.findElementByXPath("//label[text()='Email Address']");
        System.out.println(z4.getText());

        WebElement z5=driver1.findElementByXPath("//label[text()='Username']");
        System.out.println(z5.getText());

        WebElement z6=driver1.findElementByXPath("//label[text()='Password']");
        System.out.println(z6.getText());

        WebElement z7=driver1.findElementByXPath("//label[text()='Confirm Password']");
        System.out.println(z7.getText());

        System.out.println("***");

        //slp(1);
        //List<WebElement> d=driver1.findElementsByXPath("//md-input-container/label"); -получить все заголовки
      //7. Заполнить первьіе 3 поля.
        WebElement z11=driver1.findElementByXPath("//input[@name='inviteCode']");
        z11.sendKeys("123");
        WebElement z22=driver1.findElementByXPath("//input[@name='firstname']");
        z22.sendKeys("Nataliia");
        WebElement z33=driver1.findElementByXPath("//input[@name='lastname']");
        z33.sendKeys("Litvinenko");

        slp(5);
        //8. Напечатать в консоль ошибку которая появилась возле первого поля.
        WebElement err=driver1.findElementByXPath("//md-input-container[1]//*[@class='ng-scope']");
        System.out.println(err.getText());
        // slp(1);

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