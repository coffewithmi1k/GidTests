import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class SampleTest {

private WebDriver driver;

@BeforeMethod
public void setUp(){
    driver = new FirefoxDriver();
   // driver = new ChromeDriver();

}

@Test
    public  void first(){
    driver.get("Https:google.com");
        System.out.println("First");
    }
@Test
    public  void second() {
    driver.get("Https:facebook.com");

        System.out.println("second");
    }

@Test
    public  void third(){
    driver.get("Https:twitter.com");
        System.out.println("third");
    }


    @AfterMethod
    public void close(){
    driver.close();
    }

}
