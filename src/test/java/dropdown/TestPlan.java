package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestPlan extends BasePage {


    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openweb() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
    }

    public void dropdwnlist() {

        driver.findElement(By.xpath("//select[@id= 'dropdown']")).click();
        WebElement clickopt1 = driver.findElement(By.xpath("//select[@id= 'dropdown']//option[@value= '1']"));
            clickopt1.click();

        Assert.assertTrue(clickopt1.isSelected());


    }

}
