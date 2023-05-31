package techproed.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");
        Thread.sleep(2000);

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi: "+linkler.size());

        // Linkleri konsolda yazdırın
        for (WebElement element : linkler){
            System.out.println(element.getText());
        }


        //lambda ile
      //  linkler.forEach(link -> {if (!link.getText().isEmpty())
      //  {System.out.println(link.getText());}});

        // sayfayı kapatın
        Thread.sleep(2000);
        driver.close();


    }
}
