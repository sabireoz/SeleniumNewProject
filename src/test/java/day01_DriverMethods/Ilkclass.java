package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Ilkclass {


    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");


     System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//system.setProperty java uygulamalarinda sistem ozelliklerini ayarlamak icin kullanilir.
        //bu method ile clasimiza webdriver in fiziki yerini belirtiriz.
        //key, value olarak once isim sonra driverimizin yolunu belirtiriz.
       // WebDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));//bu code ile options yapiypriz

        driver.get("https://techproeducation.com");//get()methodu ile adresini belirttigimiz sayfaya gideriz...


       // System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
//System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
//Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
//Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz
       // System.out.println(System.getProperty("edgeDriver"));
//getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim


      //  System.out.println("sayfa basligi= +driver.getTitle()");  //icinde bulundugumuz sayfanin basligini verir.

       // System.out.println("Sayfa Url'i="+driver.getCurrentUrl());

        System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
        System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
        //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kodlarını verir


    }
}
