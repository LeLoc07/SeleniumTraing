package bmi;

import org.testng.annotations.Test;

public class BMICheck extends BaseTest {

@Test
    public void tc01(){
        BMIPage bmiPage =new BMIPage(driver);
        bmiPage.open();
        bmiPage.checkBMIstatus("25","180","65","male","BMI = 20.1 kg/m2   (Normal)");
    }

}
