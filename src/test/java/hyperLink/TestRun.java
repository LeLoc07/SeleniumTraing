package hyperLink;

import org.testng.annotations.Test;

public class TestRun extends BaseTest {

    @Test
    public void runTc() {

        TestPlan run = new TestPlan(driver);
        run.openbrowser();
        run.linkTest("200", "status_codes/200");
        run.linkTest("301", "status_codes/301");
        run.linkTest("404", "status_codes/404");
        run.linkTest("500", "status_codes/500");
    }

}
