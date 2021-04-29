package researchTFS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPlan extends BasePage{
    WebDriverWait wait = new WebDriverWait(driver,10);

    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openBrowser() {

        driver.get("https://loclnp:Zentetzuken22@@extdevops.imt-soft.com/2020/JQT/_workitems/recentlyupdated/");
        driver.manage().window().maximize();
        driver.get("https://extdevops.imt-soft.com/2020/JQT/_workitems/recentlyupdated/");
    }

    public void searchBug() throws InterruptedException {

        WebElement input = wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("input[id='l1-search-input']")));
        input.click();
        input.sendKeys("20");
        Thread.sleep(3000);
        input.sendKeys(Keys.ENTER);

    }

    public void addTag() {
        WebElement tags = wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("span[class='bowtie-icon bowtie-math-plus-light']")));

        tags.click();
        driver.switchTo().activeElement().sendKeys("JDK_17_b17", Keys.TAB, Keys.ESCAPE);

    }

    public void addBuilds() {

        By ink = By.xpath("(//div[@class='external-content-host-container']/iframe)[1]");
        By add = By.xpath("//input[@placeholder='Click to Add']");
        By lizt = By.xpath("//div[@role='listitem']/span[contains(text(), 'jdk_17_b13')]");

        //switch to frame builds
        WebElement frame1 = driver.findElement(ink);
        driver.switchTo().frame(frame1);

        //add builds
        WebElement addbiulds = wait.until(ExpectedConditions.elementToBeClickable(add));
        addbiulds.click();

        WebElement contentBuild = driver.switchTo().activeElement();
        WebElement compare =  driver.findElement(lizt);


        if(compare.getAttribute("aria-label").contains("jdk_17_b17")) {
            System.out.println("Build Đã tồn tại.");
        }

        else {
            contentBuild.sendKeys("jdk_17_b17", Keys.ENTER);
        }

        driver.switchTo().parentFrame();

        }

        public void addPlatform() {

        By fr2 = By.xpath("(//div[@class= 'external-content-host-container']/iframe)[2]");
        By addPlatforms = By.xpath("//input[@placeholder= 'Click to Add']");
        By platList = By.xpath("//div[@role= 'list']//span[@aria-label= 'Windows Server 2019 x64']");

        WebElement frame2 = driver.findElement(fr2);
        driver.switchTo().frame(frame2);

        WebElement addPlat = wait.until(ExpectedConditions.elementToBeClickable(addPlatforms));
        addPlat.click();

        WebElement platform = driver.switchTo().activeElement();
        WebElement comparePlat = driver.findElement(platList);

        if(comparePlat.getAttribute("aria-label").contains("Windows Server 2019 x64")) {

            System.out.println("Platform đã tồn tại!");
        }

        else {
            platform.sendKeys("Windows Server 2019 x64", Keys.ENTER);
        }

        driver.switchTo().parentFrame();

        }

    public void addComment() {
        By comment = By.xpath("//div[@aria-label= 'Discussion']");

        WebElement addCom = driver.findElement(comment);
        addCom.click();
        driver.switchTo().activeElement().sendKeys("ANDSd");

    }

}
