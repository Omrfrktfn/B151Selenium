package techproed.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        System.out.println("Amazon title: "+driver.getTitle());
        System.out.println("Amzazon Actual Url: "+driver.getCurrentUrl());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("http://techproeducation.com");

        System.out.println("techpro title: "+driver.getTitle());//en son gittigi sayfanin basligini consol'da verir.
        System.out.println("Techproed Actual Url: "+driver.getCurrentUrl());
        //System.out.println("Techpro window handle degeri: "+driver.getWindowHandle());
        //System.out.println("Techpro kaynak kodlari: "+driver.getPageSource());
    }
}
/*
*System.out.println(driver.getTitle()); bu sekilde sayfa baslik isimlerini aliriz.
*driver.getCurrentUrl(); icinde bulundugu sayfanin url'sni getirir. -->
*driver.getPageSource() :icinde olunana sayfanin kaynak kodlarini String olarak getirir.
*driver.getWindowHandle(); = gidilen sayfanin handle degerini verir. Bu handle degerini safalar arasi gecis icin kullaniriz.


 */
