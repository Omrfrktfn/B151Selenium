package techproed.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin]
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button'u gorunur");
        } else {
            System.out.println("Delete button'u gorunur degil");
        }

        //Delete butonuna basin
        Thread.sleep(2000);
        deleteButton.click();
        //  driver.findElement(By.cssSelector("button[class='added-manually']")).click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("Yazi gorunur");
        }else {
            System.out.println("Yazi gorunur degil");
        }

        //Sayfayı kapatın
        Thread.sleep(2000);
        driver.close();
    }
}
