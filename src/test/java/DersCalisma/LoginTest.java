package DersCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki= driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        WebElement mailBox=driver.findElement(By.id("session_email"));
        WebElement passwordBox=driver.findElement(By.name("session[password]"));
        WebElement signin=driver.findElement(By.name("commit"));

        mailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
        signin.click();


        WebElement actualKullaniciAdiElementi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());




    }
}
