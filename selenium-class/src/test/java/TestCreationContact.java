import org.testng.annotations.Test;

public class TestCreationContact extends TestBase{
    @Test
    public void TestCreationContact() {
        fillContactForm();
        submitCreationContact();
        returnToContactsPage();
    }


}
