package ui.pom;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class LoginTest {
    @FindBy(id="email")
    private WebElement loginTextBox;
    @FindBy(id="pass")
    private WebElement passwordTextBox;
    @FindBy (id="loginbutton")
    private WebElement loginButton;

    public  LoginTest(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterFacebookName(String login){
        loginTextBox.clear();
        loginTextBox.sendKeys(login);
    }

    public void enterFacebookPassword(String password) {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
