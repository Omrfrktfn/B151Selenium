package techproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //sayfadaki WebELemenleri gorunur olana kadar max 20 saniye bekler.Eger weElementler 2 saniye olusur ise
        //2 saniye bekler ve alt satira gecer.Fakat belirttigimiz max sure boyunca internetten yada sayfadan kaynakli olarak
        //WebElementler olusmazsa testimiz Fail verir.

        //techproed sayfasina gidelim
        String amazonUrl= "https://amazona.com";
        String techproUrl="https://techproeducation.com";

        driver.get(techproUrl);

        //amazona gidelim
        driver.get(amazonUrl);

        //tecpoed sayfasina geri donelim
        driver.navigate().back();

        //sayfa basliginin techpro icerdigini test edelim.
        String actualTitle = driver.getTitle();
        String expectedTitle = "techPro"; //aranan istene kelime

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED"+actualTitle);
        }


        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basilginin amazon icerdigini test edelim.
        if (driver.getTitle().contains("Amazon")){ //ikinci yapilis yolu
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.close();

    }
}
