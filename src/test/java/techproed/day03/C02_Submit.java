package techproed.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");
        Thread.sleep(2000);

        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Headphones");
        searchBox.submit();

        //second way
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones"+ Keys.ENTER);

        // sayfayı kapatınız
        Thread.sleep(2000);
        driver.close();

    }
}
