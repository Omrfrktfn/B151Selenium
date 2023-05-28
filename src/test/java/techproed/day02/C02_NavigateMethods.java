package techproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);//java kodlarini bekletmek icin kullanilir.

        //amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //amazon sayfasinin basilgini yazdiralim
        System.out.println("Amazon sayfa basligi: " +driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasine geri donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //sayfa basligin yazdiralim
        System.out.println("Techproeducation sayfa basligi: "+driver.getTitle());
        Thread.sleep(3000);

        //amazan sayfasina tekrar gidip url'i yazdiralim
        driver.navigate().forward();
        System.out.println("Amazon url  :"+driver.getCurrentUrl());
        Thread.sleep(3000);

        //amazon sayfasini yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();

    }

}
