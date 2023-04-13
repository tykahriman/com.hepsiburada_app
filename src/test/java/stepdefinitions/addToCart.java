package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import pages.Hepsiburada;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static utilities.ReusableMethods.scrollToFindElement;

public class addToCart {

    Hepsiburada hepsiburada = new Hepsiburada();
    TouchAction touchAction;


    @Given("Click the TAMAM button")
    public void click_the_tamam_button() {
        ReusableMethods.bekle(1);
        hepsiburada.okButton.click();
    }
    @Given("Exit the hesabim page")
    public void go_to_home_page() {
        hepsiburada.hesabimPageExit.click();
    }
    @Then("Go to Search Box")
    public void goToSearchBox() {
        hepsiburada.searchBox.click();

    }
    @Then("Enter the {string} in search box")
    public void enterTheBisikletInSearchBox(String search) {
        hepsiburada.searchBox.sendKeys(search);
        hepsiburada.searchElement.click();

    }
    @Given("Click the Sirala button and choose a category")
    public void click_the_sirala_button_and_choose_a_category() {
        ReusableMethods.bekle(1);
        hepsiburada.siralaButton.click();
        hepsiburada.cokSatanlarText.click();
        hepsiburada.uygulaButton.click();
    }
    @Given("Click the filtrele buttonand choose a category")
    public void click_the_filtrele_buttonand_choose_a_category() {
        ReusableMethods.bekle(1);
        hepsiburada.filtreButton.click();
        ReusableMethods.bekle(1);
        hepsiburada.markaButton.click();
        ReusableMethods.bekle(1);
        hepsiburada.markaCheckbox.click();
        ReusableMethods.bekle(1);
        hepsiburada.uygulaButton.click();
        ReusableMethods.bekle(1);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1618))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 600))
                .release()
                .perform();
        hepsiburada.vitesFiltre.click();
        ReusableMethods.bekle(1);
        hepsiburada.vitesCheckbox.click();
        ReusableMethods.bekle(1);
        hepsiburada.uygulaButton.click();
        hepsiburada.urunleriGorButton.click();
    }
    @Given("Choose a bicycle")
    public void choose_a_android_device() throws MalformedURLException {
        ReusableMethods.bekle(3);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1718))
                .waitAction(waitOptions(Duration.ofMillis(1100)))
                .moveTo(PointOption.point(293, 600))
                .release()
                .perform();

        ReusableMethods.bekle(1);
        hepsiburada.sepeteEkle.click();
        ReusableMethods.bekle(1);
        hepsiburada.sepeteGit.click();
        ReusableMethods.bekle(1);
        hepsiburada.alisverisiTamamlaButton.click();
    }
}
