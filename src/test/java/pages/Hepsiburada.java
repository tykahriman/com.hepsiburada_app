package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Hepsiburada {

    public Hepsiburada() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Hesabım']")
    public MobileElement accountButton;

    @FindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/button'])[2]")
    public MobileElement loginButton;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement emailTextbox;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[1]")
    public MobileElement loginButton2;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public MobileElement passwordTextbox;

    @FindBy(xpath = "//*[@text='TAMAM']")
    public MobileElement okButton;


    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Hesabım ekranını kapat']")
    public MobileElement hesabimPageExit;
    @FindBy(id = "com.pozitron.hepsiburada:id/etSearchBox")
    public MobileElement searchBox;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement searchElement;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Kategorilerim']")
    public MobileElement categoryButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='insideMenuItem1-2']/androidx.cardview.widget.CardView/android.widget.ImageView")
    public MobileElement androidPhone;

    @FindBy(id = "com.pozitron.hepsiburada:id/txtOptionBarSort")
    public MobileElement siralaButton;

    @FindBy(xpath = "//*[@text='Çok satanlar']")
    public MobileElement cokSatanlarText;

    @FindBy(xpath = "//*[@text='Uygula']")
    public MobileElement uygulaButton;

    @FindBy(id = "com.pozitron.hepsiburada:id/lytOptionBarFilters")
    public MobileElement filtreButton;

    @FindBy(xpath = "//*[@text='Marka']")
    public MobileElement markaButton;

    @FindBy(xpath = "//*[@text='Kron']")
    public MobileElement markaCheckbox;
    @FindBy(xpath = "//*[@text='Vites']")
    public MobileElement vitesFiltre;

    @FindBy(xpath = "//*[@text='24 Vites']")
    public MobileElement vitesCheckbox;

    @FindBy(id = "com.pozitron.hepsiburada:id/btn_filters_main_close")
    public MobileElement urunleriGorButton;

    @FindBy(xpath = "(//*[@text='Sepete ekle'])[1]")
    public MobileElement sepeteEkle;

    @FindBy(xpath = "//*[@text='Sepetim']")
    public MobileElement sepeteGit;

    @FindBy(xpath = "//*[@text='Alışverişi tamamla']")
    public MobileElement alisverisiTamamlaButton;

    @FindBy(xpath = "//*[@text='Yeni adres ekle']")
    public MobileElement yeniAdresEkle;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement kartNumarasi;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement kartUzerindekiIsim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sonKullanmaTarihi;

    @FindBy(xpath = "//*[@text='Siparişi onayla']")
    public MobileElement siparisiOnaylaButton;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement guvenlikKodu;












}
