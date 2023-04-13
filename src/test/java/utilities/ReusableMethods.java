package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

public class ReusableMethods {


    public static void bekle(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollDown() {
        Dimension size = Driver.getAppiumDriver().manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        TouchAction action = new TouchAction(Driver.getAppiumDriver());
        action.press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    // Locate'i kontrol etmek ve varsa true döndürmek için kullanılan metot
    public static boolean isElementPresent(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    // Belirli bir locate'i bulmak için sayfayı kaydırmak için kullanılan metot
    public static void scrollToFindElement(MobileElement element) {
        boolean isElementFound = false;
        while (!isElementFound) {
            if (isElementPresent(element)) {
                isElementFound = true;
                break;
            } else {
                scrollDown();
            }
        }
    }


    public static void clickOnPage(String pageName) throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        List<MobileElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
        for (MobileElement page: pages) {
            if (page.getText().equals(pageName)){
                page.click();
                break; // sayfayi buldugunda looptan cikmasi icin
            }else{
                scrollWithUiScrollable(pageName);
                break;
            }
        }
    }

    //ikinci alternatif bir method
    public static void clickOnPage1(String pageName) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+pageName+"']");
        if (pages.size()>0){
            pages.get(0).click();
        }else scrollWithUiScrollable(pageName);
    }



    public static void scrollWithUiScrollable(String elementText) throws MalformedURLException {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains("+elementText+").instance(0))");
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+elementText+"))");
        driver.findElementByXPath("//*[@text='"+elementText+"']").click();
    }

    public static void longPressOnElement(MobileElement mobileElement) throws MalformedURLException {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(mobileElement)).release().perform();
    }

    public static void clickOnPageIOS(String text) throws MalformedURLException {
        List<MobileElement> pages = Driver.getAppiumDriver().findElementsByXPath("//XCUIElementTypeStaticText[@name='"+text+"']");
        if (pages.get(0).isDisplayed()){
            pages.get(0).click();
        }else{
            scrollAndClickOnIOS(text);
        }


    }

    public static void scrollAndClickOnIOS(String text) throws MalformedURLException {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("value",text);
        Driver.getAppiumDriver().executeScript("mobile: scroll", scrollObject);

        Driver.getAppiumDriver().findElementByXPath("//XCUIElementTypeStaticText[@name='"+text+"']").click();
    }


}
