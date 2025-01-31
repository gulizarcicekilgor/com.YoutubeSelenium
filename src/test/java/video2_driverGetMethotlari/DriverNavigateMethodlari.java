package video2_driverGetMethotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.navigate().to("url"); --> istenilen url'ye gider
        // driver.get("url"); --> ile aynı işlemi yapar ama forward ve back yapılmasına imkan tanır
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        // 2- driver.navigate().back(); --> bir önceki sayfaya donus yapar
        driver.navigate().back();

        // 3- driver.navigate().forward(); --> back() ile gelinen sayfaya dönüs yapacaktır
        driver.navigate().forward();

        // 4- driver.navigate().resfresh(); --> içinde olduğu sayfayı yeniler
        driver.navigate().refresh();

        // 5- driver oluşturulduğunda açılan sayfayı kapatmak istersek
        driver.close();

        // 6- driver çalışırken birden fazla tab veya window açtıysa tumunu kapatman için
        // driver.quit();


    }
}
