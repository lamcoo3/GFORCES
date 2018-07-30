package testscripts.computerdatabase_testscripts;

import org.testng.annotations.Test;
import testscripts.BaseTest;

public class TC1ClickOnHyperlinkPlaySampleApplicationComputerDatabase extends BaseTest {
    @Test
    public void verifyHomePageReloadCorrectly() {
        computerDatabase.topBar.click();
        checkingMainPageDisplayCorrectly();
    }
}
