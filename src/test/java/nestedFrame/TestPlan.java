package nestedFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestPlan extends BasePage {

    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openbrowser() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
    }

    public void farmees1(String nameframe, String text, String expected) {

        driver.switchTo().frame("frame-top")
                .switchTo().frame(driver.findElement(By.xpath("//frame[@name= '" + nameframe + "']")));

        WebElement ten = driver.findElement(By.xpath("//body[contains(text(), '" + text + "')]"));
            ten.getText();

        Assert.assertTrue(ten.getText().contains(expected));
        driver.switchTo().parentFrame();

    }

    public void farmees2(String nameframe, String text, String expected) {

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name= '" + nameframe + "']")));

        WebElement ten = driver.findElement(By.xpath("//div[contains(text(), '" + text + "')]"));
        ten.getText();

        Assert.assertTrue(ten.getText().contains(expected));
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }

    public void farmees3(String text, String expected) {

        driver.switchTo().frame("frame-bottom");

        WebElement ten = driver.findElement(By.xpath("//body[contains(text(), '" + text + "')]"));
        ten.getText();

        Assert.assertTrue(ten.getText().contains(expected));
        driver.switchTo().parentFrame();

    }

}
