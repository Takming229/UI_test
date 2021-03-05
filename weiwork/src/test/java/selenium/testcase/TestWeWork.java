package selenium.testcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import selenium.Page.App;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class TestWeWork {
    public static App app;
    @BeforeClass
    public static void BeforeClass(){
        app=new App();//App类初始化
        app.loingwithcookie();
    }
    @Test
    public void TestStart(){
        String iPhone="18102523541";
        app.toMemberAdd().add(iPhone,iPhone,iPhone);//App类初始后调用toMemberAdd方法点击Add（“添加成员”进入新的Po）

    }
    @Test
    public void testDelete(){
        String iPhone="18102523548";
        app.toMemberAdd().add(iPhone,iPhone,iPhone).delete(iPhone);//添加并删除成员
    }
    @Test
    //清除数据
    public void TestClear(){
        String Iphone="181025235412";
        app.toContact().delete(Iphone);
}
    @Test
    //通讯录列表选择删除
    public void deleteCurrentPage() throws InterruptedException {
        app.toContact().deleteCurrentPage();

    }

    @Test
    //上传导入
    public void importfromFile(){
        app.toContact().improtFile("D:\\GitAPI\\通讯录批量导入模板.xlsx");
    }
    @Test
    //群发消息
    public void broadcast(){
String title="你的快递到了";
        List<String> sendmsg= app.tobroadcast().send("晴天",title,title+title,
                "你的快递在前台","企业管理员").getSendMsg().subList(0,5);//取0到5的值
        System.out.println(sendmsg);
        assertThat(sendmsg,hasItem(title));

    }

}
