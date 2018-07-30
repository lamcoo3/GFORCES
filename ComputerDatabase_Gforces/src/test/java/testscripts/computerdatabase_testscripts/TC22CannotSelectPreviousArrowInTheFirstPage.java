package testscripts.computerdatabase_testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import testscripts.BaseTest;

public class TC22CannotSelectPreviousArrowInTheFirstPage extends BaseTest {
    @Test
    public void verifyPreviousArrowIsDisabled() {
        Assert.assertEquals(computerDatabase.previousArrowIsDisabled.getAttribute("class"), "prev disabled");
    }
}
