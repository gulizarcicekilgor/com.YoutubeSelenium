package video2_driverGetMethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethotlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.get("url"); -->yazdığımız url'ye gider
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle(); --> içinde olduğu sayfanın başlığını döndürür.
        System.out.println("sayfa title : " + driver.getTitle()); //

        // 3- driver.getCurrentUrl(); --> içinde olduğu sayfanın urlsini döndürür
        System.out.println(driver.getCurrentUrl());

        // 4- driver.getPageSource(); --> içinde olduğu sayfanın kaynak kodları döndürür
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(driver.getPageSource());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 5- driver.getWindowHandle(); --> içinde olduğu sayfanın unique hash kodunu döndürür
        System.out.println(driver.getWindowHandle());

        // 6- driver.getWindowHandles(); --> dirver çalışırken açılan tüm sayfaların unique hash kodunu döndürür


    }
}
