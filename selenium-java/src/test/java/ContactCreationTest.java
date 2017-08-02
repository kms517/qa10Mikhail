import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test
    public void contactCreationTest() {
        initContactCreation();
        fillContactForm();
        confirmContactCreation();
    }

}
