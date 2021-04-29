package todos;


import org.testng.annotations.Test;

public class ToDosCheck extends BaseTest {

@Test

    public void runcase() {

    TodosPage fill = new TodosPage(driver);
    fill.open();
    fill.todosFill();

}

}
