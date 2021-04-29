package researchTFS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

    }

    @AfterTest
    public void close() {

//        driver.manage().deleteAllCookies();
//        driver.quit();

    }

}
