package techproed.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutunu: "+driver.manage().window().getSize());

        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        //Thread.sleep(3000);

        //Techproeducation sayfasina gidelim
        driver.get("http://www.techproeducation.com");

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutunu: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);

        driver.close();

    }

}
