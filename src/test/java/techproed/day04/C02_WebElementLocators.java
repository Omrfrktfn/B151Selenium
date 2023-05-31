package techproed.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("http://amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        WebElement searcBox = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
        searcBox.sendKeys("city bike" + Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisi = sonucYazilari.get(0);//listelerde index sifirdan baslar ilk sonucu istedigim icin sifir yazdik
        //  System.out.println(sonucYazisi);
        System.out.println(sonucYazisi.getText());

        // sonuc sayısını yazdırın
        String sonucSayisi[] = sonucYazisi.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));
        System.out.println(sonucSayisi[2]);//2.index'te bulunan sayiyi aldik

        // ilk ürünün locatini alın
        List<WebElement> ilkUrun = driver.findElements(By.className("s-image"));
        WebElement ilkUrunSonuc = ilkUrun.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrunSonuc.isDisplayed());

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrunSonuc.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrunSonuc.isSelected());

        // ilk urune tıklayın
        ilkUrunSonuc.click();
        Thread.sleep(2000);

        // sayfayı kapatın
        driver.close();
    }
}
