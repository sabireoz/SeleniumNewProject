package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //amazon sayfasina gidelim.

        driver.get("https://amazon.com");
        //sonra techproeducationa gidelim
        driver.navigate().to("https://techproeducation.com");//get methodu ile ayni
        //techpro sayfa basligini konsole yazdiralim
        System.out.println("Sayfa Basligi:"+driver.getTitle());
        //tekrar amazon sayfasina geri donelim.
         driver.navigate().back();//ilk sayfaya geri doner
        //amazon sayfasinin basligini yazdiralim
        driver.navigate().back();
        Thread.sleep(3000);

        //tekrar techpro sayfasina geri gidelim.

        driver.navigate().forward();//geri donebilmek icin forward yapmaliyzi
//son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();
//Note:sayfalar arasi gecisler hizli olacagindan 3 saniye gecisler icin bekletelim
//Amazon sayfasinin baslligini yazdiralim
        System.out.println("driver.getTitle() = " + driver.getTitle());
//Tekrar techpro sayfasina geri gidelim
        driver.navigate().forward();
//Son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();
        driver.close();
// Not: Sayfalar arasi gecisler hizli olacagindan 3 sn gecisler icin bekletelim

    }

}
