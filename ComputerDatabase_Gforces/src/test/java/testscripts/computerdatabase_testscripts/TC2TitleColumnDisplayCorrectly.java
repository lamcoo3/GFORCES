package testscripts.computerdatabase_testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class TC2TitleColumnDisplayCorrectly extends BaseTest{
    @Test
    public void verifyTitleColumnDisplayedCorrectly() {
        checkingTitleColumnDisplayedCorrectly();
    }
    public void checkingTitleColumnDisplayedCorrectly(){
        Assert.assertEquals(computerDatabase.computerNameColumn.getText(), dataOfComputerDatabase.COLUMN1);
        Assert.assertEquals(computerDatabase.introducedColumn.getText(), dataOfComputerDatabase.COLUMN2);
        Assert.assertEquals(computerDatabase.discontinuedColumn.getText(), dataOfComputerDatabase.COLUMN3);
        Assert.assertEquals(computerDatabase.companyColumn.getText(), dataOfComputerDatabase.COLUMN4);
    }
}
