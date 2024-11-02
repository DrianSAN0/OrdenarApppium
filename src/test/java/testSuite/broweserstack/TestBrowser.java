package testSuite.broweserstack;
import activities.browserstack.Main;
import activities.browserstack.homeMenu;
import activities.browserstack.logot;
import activities.browserstack.singin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBrowser extends CalcTestBase {
    Main mainMenu = new Main();
    homeMenu homeMenu = new homeMenu();
    logot logot = new logot();
    singin singin = new singin();

    @Test
    public void addTask() throws InterruptedException {
        String welcome = "Welcome ";
        String welcUser = "Welcome demouser";
        mainMenu.homeMenu.click();
        homeMenu.singin.click();
        singin.singin();
        mainMenu.homeMenu.click();
        Assertions.assertEquals(welcUser,homeMenu.welcom.getText(),
                "ERROR ");

        logot.logout.click();
        Thread.sleep(3000);
        mainMenu.homeMenu.click();
        Assertions.assertEquals(welcome,homeMenu.welcom.getText(),
                "ERROR");

    }
}
