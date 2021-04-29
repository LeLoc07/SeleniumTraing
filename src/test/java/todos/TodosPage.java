package todos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.util.List;

public class TodosPage extends BasePage {


    public TodosPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://todomvc.com/examples/vanillajs/");
    }

    public void todosFill() {

        List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
        int beforeAdd = list1.size();
        System.out.println("number of list: " + beforeAdd);

        WebElement addTicket = driver.findElement(By.xpath("//input[@class='new-todo']"));
        addTicket.click();
        addTicket.sendKeys("Mua Laptop", Keys.ENTER);
        addTicket.sendKeys("Mua hủ tiếu", Keys.ENTER);

        List<WebElement> list2 = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
        int afterAdd = list2.size();
        System.out.println("item added: " + afterAdd);

        Assert.assertEquals(afterAdd-beforeAdd, 2);

    }

}
