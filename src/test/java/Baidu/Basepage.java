package Baidu;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {

    public static WebDriver driver;
    @BeforeAll
    public WebDriver Chrome_drive(String url) {
//        谷歌驱动需要设置谷歌的驱动的路径
        System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
//        driver.findElement(By.className("username")).sendKeys("root");
//        driver.findElement(By.className("pwd")).sendKeys("kb123456");
//        driver.findElement(By.id("btn")).click();
        return driver;
//         狐火浏览器不需要设置驱动路径
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://www.baidu.com");
//        driver.close();

    }


}
