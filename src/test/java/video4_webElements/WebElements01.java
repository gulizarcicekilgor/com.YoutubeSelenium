package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");

        // 2- arama cubuğuna "nutella" yazın
        WebElement aramakutusu = driver.findElement((By.xpath("//input[@id='twotabsearchtextbox']")));
        aramakutusu.sendKeys("Nutella");


        // 3- nutella yazdıktan sonra enter a basarak arama işlemini yapın
        aramakutusu.submit();
        // 4- bulunan sonuç sayfasını yazdırın

        WebElement resultTextElement = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        System.out.println(resultTextElement.getText());
        //1-48 of 138 results for "Nutella" terminalde gördük

        driver.close();




    }
}
