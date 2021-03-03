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
        waitClickkable(by);//元素操作前等待
       return driver.findElement(by);
    }
    public WebElement findElement(By by,int timeout){
        if (timeout>0){//元素是否需要等待使用
            waitCickBle(timeout,by);
        }
        return driver.findElement(by);
    }
    public void waitCickBle(int timeout ,By by){
        //等待并检查元素可点击，性能影响比较小，可忽略
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitClickkable(By by){
        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(by));
    }
}
