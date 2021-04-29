package table;

import org.testng.annotations.Test;

public class TestRun extends BaseTest{

    @Test
    public void runTC() {

        TestPlan run = new TestPlan(driver);
        run.openWeb();
        run.getMaxDue();
        run.getMinDue();
        run.getEmailss();

    }

}
