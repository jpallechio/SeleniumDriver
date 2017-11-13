import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class RicardoBeverlyHillsTest extends TestCase {
    private WebDriver chromeDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://rbh.greenrivertech.net/login");
    }

    public void testEmailLoginWithButton(){
        chromeDriver.findElement(By.id("email")).sendKeys("pc@pc.com");
        chromeDriver.findElement(By.id("password")).sendKeys("acpacp");
        chromeDriver.findElement(By.className("btn-primary")).click();

        assertEquals(chromeDriver.getCurrentUrl(), "http://rbh.greenrivertech.net/part-company-claim");
    }

    public void testEmailLoginWithAnchor(){
        chromeDriver.findElement(By.id("email")).sendKeys("pc@pc.com");
        chromeDriver.findElement(By.id("password")).sendKeys("acpacp");
        chromeDriver.findElement(By.linkText("Login"));

        assertEquals(chromeDriver.getCurrentUrl(), "http://rbh.greenrivertech.net/part-company-claim");
    }


}
