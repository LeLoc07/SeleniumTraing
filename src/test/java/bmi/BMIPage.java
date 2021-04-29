package bmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BMIPage extends BasePage {


    public BMIPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://www.calculator.net/bmi-calculator.html");
    }

    public void checkBMIstatus(String age, String height, String weight, String gender, String expected){
        WebElement cageEle = driver.findElement(By.id("cage"));
        cageEle.click();
        cageEle.clear();
        cageEle.sendKeys(age);

        if (gender.equals("male")){
            driver.findElement(By.id("csex1")).click();
        }else
            driver.findElement(By.id("csex2")).click();


        WebElement heightEle = driver.findElement(By.id("cheightmeter"));
        heightEle.click();
        heightEle.clear();
        heightEle.sendKeys(height);

        WebElement weightEle = driver.findElement(By.id("ckg"));
        weightEle.click();
        weightEle.clear();
        weightEle.sendKeys(weight);

        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        Assert.assertEquals(driver.findElement(By.className("bigtext")).getText(), expected);
    }
}
