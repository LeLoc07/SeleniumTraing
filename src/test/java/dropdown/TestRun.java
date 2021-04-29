package dropdown;

import CheckBox.BaseTest;
import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @Test
    public void runCase() {

        TestPlan select = new TestPlan(driver);
        select.openweb();
        select.dropdwnlist();

    }

}
