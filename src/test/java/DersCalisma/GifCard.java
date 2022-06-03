package DersCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GifCard {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com.tr");

        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();

        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
        driver.findElement(By.xpath("//img[@alt='Under Armour Erkek Ayakkabıları']")).click();

        driver.navigate().refresh();
    }
}
