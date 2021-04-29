package nestedFrame;

import org.testng.annotations.Test;

public class TestRun extends BaseTest{

    @Test
    public void runTestCase() {

        TestPlan runtc = new TestPlan(driver);
        runtc.openbrowser();
        runtc.farmees1("frame-left", "LEFT", "LEFT");
        runtc.farmees2("frame-middle", "MIDDLE", "MIDDLE");
        runtc.farmees3("BOTTOM", "BOTTOM");
    }

}
