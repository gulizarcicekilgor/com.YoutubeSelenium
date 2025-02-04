package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://www.facebook.com sayfasına gidin
        driver.get("http://www.facebook.com");
        //cookies çıkarsa kabul et butonuna basın
        // eposta kutusuna rastgele bir mail yaz
        WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));
        emailbox.sendKeys("ikşlisinksdsk");
        // random password gir
        WebElement passwordBox = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
        passwordBox.sendKeys("dfdfdmfkkf");
        // login butonuna tıkla
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();

        WebElement resultText = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String ExpectedResult = "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String ActualResult = resultText.getText();
        if (ActualResult.equals(ExpectedResult)){
            System.out.println("Failed to Enter Test passed");
        }
        else {
            System.out.println("Failed to Enter Test failed");
        }
    }
}
