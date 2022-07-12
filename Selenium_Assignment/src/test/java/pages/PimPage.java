package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    WebDriver driver;

    public PimPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#empsearch_employee_name_empName")
    private WebElement employeeTxt;

    public WebElement getEmployeeTxt(){
        return employeeTxt;
    }

}
