package testscripts;

import org.openqa.selenium.support.PageFactory;
import pom.ComputerDatabase;
import data.DataOfComputerDatabase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static ComputerDatabase computerDatabase;
    protected static DataOfComputerDatabase dataOfComputerDatabase;

    @BeforeMethod
    public void setUpMethod(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        computerDatabase = PageFactory.initElements(driver, ComputerDatabase.class);
        driver.get(dataOfComputerDatabase.URL);
        driver.manage().window().maximize();
    }

    public void checkingMainPageDisplayCorrectly(){
        Assert.assertEquals(driver.getTitle(), dataOfComputerDatabase.TITLE);
        Assert.assertEquals(computerDatabase.topBar.getText(), dataOfComputerDatabase.TOPBAR);
        Assert.assertEquals(computerDatabase.filterButton.getAttribute("value"), dataOfComputerDatabase.FILTERBYNAME);
        Assert.assertEquals(computerDatabase.addNewComputerButton.getText(), dataOfComputerDatabase.ADDANEWCOMPUTER);
        Assert.assertEquals(computerDatabase.computerNameColumn.getText(), dataOfComputerDatabase.COLUMN1);
        Assert.assertEquals(computerDatabase.introducedColumn.getText(), dataOfComputerDatabase.COLUMN2);
        Assert.assertEquals(computerDatabase.discontinuedColumn.getText(), dataOfComputerDatabase.COLUMN3);
        Assert.assertEquals(computerDatabase.companyColumn.getText(), dataOfComputerDatabase.COLUMN4);
        Assert.assertEquals(computerDatabase.previousArrow.getText(), dataOfComputerDatabase.PREVIOUSARROW);
        Assert.assertEquals(computerDatabase.nextArrow.getText(), dataOfComputerDatabase.NEXTARROW);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
