package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AnnotationTest {

    static WebDriver driver;

    LoginPage loginPage;
    @Test
    public void testWithAnnotation(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage(driver);
        loginPage.iLoginWithUserAndPassword("admin", "admin123");
    }
}
