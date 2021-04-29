package baiCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestPage extends BasePage {


    public TestPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.calculator.net/bmi-calculator.html");
    }

    public void fillform(String age, String height, String weight, String expected) {

        WebElement tuoi = driver.findElement(By.xpath("//input[@id= 'cage']"));
            tuoi.clear();
            tuoi.sendKeys(age);

        driver.findElement(By.xpath("//input[@id= 'csex2']")).click();

        WebElement chieucao = driver.findElement(By.xpath("//input[@id= 'cheightmeter']"));
            chieucao.clear();
            chieucao.sendKeys(height);

        WebElement nang = driver.findElement(By.xpath("//input[@id= 'ckg']"));
            nang.clear();
            nang.sendKeys(weight);

        driver.findElement(By.xpath("//input[@value= 'Calculate']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(), 'Obese Class III')]"))
                .getText().contains(expected));
    }

}
