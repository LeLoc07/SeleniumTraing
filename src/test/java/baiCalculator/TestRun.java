package baiCalculator;

import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @Test
    public void runtcbmi() {
        TestPage bmicheck = new TestPage(driver);
        bmicheck.open();
            bmicheck.fillform("25", "189", "200", "Obese Class III");
        }
}
