package DersCalisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IkiciOdev {
    public static void main(String[] args) throws InterruptedException{



 System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();



 driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

 driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

 driver.navigate().back();
        Thread.sleep(2000);

 driver.navigate().forward();
        Thread.sleep(2000);

driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();








    }
}
