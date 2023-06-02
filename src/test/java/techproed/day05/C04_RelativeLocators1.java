package techproed.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C04_RelativeLocators1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazon sayfasına gidelim
        driver.get("http://amazon.com");


        //city bike aratalım
        WebElement serachBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        serachBox.sendKeys("city bike" + Keys.ENTER);


        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());

        System.out.println("****************************************");
        //bikes altindaki tum linkleri yazdiriniz.
        List<WebElement> listLinkler = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
        //lambda ile
        listLinkler.forEach(t -> System.out.println(t.getText()));
        System.out.println("**********************************");
         /*
            XPATH kullaniminda bir sayfadaki webelementlere mudehala etmek istedigimizda xpath ile locate aldigimizda birden fazla sonuc
        verebilir. [position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz webelementleri secip mudehale edebiliriz.
         */
        //foreach ile
        for (WebElement w : listLinkler) {
            System.out.println(w.getText());
        }

        //bu linklerin hepsini tikliyalim ve sayfa basliklarini alalim
        System.out.println("******************************");
        for (int i = 0; i < listLinkler.size(); i++) {
            listLinkler = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(listLinkler.get(i).getText());
            listLinkler.get(i).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }


        //  completeBike.click();


    }
}
