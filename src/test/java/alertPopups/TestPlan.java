package alertPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPlan extends BasePage{

    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openbrowser() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }

    public void jsAlert() {

        By alertjs = By.xpath("//button[contains(text(), 'Click for JS Alert')]");
        By note = By.id("result");

        driver.findElement(alertjs).click();
        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElement(note).getText().contains("You successfully clicked an alert"));

    }

    public void jsConfirm() {

        By alertjs = By.xpath("//button[contains(text(), 'Click for JS Confirm')]");
        By note = By.id("result");

        driver.findElement(alertjs).click();
        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElement(note).getText().contains("You successfully clicked an alert"));

    }

}
