package video2_driverGetMethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- driver.manage().window() methodları
        // 1-A driver.manage().window().getSize() --> içinde olduğu sayfanın pixel olarak olçülerini döndürür
        System.out.println(driver.manage().window().getSize());
        //System.out.println(driver.manage().window().getSize().height);

        // 1-B driver.manage().window().getPosition(); --> içinde olduğu sayfanın pixel olarak konumunu döndürür
        System.out.println(driver.manage().window().getPosition());

        // 1-C --> içinde olduğu sayfanın sol alt köşesini bizim yazacağımız pixel noktasına taşır
        driver.manage().window().setPosition(new Point(12,12));

        // 1-D --> içinde olduğu sayfanın sol alt köşesi sabit olarak bizim yazacağımız ölçülere taşır
        driver.manage().window().setSize(new Dimension(900,600));

        //konumunu ve boyutunu yeniledikten sonra tekrar yazdırırsak
        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize());
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition());

        // 1-E içinde olduğu sayfayı maximize yapar
        driver.manage().window().maximize();
        System.out.println("maximize konum: " + driver.manage().window().getPosition());
        System.out.println("maximize boyut: " + driver.manage().window().getSize());

        // 1-F içinde olduğu sayfayı fullscreen yapar
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut: " + driver.manage().window().getSize());


        // 1-G sayfayı simge durumunda küçültur  yapar
        driver.manage().window().minimize();
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut: " + driver.manage().window().getSize());


        // 2- driver.manage().timeouts() Methodlari
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /* implicitlyWait : driver'a sayfanın yüklenmesi ve kullanacağımız webelementlerin bulunması için bekleyeceğimiz
                            maximumu süreyi belirtir.
                            Driver bu süre içerisinde sayfa yüklenit/webElement bulunursa beklemeden çalışmaya devam eder.                          durdurur.
                            bu süre bittiği halde sayfa yüklenmemiş/webElement bulunamamıssa exception vererek çalışmayı
                            durdurur.
           Duration.ofSeconds(15) : Duration Clası selenium 4ile gelen zaman class'ıdır.
                                    Yani driver'a ne kadar bekleyeceğini söyler.
                                    Duration.ofSeconds(15) yerine milis, minutes, hours da kullanılabilir.

         */


    }
}
