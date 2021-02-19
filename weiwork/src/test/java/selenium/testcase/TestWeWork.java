package selenium.testcase;

import org.junit.BeforeClass;
import org.junit.Test;

import selenium.Page.App;

import java.util.concurrent.TimeUnit;

public class TestWeWork {
    public static App app;
    @BeforeClass
    public static void BeforeClass(){
        app=new App();//App类初始化
        app.loingwithcookie();
    }
    @Test
    public void TestStart(){
        String iPhone="1810000000";
        app.toMemberAdd().add(iPhone,iPhone,iPhone);//App类初始后调用toMemberAdd方法点击Add（“添加成员”进入新的Po）

    }
}
