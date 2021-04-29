package login;

import org.testng.annotations.Test;

public class TestRun extends BaseTest{

    @Test
    public void caserun() {

        TestPlan chay = new TestPlan(driver);
        chay.openbrowser();
        chay.signin();

    }

}
