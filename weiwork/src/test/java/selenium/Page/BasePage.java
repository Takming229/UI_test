package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//基础类，让所有类都继承这个类
public class BasePage {
    public static WebDriver driver;
    public WebElement findElement(By by){
       return driver.findElement(by);
    }
    public void waitCickBle(int timeout ,By by){
        //等待并检查元素，性能影响比较小，可忽略
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(by));
    }
}
