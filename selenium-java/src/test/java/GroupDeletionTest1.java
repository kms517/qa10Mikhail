import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class GroupDeletionTest1 extends TestBase{
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void GroupDeletionTest1() {
        goToGroupsPage();
        selectGroup();
        deleteGroup();
        returnToGroupsPage();


    }

    public void returnToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void deleteGroup() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
        //deleteGroup
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
        if (!wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).click();
        }
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
        //goToGroupsPage
    }

    public void logIn() {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        //logIn
    }

    public void openAddressBook() {
        wd.get("http://localhost/addressbook/");
        //openAddressBook
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
