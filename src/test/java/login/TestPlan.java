package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPlan extends BasePage {

    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openbrowser() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
    }

    public void signin() {

        By user = By.id("username");
        By pass = By.id("password");
        By login = By.xpath("//i[contains(text(), 'Login')]");

        driver.findElement(user).sendKeys("tomsmith");
        driver.findElement(pass).sendKeys("SuperSecretPassword!");
        driver.findElement(login).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/secure"));

    }
}
