package DataProvide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaiTap3 {

    private WebDriver driver;

    @BeforeTest
    public void OpenWeb() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\loclnp\\Desktop\\loclnp\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/status_codes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "Pages")
    public void TestPages(String url, String expected) {

        String path = "//a[contains(text(), '" + url + "')]";
        driver.findElement(By.xpath(path)).click();
        Assert.assertTrue(driver.getCurrentUrl().contains(expected));
        driver.findElement(By.xpath("//a[contains(text(), 'here')]")).click();
    }

    @DataProvider
    static Object[][] Pages() {
        return new Object[][]{
            new Object[]{"200", "/status_codes/200"},
            new Object[]{"301", "/status_codes/301"},
            new Object[]{"404", "/status_codes/404"},
            new Object[]{"500", "/status_codes/510"},
        };
    }

    @AfterTest
    public  void close() {
        driver.quit();
    }


}
