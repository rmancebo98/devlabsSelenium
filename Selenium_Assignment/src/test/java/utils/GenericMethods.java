package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GenericMethods {

    WebDriver driver;

    public GenericMethods(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void getPageTitle() {
        System.out.println("Page title is: " + driver.getTitle());
    }
}
