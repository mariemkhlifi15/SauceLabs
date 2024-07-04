package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
    @FindBy(id = "checkout")
    WebElement bouttoncheckout;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement bouttonremove;

    @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
    WebElement iconepanier;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuburger;
    @FindBy(id = "logout_sidebar_link")
    WebElement bouttonlogout;

    WebDriver Driver;
    public Cartpage(WebDriver Driver){
        this.Driver=Driver;
        PageFactory.initElements(Driver,this);
    }

    public void cliquersurlebouttoncheckout(){
        bouttoncheckout.click();
    }
    public void cliquersurlebouttonremove() {
        bouttonremove.click();
    }
    public void cliquersuriconepanier(){
        iconepanier.click();
    }
    public void cliquersurmenuburger(){
        menuburger.click();
    }
    public void cliquersurlebouttonlogout() {
        bouttonlogout.click();
    }

}
