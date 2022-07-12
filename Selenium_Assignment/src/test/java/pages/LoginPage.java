package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#txtUsername")
    private WebElement userNameTxt;

    @FindBy(xpath = "//input[@name='txtPassword']")
    private WebElement passwordTxt;

    @FindBy(css = "input#btnLogin")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@id='forgotPasswordLink']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@href='http://www.orangehrm.com']")
    private WebElement orangeLink;

    @FindBy(xpath = "//a[@href='http://www.linkedin.com/groups?home=&gid=891077']")
    private WebElement linkedinLink;

    @FindBy(xpath = "//a[@href='http://www.facebook.com/OrangeHRM']")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[@href='http://twitter.com/orangehrm']")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@href='http://www.youtube.com/orangehrm']")
    private WebElement youtubeLink;

    @FindBy(xpath = "//img[@src='/webres_62ade561ecf3a1.87783209/themes/default/images/login/logo.png']")
    private WebElement orangeLogo;

    @FindBy(xpath = "//img[@alt='LinkedIn OrangeHRM group']")
    private WebElement linkedinLogo;

    @FindBy(xpath = "//img[@alt='OrangeHRM on Facebook']")
    private WebElement facebookLogo;

    @FindBy(xpath = "//img[@alt='OrangeHRM on twitter']")
    private WebElement twitterLogo;

    @FindBy(xpath = "//img[@alt='OrangeHRM on youtube']")
    private WebElement youtubeLogo;

    public WebElement getOrangeLogo() {
        return orangeLogo;
    }

    public WebElement getLinkedinLogo() {
        return linkedinLogo;
    }

    public WebElement getFacebookLogo() {
        return facebookLogo;
    }

    public WebElement getTwitterLogo() {
        return twitterLogo;
    }

    public WebElement getYoutubeLogo() {
        return youtubeLogo;
    }

    public WebElement getOrangeLink() {
        return orangeLink;
    }

    public WebElement getLinkedinLink() {
        return linkedinLink;
    }

    public WebElement getFacebookLink() {
        return facebookLink;
    }

    public WebElement getTwitterLink() {
        return twitterLink;
    }

    public WebElement getYoutubeLink() {
        return youtubeLink;
    }

    public WebElement getUserNameTxt() {
        return userNameTxt;
    }

    public WebElement getPasswordTxt() {
        return passwordTxt;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public void iLoginWithUserAndPassword(String user, String password){
        getUserNameTxt().click();
        getUserNameTxt().sendKeys(user);
        getPasswordTxt().click();
        getPasswordTxt().sendKeys(password);
        getLoginBtn().click();
    }
}
