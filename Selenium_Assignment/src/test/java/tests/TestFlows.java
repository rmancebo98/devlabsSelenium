package tests;

import configuration.Setup;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.Headers;
import pages.LoginPage;
import pages.PimPage;

@Listeners(Setup.class)

public class TestFlows extends Setup {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    PimPage pimPage;
    Headers headers;

    @Test(retryAnalyzer = Setup.class)
    public void enterEmployeeNameInPIM() {

        loginPage = new LoginPage(getDriver());
        dashboardPage = new DashboardPage(getDriver());
        pimPage = new PimPage(getDriver());
        headers = new Headers(getDriver());

        String employeeName = "Linda Anderson";

        loginPage.iLoginWithUserAndPassword("admin", "admin123");
        headers.getPimTab().click();
        pimPage.getEmployeeTxt().clear();
        pimPage.getEmployeeTxt().click();
        pimPage.getEmployeeTxt().sendKeys(employeeName);
    }


}
