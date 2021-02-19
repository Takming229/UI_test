package selenium.Page;

import org.openqa.selenium.By;

public class ContactPage extends BasePage{
    //添加功能
    public ContactPage add(String username, String acct, String iPhone){
        findElement(By.name("username")).sendKeys(username);
        findElement(By.name("acctid")).sendKeys(acct);
        findElement(By.name("mobile")).sendKeys(iPhone);
        //App.driver.findElement(By.linkText("保存")).click();
        return this;
    }
    //列表查询功能
    public void list(){

    }
}
