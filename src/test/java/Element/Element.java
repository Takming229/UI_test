package Element;

import Baidu.Cabben_URL;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//元素定位、操作
public class Element {
    public String user="username";
    public String pwd="pwd";
    public String btn="btn";
    public String users="root";
    public String pwds ="kb123456";
    @Test
public void login(){
    Cabben_URL Ele=new Cabben_URL();
    WebDriver login = Ele.login();
        login.findElement(By.className(user)).sendKeys(users);
        login.findElement(By.className(pwd)).sendKeys(pwds);
        login.findElement(By.id(btn)).click();
    }
}
