package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {


    public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        //
        System.out.println("sayfa konumu="+ driver.manage().window().getPosition());
        System.out.println("Sayfa boyutlari =" + driver.manage().window().getSize());
        driver.manage().window().maximize();//acilan browseri maximize yapar

        driver.get("https://techproeducation.com");

        System.out.println("Sayfa konumu =" + driver.manage().window().getPosition());
        System.out.println("Sayfa boyutlari =" + driver.manage().window().getSize());

        driver.manage().window().minimize();//sayfayı aşağıya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50));//istedigin konuma getir
        driver.manage().window().setSize(new Dimension(600, 600));//istedigimiz size getirir.




    }


    }



