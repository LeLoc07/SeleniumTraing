package researchTFS;

import org.testng.annotations.Test;

public class TestRun extends BaseTest{

    @Test
    public void runTC() throws InterruptedException {

        TestPlan run = new TestPlan(driver);
        run.openBrowser();
        run.searchBug();
        run.addTag();
        run.addBuilds();
        run.addPlatform();
        run.addComment();

    }

}
