package stepdefinitions;


import io.cucumber.java.en.Given;
import pages.Hepsiburada;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;



public class login {

    Hepsiburada hepsiburada = new Hepsiburada();

    @Given("Go to Hepsiburada Home Page")
    public void go_to_hepsiburada_home_page() throws MalformedURLException {
        Driver.getAppiumDriver();
    }

    @Given("Click the account button")
    public void click_the_account_button() throws InterruptedException {
        ReusableMethods.bekle(1);
        hepsiburada.accountButton.click();
    }
    @Given("Click the Login button")
    public void click_the_login_button() {

        ReusableMethods.bekle(1);
        hepsiburada.loginButton.click();

    }
    @Given("Enter the email address")
    public void enter_the_email_address() {
        ReusableMethods.bekle(2);
        hepsiburada.emailTextbox.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.bekle(1);
        hepsiburada.loginButton2.click();
    }
    @Given("Enter the password")
    public void enter_the_password() {
        ReusableMethods.bekle(3);
        hepsiburada.passwordTextbox.sendKeys(ConfigReader.getProperty("password"));
        hepsiburada.loginButton2.click();
    }

}
