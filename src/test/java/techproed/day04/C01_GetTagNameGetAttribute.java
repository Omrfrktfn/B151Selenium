package techproed.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetTagNameGetAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazon sayfasina gidin
        driver.get("http://www.amazon.com");

        //arama kutusunu locate ediiniz.
        WebElement searcBox = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
        searcBox.sendKeys("iphone");

        //aramaa kutusunun tagName'in input oldugnu test edin
        String actualTagName = searcBox.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED" + actualTagName);
        }

        //aramaa kutusunun nameAttribute'un degerinin "field-keywords" oldugnu test edin.
        String actualAttribute = searcBox.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if (actualAttribute.equals(expectedAttribute)) {
            System.out.println("Attribute Test : "+"Test PASSED");
        }else {
            System.out.println("Attribute Test : "+"Test FAILED" + expectedAttribute);
        }

        //sayfayi kapatin.
        driver.close();

    }
}
