package selenium.Page;

import org.openqa.selenium.By;

public class ContactPage {
    //添加功能
    public ContactPage add(String username, String acct, String iPhone){
        App.driver.findElement(By.name("username")).sendKeys(username);
        App.driver.findElement(By.name("acctid")).sendKeys(acct);
        App.driver.findElement(By.name("mobile")).sendKeys(iPhone);
        //App.driver.findElement(By.linkText("保存")).click();
        return this;
    }
    //列表查询功能
    public void list(){

    }
}
