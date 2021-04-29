package hyperLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPlan extends BasePage {
    By clickPath = By.xpath("//a[contains(text(), 'here')]");


    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openbrowser() {
        driver.get("https://the-internet.herokuapp.com/status_codes");
        driver.manage().window().maximize();
    }

    public void linkTest(String linh, String expected) {

    //    driver.findElement(By.xpath("//a[contains(text(), '" + linh + "')]")).click();

        // replace value of variable of text

        driver.findElement(By.xpath(String.format("//a[contains(text(), '%s')]",linh))).click();
        Assert.assertTrue(driver.getCurrentUrl().contains(expected));

        driver.findElement(clickPath).click();

    }

}
