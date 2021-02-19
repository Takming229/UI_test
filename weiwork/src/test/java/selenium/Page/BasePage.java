package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//基础类，让所有类都继承这个类
public class BasePage {
    public static WebDriver driver;
    public WebElement findElement(By by){
       return driver.findElement(by);
    }
}
