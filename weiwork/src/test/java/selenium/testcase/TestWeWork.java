package selenium.testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeWork {
    public static String url="https://work.weixin.qq.com/";
    private WebDriver driver;
    //核心代码-驱动
    @Test
    public void TestStart(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
    }
}
