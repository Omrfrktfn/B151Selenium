package techproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {

    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.get("https://amazon.com ");

        //sayfa basliginin amazon icerdgini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //url'in https://www.amazon.com oldugunu tes edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED -->"+actualUrl);
        }

        //sayfayi kapatalim
        driver.close();//browser'i kapatir
       // driver.quit();// tum sayfalari kapatir.


    }

}
