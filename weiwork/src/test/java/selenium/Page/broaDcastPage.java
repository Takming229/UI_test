package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class broaDcastPage extends BasePage {
    public broaDcastPage send(String user,String title,String body,String summary,String author){
        findElement(By.linkText("选择需要发消息的应用")).click();
        findElement(By.cssSelector(".ww_icon_AppNotice")).click();
        findElement(By.linkText("确定")).click();
        findElement(By.linkText("选择发送范围")).click();
        findElement(By.id("memberSearchInput")).sendKeys(user);
        findElement(By.cssSelector(".ww_searchResult_title_peopleName")).click();
        findElement(By.linkText("确认")).click();
        findElement(By.cssSelector(".ww_editorTitle")).sendKeys(title);

        driver.switchTo().frame(0);//切换进framBody
        findElement(By.cssSelector(".msg_noticeEditor_frameBody")).sendKeys(body);
       // String[] window= (String[]) driver.getWindowHandles().toArray();
       // driver.switchTo().window(window[0]);//退出frameBody
        driver.switchTo().parentFrame();//frame切换回来
        ((JavascriptExecutor)(driver)).executeScript("window.scroll(0,800)");
        findElement(By.cssSelector(".msg_edit_infoItem_textWord")).click();
        findElement(By.cssSelector(".qui_textarea")).sendKeys(summary);
        findElement(By.cssSelector(".js_amrd_sendName")).sendKeys(author);
        ((JavascriptExecutor)(driver)).executeScript("window.scroll(0,1000)");
        findElement(By.linkText("发送")).click();
        findElement(By.linkText("确定")).click();
        return this;
    }
}
