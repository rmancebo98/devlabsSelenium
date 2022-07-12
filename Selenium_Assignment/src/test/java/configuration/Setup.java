package configuration;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class Setup implements ITestListener, IRetryAnalyzer {

    static WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public void minimizeWindow(){
        driver.manage().window().minimize();
    }

    @AfterSuite
    public void tearDown(){
//        minimizeWindow();
//        driver.quit();
    }

    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        Shutterbug.shootPage(driver).save();
        System.out.println("Screenshot saved");
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        Shutterbug.shootPage(driver).save();
    }

    private int count = 0;
    private final static int maxTry = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (count < maxTry) {
                count++;
                iTestResult.setStatus(ITestResult.FAILURE);
                return true;
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }

}
