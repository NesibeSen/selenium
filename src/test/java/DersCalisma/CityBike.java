package DersCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CityBike {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://amazon.com");

        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("city bike"+ Keys.ENTER);
        driver.close();


    }
}
