package selenium.testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Page.App;

import java.util.concurrent.TimeUnit;

public class TestWeWork {
    public static String url="https://work.weixin.qq.com/";
    private WebDriver driver;
    //核心代码-驱动
    @Test
    public void TestStart(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
        //突破扫码
        driver.manage().addCookie(new Cookie("wwrtx.refid","40673232492722270"));
        driver.manage().addCookie(new Cookie("wwrtx.sid","HGbRYt3NPhPCJmUx43xqdVXz71qZm7iZ5gaJKVw4f70DfFAC-pynXWuBn1ksZbNi"));
        driver.navigate().refresh();

        App.driver=driver;//给App方法中的driver赋值
        App app=new App();//App类初始化
        String iPhone="1810000000";
        app.toMemberAdd().add(iPhone,iPhone,iPhone);//App类初始后调用toMemberAdd方法点击Add（“添加成员”进入新的Po）
    }
}
