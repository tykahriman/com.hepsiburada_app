package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.Hepsiburada;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class payment {

    Hepsiburada hepsiburada = new Hepsiburada();
    Actions actions = new Actions(Driver.getAppiumDriver());
    TouchAction touchAction;

    @Given("Enter payment information")
    public void enter_payment_information() {
        ReusableMethods.bekle(7);
        touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(293, 1418))
                .waitAction(waitOptions(Duration.ofMillis(1300)))
                .moveTo(PointOption.point(293, 600))
                .release()
                .perform();
        ReusableMethods.bekle(1);
        hepsiburada.kartNumarasi.click();
        actions.sendKeys("4242424242424242").perform();
        ReusableMethods.bekle(1);
        hepsiburada.kartUzerindekiIsim.click();
        actions.sendKeys("Taha Yasin").perform();
        ReusableMethods.bekle(1);
        hepsiburada.sonKullanmaTarihi.sendKeys("0225");
        ReusableMethods.bekle(1);
        hepsiburada.guvenlikKodu.sendKeys("254");
    }
    @Given("Confirm the order")
    public void confirm_the_order() {
        hepsiburada.siparisiOnaylaButton.click();
    }

}
