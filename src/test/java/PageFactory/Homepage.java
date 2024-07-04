package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement bouttonadd1;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement bouttonadd2;

    @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
    WebElement iconepanier;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuburger;

    WebDriver Driver;
    public Homepage(WebDriver Driver){
        this.Driver=Driver;
        PageFactory.initElements(Driver,this);
    }

    public void cliquersurlebouttonadd1(){
        bouttonadd1.click();
    }
    public void cliquersurlebouttonadd2(){
        bouttonadd2.click();
    }
    public void cliquersuriconepanier(){
        iconepanier.click();
    }
    public void cliquersurmenuburger(){
        menuburger.click();
    }



}
