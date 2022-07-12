package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Headers {

    WebDriver driver;

    public Headers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='MP_link']")
    private WebElement marketplaceBtn;

    @FindBy(xpath = "//a[@id='welcome']")
    private WebElement userBtn;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    private WebElement dashboardTitle;

    @FindBy(css = "a#menu_admin_viewAdminModule")
    private WebElement adminTab;

    @FindBy(xpath = "//a[text()='User Management']")
    private WebElement userManagementOpt;

    @FindBy(xpath = "//a[text()='Job']")
    private WebElement jobOpt;

    @FindBy(xpath = "//a[text()='Organization']")
    private WebElement organizationOpt;

    @FindBy(xpath = "//a[text()='Qualifications']")
    private WebElement qualificationsOpt;

    @FindBy(css = "a#menu_pim_viewPimModule")
    private WebElement pimTab;

    @FindBy(xpath = "//a[text()='Configuration']")
    private WebElement configurationOpt;

    @FindBy(xpath = "(//a[text()='Configuration'])[2]")
    private WebElement pimConfigurationOpt;

    @FindBy(xpath = "//a[text()='Employee List']")
    private WebElement employeeListOpt;

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmployeeOpt;

    @FindBy(xpath = "//a[text()='Reports']")
    private WebElement reportsOpt;

    @FindBy(xpath = "(//a[text()='Reports'])[2]")
    private WebElement leaveReportsOpt;

    @FindBy(css = "a#menu_leave_viewLeaveModule")
    private WebElement leaveTab;

    @FindBy(xpath = "//a[text()='Apply']")
    private WebElement applyOpt;

    @FindBy(xpath = "//a[text()='My Leave']")
    private WebElement myLeaveOpt;

    @FindBy(xpath = "//a[text()='Entitlements']")
    private WebElement entitlementsOpt;

    @FindBy(xpath = "//a[text()='Configure']")
    private WebElement configureOpt;

    @FindBy(xpath = "//a[text()='Leave List']")
    private WebElement leaveListOpt;

    @FindBy(xpath = "//a[text()='Assign Leave']")
    private WebElement assignLeaveOpt;

    @FindBy(css = "a#menu_directory_viewDirectory")
    private WebElement directoryTab;

    @FindAll({
            @FindBy(xpath = "//a[@id='menu_directory_viewDirectory']/following-sibling::ul/*")
    })
    private List<WebElement> allDirectoryOptions;

    @FindBy(css = "a#menu_maintenance_purgeEmployee")
    private WebElement maintenanceTab;

    @FindBy(xpath = "//a[text()='Purge Records']")
    private WebElement purgeRecordsOpt;

    @FindBy(xpath = "//a[text()='Access Records']")
    private WebElement accessRecordsOpt;

    @FindBy(css = "a#menu_time_viewTimeModule")
    private WebElement timeTab;

    public void assertDashboardTitleIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dashboardTitle));
    }

    public WebElement getAdminTab() {
        return adminTab;
    }

    public WebElement getMarketplaceBtn() {
        return marketplaceBtn;
    }

    public WebElement getUserBtn() {
        return userBtn;
    }

    public WebElement getUserManagementOpt() {
        return userManagementOpt;
    }

    public WebElement getJobOpt() {
        return jobOpt;
    }

    public WebElement getOrganizationOpt() {
        return organizationOpt;
    }

    public WebElement getQualificationsOpt() {
        return qualificationsOpt;
    }

    public WebElement getPimTab() {
        return pimTab;
    }


    public WebElement getConfigurationOpt() {
        return configurationOpt;
    }

    public WebElement getEmployeeListOpt() {
        return employeeListOpt;
    }

    public WebElement getAddEmployeeOpt() {
        return addEmployeeOpt;
    }

    public WebElement getReportsOpt() {
        return reportsOpt;
    }

    public WebElement getLeaveTab() {
        return leaveTab;
    }

    public WebElement getApplyOpt() {
        return applyOpt;
    }

    public WebElement getMyLeaveOpt() {
        return myLeaveOpt;
    }

    public WebElement getEntitlementsOpt() {
        return entitlementsOpt;
    }

    public WebElement getConfigureOpt() {
        return configureOpt;
    }

    public WebElement getLeaveListOpt() {
        return leaveListOpt;
    }

    public WebElement getAssignLeaveOpt() {
        return assignLeaveOpt;
    }

    public WebElement getDirectoryTab() {
        return directoryTab;
    }

    public List<WebElement> getAllDirectoryOptions() {
        return allDirectoryOptions;
    }

    public WebElement getMaintenanceTab() {
        return maintenanceTab;
    }

    public WebElement getPurgeRecordsOpt() {
        return purgeRecordsOpt;
    }

    public WebElement getAccessRecordsOpt() {
        return accessRecordsOpt;
    }

    public WebElement getTimeTab() {
        return timeTab;
    }

    public void assertAdminOptionsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userManagementOpt));
        wait.until(ExpectedConditions.visibilityOf(jobOpt));
        wait.until(ExpectedConditions.visibilityOf(organizationOpt));
        wait.until(ExpectedConditions.visibilityOf(qualificationsOpt));
    }

    public void assertPimOptionsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pimConfigurationOpt));
        wait.until(ExpectedConditions.visibilityOf(employeeListOpt));
        wait.until(ExpectedConditions.visibilityOf(addEmployeeOpt));
        wait.until(ExpectedConditions.visibilityOf(reportsOpt));
    }

    public void assertLeaveOptionsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(applyOpt));
        wait.until(ExpectedConditions.visibilityOf(myLeaveOpt));
        wait.until(ExpectedConditions.visibilityOf(entitlementsOpt));
        wait.until(ExpectedConditions.visibilityOf(leaveReportsOpt));
        wait.until(ExpectedConditions.visibilityOf(configureOpt));
        wait.until(ExpectedConditions.visibilityOf(leaveListOpt));
        wait.until(ExpectedConditions.visibilityOf(assignLeaveOpt));
    }

    public void assertDirectoryOptionsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals(allDirectoryOptions.size(), 1);
    }

    public void assertMaintenanceOptionsAreVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(purgeRecordsOpt));
        wait.until(ExpectedConditions.visibilityOf(accessRecordsOpt));
    }
}
