package StepDefinitions;

import PageFactory.Cartpage;
import PageFactory.Homepage;
import PageFactory.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementsUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ScenarioPassant {
    WebDriver Driver;
    Loginpage login;
    Homepage home;
    Cartpage cart;
    Properties prop;
    ConfigReader site;
    ElementsUtils methode;


    @Given("Je me rends sur le site SwagLabs")
    public void je_me_rends_sur_le_site_swag_labs() {
        Driver=new ChromeDriver();
        site=new ConfigReader();
        prop=site.ConfigurationManager();
        cart=new Cartpage(Driver);
        home=new Homepage(Driver);
        login=new Loginpage(Driver);
        Driver.get(site.geturl());
        Driver.manage().window().maximize();
    }
    @When("Je saisie le username")
    public void je_saisie_le_username() {
        login.saisieleusername(site.getloginname());

    }
    @When("Je saisie le password")
    public void je_saisie_le_password() {
        login.saisirlemdp(site.getpassword());
    }
    @When("Je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() throws InterruptedException {
        Thread.sleep(3000);
        login.cliquersurlebouttonlogin();
    }
    @Then("La page des produit s affichent")
    public void la_page_des_produit_s_affichent() {
        methode=new ElementsUtils(Driver);
        methode.confirmation("https://www.saucedemo.com/inventory.html");
    }


    @When("Je clique sur le bouton Add to cart du produit BackPack")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_back_pack() throws InterruptedException {
        Thread.sleep(3000);
        home.cliquersurlebouttonadd1();

    }
    @When("Je clique sur le bouton Add to cart du produit T-Shirt")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_t_shirt() throws InterruptedException {
        Thread.sleep(3000);
        home.cliquersurlebouttonadd2();

    }

    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() throws InterruptedException {
        methode=new ElementsUtils(Driver);
        Thread.sleep(3000);
        methode.recherche("Remove");


    }


    @When("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() {
        home.cliquersuriconepanier();
        cart.cliquersuriconepanier();

    }
    @When("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() {
       cart.cliquersurlebouttonremove();

    }
    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() throws InterruptedException {
        Thread.sleep(3000);
        methode=new ElementsUtils(Driver);
        methode.confirmation("https://www.saucedemo.com/cart.html");


    }


    @When("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() {
        cart.cliquersurlebouttoncheckout();

    }

    @When("Je rempli le username")
    public void je_rempli_le_username() throws InterruptedException {
        Thread.sleep(3000);
        WebElement firstname;
        firstname=Driver.findElement(By.id("first-name"));
        firstname.sendKeys("maryem");


    }

    @When("Je saisie le lastname")
    public void je_saisie_le_lastname() throws InterruptedException {
        Thread.sleep(3000);
        WebElement lastname;
        lastname=Driver.findElement(By.id("last-name"));
        lastname.sendKeys("khlifi");


    }

    @When("Je saisie le code postal")
    public void je_saisie_le_code_postal() throws InterruptedException {
        Thread.sleep(3000);
        WebElement codepostal;
        codepostal=Driver.findElement(By.id("postal-code"));
        codepostal.sendKeys("38000");

    }

    @When("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() {
        WebElement bouttoncont;
        bouttoncont= Driver.findElement(By.id("continue"));
        bouttoncont.click();

    }

    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() throws InterruptedException {
        Thread.sleep(3000);
        methode=new ElementsUtils(Driver);
        methode.confirmation ("https://www.saucedemo.com/checkout-step-two.html");



    }

    @When("je clique sur le bouton finish")
    public void je_clique_sur_le_bouton_finish() {
        WebElement bouttonfinish;
        bouttonfinish= Driver.findElement(By.id("finish"));
        bouttonfinish.click();


    }

    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() throws InterruptedException {
        Thread.sleep(3000);
        methode=new ElementsUtils(Driver);
        methode.confirmation("https://www.saucedemo.com/checkout-complete.html") ;




    }


    @When("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() throws InterruptedException {
        Thread.sleep(3000);
        cart.cliquersurmenuburger();


    }

    @When("Je clique surle bouton Logout")
    public void je_clique_surle_bouton_logout() throws InterruptedException {
        Thread.sleep(3000);
        cart.cliquersurlebouttonlogout();

    }

    @Then("Je me redirige vers la page d authentification {string}")
    public void je_me_redirige_vers_la_page_d_authentification(String string) throws InterruptedException {
        Thread.sleep(3000);
        methode=new ElementsUtils(Driver);
        methode.confirmation("https://www.saucedemo.com/");


    }
}
