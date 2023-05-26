package techproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        //drivers'taki package icinden exe dosyasini yolu kopyaladi.
        //Java uygulamalarinda system ozelliklerini ayarlamak icin setProperty ile kullaniriz.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile key degerini girerek value'ya ulasilir.

        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");//String olarak girilen url'e gider.

    }

}
/*
.setProperty("") methodu key ve deger ister. Driver yolu gostermek icin kullanilir.
setProperty methodu ile class'imiza driver'in fiziki yolunu belirtiriz.


 */
