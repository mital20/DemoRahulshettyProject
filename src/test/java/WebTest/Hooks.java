package WebTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager();
    @Before
    public void OpenBrowser ()
    {
        browserManager.setUpBrowser();

    }
    @After
    public void closeBrowser()
    {
        browserManager.setUpCloseBrowser();

    }
}
