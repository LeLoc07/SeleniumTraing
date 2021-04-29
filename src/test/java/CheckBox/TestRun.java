package CheckBox;

import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @Test
    public void runTc1() {

        TestPlan clicktobox1 = new TestPlan(driver);
        clicktobox1.open();
        clicktobox1.checkbox1();

    }

    @Test
    public void runTc2() {

        TestPlan clicktobox2 = new TestPlan(driver);
        clicktobox2.checkbox2();

    }

}
