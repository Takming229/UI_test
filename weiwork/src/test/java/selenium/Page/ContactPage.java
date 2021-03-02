package selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ContactPage extends BasePage{
    //添加功能
    public ContactPage add(String username, String acct, String iPhone){
        findElement(By.id("memberSearchInput")).clear();
        findElement(By.name("username")).sendKeys(username);
        findElement(By.name("acctid")).sendKeys(acct);
        findElement(By.name("mobile")).sendKeys(iPhone);
        findElement(By.linkText("保存")).click();
        return this;
    }

    public ContactPage delete(String keywor){
        findElement(By.id("memberSearchInput")).clear();
        findElement(By.id("memberSearchInput")).sendKeys(keywor);
        try{
            findElement(By.xpath("//span[contains(.,'"+ keywor +"')]")).click();//点击搜索出的成员
            //等待并检查元素，性能影响比较小，可忽略
            waitCickBle(10,By.linkText("编辑"));//Basepage类已封装
        }catch (Exception e){//假设成员不存在则打印e
            System.out.println("没找元素");

        };
        //new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.linkText("删除")));
        findElement(By.linkText("删除")).click();
        findElement(By.linkText("确认")).click();
        findElement(By.id("clearMemberSearchInput")).click();
        return this;
    }
    //选择删除成员
    public ContactPage deleteCurrentPage() throws InterruptedException {
        waitCickBle(500,By.cssSelector(".ww_checkbox"));//等待点击
        List<WebElement> elements=driver.findElements(By.cssSelector(".ww_checkbox"));
        for (int i=1;i<elements.size();i++){
            elements.get(i).click();
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        findElement(By.linkText("删除")).click();
        findElement(By.linkText("确认")).click();
        return this;
    }
    //列表查询功能
    public void list(){

    }

}
