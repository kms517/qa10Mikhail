import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupModification(){
    goToGroupsPage();
    selectGroup();
    initGroupModification();
    fillGroupForm();
    submitGroupsModification();
    //wd.switchTo().alert().accept();
    returnToGroupsPage();
    }

}
