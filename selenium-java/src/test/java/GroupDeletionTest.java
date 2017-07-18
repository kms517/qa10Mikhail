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

public class GroupDeletionTest extends TestBase{


    @Test
    public void groupDeletionTest() {

        selectGroups();
        //selectGroups
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
        //clickDeleteButton
        wd.findElement(By.linkText("group page")).click();
        //returnToGroupPage
        wd.findElement(By.linkText("Logout")).click();
        //logOut
    }

    private void selectGroups() {
        wd.findElement(By.linkText("groups")).click();
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/span[3]/input")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/span[3]/input")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/span[5]/input")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/span[5]/input")).click();
        }
    }

}
