package selenium.testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Page.App;

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
        driver.manage().addCookie(new Cookie("wwrtx.refid","40673232492722270"));
        driver.manage().addCookie(new Cookie("wwrtx.sid","HGbRYt3NPhPCJmUx43xqdUeCGPn3n65C41MjYS5DQ-naP2-DGOYS4wt6thUOg1O0"));
        driver.navigate().refresh();

        App.driver=driver;
        App app=new App();
        app.toMemberAdd().add();
    }
}
