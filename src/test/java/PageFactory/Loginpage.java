package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement bouttonlogin;
    WebDriver Driver;
    public Loginpage(WebDriver Driver){
        this.Driver=Driver;
        PageFactory.initElements(Driver,this);
    }
    public void saisieleusername(String loginanme) {
        username.sendKeys(loginanme);

    }
    public void saisirlemdp(String mdp){
        password.sendKeys(mdp);

    }
    public void cliquersurlebouttonlogin()
    {
        bouttonlogin.click();
    }

}
