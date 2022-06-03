package DersCalisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.time.Duration;

public class IlkOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";


        if (actualTitle.contains(arananKelime)) {
            System.out.println("test is passed");
        } else {
            System.out.println("Title" + arananKelime + "içermiyor test is failed");
        }


        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "Amazon";

        if (actualUrl.contains(arananUrl)) {
            System.out.println("test is passed");
        } else {
            System.out.println("test failed");

            System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        }
    }
}