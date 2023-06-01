package techproed.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("city bike" + Keys.ENTER);
        Thread.sleep(2000);

        // Hybrid Bikes bölümüne tıklayın
        WebElement searchBox1 = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        //not text ile islem yaptigimiz da @ yapmiyoruz.
        searchBox1.click();


        // sonuc sayısını yazdırın
        WebElement resultNumber = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println("Sonuc yazisi: "+resultNumber.getText());
        Thread.sleep(1000);
        String sonucSayisi[] = resultNumber.getText().split(" ");
       // System.out.println(Arrays.toString(sonucSayisi));
        System.out.println("Sonuc Sayisi: "+sonucSayisi[0]);//2.index'te bulunan sayiyi aldik


        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        //(//span[@class='a-size-medium a-color-base a-text-normal'])[1] bu sekilde uniq hale getirebiliriz.
        Thread.sleep(1000);

        //Sayfayı kapatınız
        driver.close();

    }
}
