package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.DashboardPage;
import pages.Headers;
import pages.LoginPage;
import utils.GenericMethods;

public class Steps {


    public WebDriver driver;

    GenericMethods genericMethods;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    Headers headers;


    @Given("I launch the browser")
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        genericMethods = new GenericMethods(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        headers = new Headers(driver);
    }

    @Given("I print the title")
    public void i_print_the_title() {
        genericMethods.getPageTitle();
    }

    @Given("I login as user {string} with password {string}")
    public void iLoginAsUserAdminWithPasswordAdmin(String user, String password) {
        loginPage.iLoginWithUserAndPassword(user, password);
    }

    @Then("I validate the dashboard is present")
    public void iValidateTheDashboardIsPresent() {
        headers.assertDashboardTitleIsPresent();
    }

    @And("I hover on admin tab")
    public void iHoverOnAdminTab() {
        Actions actions = new Actions(driver);
        actions.moveToElement(headers.getAdminTab()).perform();
    }

    @Then("I click on admin tab")
    public void iClickOnAdminTab(){
        headers.getAdminTab().click();
    }

    @Then("I assert admin options are visible")
    public void iAssertAdminOptionsAreVisible() {
        headers.assertAdminOptionsAreVisible();
    }

    @Then("I hover sub-tabs and assert options are visible")
    public void iHoverSubTabsAndAssertOptionsAreVisible(){
        headers.getAdminTab().click();
        headers.assertAdminOptionsAreVisible();
        headers.getPimTab().click();
        headers.assertPimOptionsAreVisible();
        headers.getLeaveTab().click();
        headers.assertLeaveOptionsAreVisible();
        headers.getDirectoryTab().click();
        headers.assertDirectoryOptionsAreVisible();
        headers.getMaintenanceTab().click();
        headers.assertMaintenanceOptionsAreVisible();
    }

    @Then("I read the dashboard and check if text is {string}")
    public void iReadTheDashboardAndCheckIfTextIs(String text){
        dashboardPage.iReadTheDashboard(text);
    }
}
