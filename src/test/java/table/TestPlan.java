package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class TestPlan extends BasePage {

    public List<PersonObject> persions;

    public TestPlan(WebDriver driver) {
        super(driver);
    }

    public void openWeb() {

        driver.get("https://the-internet.herokuapp.com/tables");

    }

    public static PersonObject toPerson(WebElement rows) {

        List<WebElement> cells = rows.findElements(By.tagName("td"));
        String lastName = cells.get(0).getText();
        String firstName = cells.get(1).getText();
        String email = cells.get(2).getText();
        String due = cells.get(3).getText().replace("$","");
        String webSite = cells.get(4).getText();
        return new PersonObject(lastName, firstName, email, Float.parseFloat(due), webSite);

    }


    public void getMaxDue() {

        List<WebElement> row = driver.findElements(By.xpath("//table[@id= 'table1']/tbody/tr"));
        persions = row.stream().map(TestPlan::toPerson).collect(Collectors.toList());

        float maxDue = persions.stream().max(Comparator.comparing(PersonObject::getDue))
                .orElseThrow(NoSuchFieldError::new).getDue();

        PersonObject maxPersons = persions.stream().max(Comparator.comparing(PersonObject::getDue))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(maxPersons.getFullName() + " have max due is: " + maxDue);

    }

    public void getMinDue() {

        List<WebElement> row = driver.findElements(By.xpath("//table[@id= 'table1']/tbody/tr"));
        persions = row.stream().map(TestPlan::toPerson).collect(Collectors.toList());

        float minDue = persions.stream().min(Comparator.comparing(PersonObject::getDue))
                .orElseThrow(NoSuchElementException::new).getDue();

        PersonObject minPersons = persions.stream().min(Comparator.comparing(PersonObject::getDue))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(minPersons.getFullName() + " less due is: " + minDue);

    }

    public void getEmailss() {

        List<WebElement> row = driver.findElements(By.xpath("//table[@id= 'table1']/tbody/tr"));
        persions = row.stream().map(TestPlan::toPerson).collect(Collectors.toList());

        String perEmail = persions.stream().m

    }

}
