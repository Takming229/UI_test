package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//企业微信首页的功能入口
public class App extends BasePage {

    //1、定义一个类变量driver（这个类的变量还没有赋值之前是空的）
    //2、TestWeWork.TestStart方法中赋值给driver变量


    public App loingwithcookie(){
        String url="https://work.weixin.qq.com/";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
        //突破扫码
        driver.manage().addCookie(new Cookie("wwrtx.refid","40673232492722270"));
        driver.manage().addCookie(new Cookie("wwrtx.sid","HGbRYt3NPhPCJmUx43xqdVXz71qZm7iZ5gaJKVw4f70DfFAC-pynXWuBn1ksZbNi"));
        driver.navigate().refresh();
        return this;
    }
    public ContactPage toContact(){
        //进入通讯录入口
        return new ContactPage();
    }
    public ContactPage toMemberAdd(){
        //进入添加成员入口
        findElement(By.linkText("添加成员")).click();
        return new ContactPage();
    }
}
