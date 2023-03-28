package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
       // WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //sayfa basligini konsole yazdiriniz

        System.out.println("sayfa basligi : " +driver.getTitle());

        //Sayfanın Url'ini yazdırınız
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sonra techproeducation sayfasına gidiniz
        driver.get("https://techproeducation.com");
        //techproeducation'in sayfa baslığı ve url'ini yazdırınız
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sayfanizin windowHandle degerini yazdiriniz.

        System.out.println(driver.getWindowHandle()); //sayfalar arasi gecis yaparken kullanilir..








    }
}
