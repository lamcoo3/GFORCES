package testscripts.computerdatabase_testscripts;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class TC14VerifyCancelButtonInEditComputer extends BaseTest{
    @Test
    public void clickCancelButtonInEditComputerAndNavigateToMainPage() {
        computerDatabase.selectAComputerName.click();
        computerDatabase.cancelButton.click();
        checkingMainPageDisplayCorrectly();
    }
}
