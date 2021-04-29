package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestPlan extends BasePage {


    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
    }

    public void checkbox1() {

       WebElement check1 = driver.findElement(By.xpath("//input[@type= 'checkbox'][1]"));
            check1.click();
        Assert.assertTrue(check1.isSelected());
    }

    public void checkbox2() {
        Actions clickChuot = new Actions(driver);
        clickChuot.moveToElement(driver.findElement(By.xpath("//input[@type= 'checkbox'][2]"))).doubleClick().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type= 'checkbox'][2]")).isSelected());
    }
}
