package Baidu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public class Cabben_URL{
   public String url ="http://47.102.164.111:27777/";
   public static WebDriver driver;

@BeforeAll
   public WebDriver login(){
      int T=1;
       System.out.println(T);
       Basepage basepage = new Basepage();
    driver=basepage.Chrome_drive(url);
    return driver;
   }


}
