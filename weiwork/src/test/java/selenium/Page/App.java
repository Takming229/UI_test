package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//企业微信首页及功能入口
public class App {
    public static WebDriver driver;
    public ContactPage toContact(){
        //进入通讯录入口
        return new ContactPage();
    }
    public ContactPage toMemberAdd(){
        //进入添加成员入口
        driver.findElement(By.linkText("添加成员")).click();
        return new ContactPage();
    }
}
