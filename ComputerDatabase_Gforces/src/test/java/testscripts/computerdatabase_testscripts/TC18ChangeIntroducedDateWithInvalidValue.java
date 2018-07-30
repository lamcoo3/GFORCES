package testscripts.computerdatabase_testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class TC18ChangeIntroducedDateWithInvalidValue extends BaseTest {
    @Test
    public void verifyEditComputerNotSaveWhenInputInvalidValueInIntroducedDate() {
        computerDatabase.selectAComputerName.click();
        computerDatabase.introducedDateTextbox.clear();
        computerDatabase.introducedDateTextbox.sendKeys("30-07-2018");
        computerDatabase.saveButton.click();
        checkingHelpMessageAndStillInEditComputerPage();
    }

    public void checkingHelpMessageAndStillInEditComputerPage(){
        Assert.assertEquals(driver.getTitle(), dataOfComputerDatabase.TITLE);
        Assert.assertEquals(computerDatabase.editComputerTitle.getText(), dataOfComputerDatabase.EDITCOMPUTERTITLE);
        Assert.assertEquals(computerDatabase.computerNameLabel.getText(), dataOfComputerDatabase.COMPUTERNAME);
        Assert.assertEquals(computerDatabase.computerNameTextbox.getAttribute("value"), "APEXC");
        Assert.assertEquals(computerDatabase.computerNameHelp.getText(), dataOfComputerDatabase.COMPUTERNAMEHELP);
        Assert.assertEquals(computerDatabase.introducedDateLabel.getText(), dataOfComputerDatabase.INTRODUCEDDATE);
        Assert.assertEquals(computerDatabase.introducedDateTextbox.getAttribute("value"), "30-07-2018");
        Assert.assertEquals(computerDatabase.introducedDateHelp.getText(), dataOfComputerDatabase.INTRODUCEDDATEHELP);
        Assert.assertEquals(computerDatabase.discontinuedDateLabel.getText(), dataOfComputerDatabase.DISCONTINUEDDATE);
        Assert.assertEquals(computerDatabase.discontinuedDateTextbox.getAttribute("value"), "");
        Assert.assertEquals(computerDatabase.discontinuedDateHelp.getText(), dataOfComputerDatabase.DISCONTINUEDDATEHELP);
        Assert.assertEquals(computerDatabase.companyLabel.getText(), dataOfComputerDatabase.COMPANY);
    }
}
