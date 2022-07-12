package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[href='/index.php/leave/assignLeave']")
    private WebElement assignLeaveBtn;

    @FindBy(css = "a[href='/index.php/time/viewMyTimesheet']")
    private WebElement viewTimeSheetBtn;

    @FindBy(xpath = "//span[text()='Leave List']")
    private WebElement leaveListBtn;

    public void iReadTheDashboard(String text) {
        WebElement element = driver.findElement(By.xpath("//h1"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element.getText(), text);
    }

    public WebElement getAssignLeaveBtn() {
        return assignLeaveBtn;
    }

    public WebElement getViewTimeSheetBtn() {
        return viewTimeSheetBtn;
    }

    public WebElement getLeaveListBtn() {
        return leaveListBtn;
    }
}
