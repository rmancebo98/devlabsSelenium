package tests;

import configuration.Setup;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

@Listeners(Setup.class)

public class TestListenerWithScreenshot extends Setup {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test(retryAnalyzer = Setup.class)
    public void testWithScreenShot() {
        String text = "Dashboard";
        loginPage = new LoginPage(Setup.getDriver());
        dashboardPage = new DashboardPage(Setup.getDriver());
        loginPage.iLoginWithUserAndPassword("admin", "admin123");
        dashboardPage.iReadTheDashboard(text);
    }
}
