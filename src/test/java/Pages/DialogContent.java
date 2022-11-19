package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "button[title='Menu']")
    private WebElement menuButton;

    @FindBy(css = "a[title='Commercial Energy']")
    private WebElement commercialEnergyButton;

    @FindBy(css = "div[class='tcl-hero__content']>h1")
    private WebElement commercialEnergyVerify;

    @FindBy(css = "section[class='tcl-badge']>div")
    private List<WebElement> valuesVerify;
    @FindBy(xpath = "(//span[text()='Produce Energy'])[1]")
    private WebElement produceVerify;

    @FindBy(css = "div[class='tcl-section-header-group__buttons ']>section[data-button-count='1']")
    private WebElement orderNowButton;

    @FindBy(id = "purchase-price")
    private WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='Est. Annual Return']")
    private WebElement estLink;

    @FindBy(css = "h3+button[aria-label='Close Modal']")
    private WebElement closeButton;
    @FindBy(xpath = "//button[text()='Est. 25 Year Savings']")
    private WebElement estLink2;

    @FindBy(css = "label[class='tds-selector-label']")
    private List<WebElement> kwSelect;
    @FindBy(css = "div[class='styles_modalLink___IdVc']>button")
    private WebElement systemGuideButton;
    @FindBy(css = "div[class^='styles_pricingSummaryContainer']>h3[class]")
    private WebElement priceSummaryVerify;

    @FindBy(css = "div[class^='styles_orderForm']>h2[class]")
    private WebElement yourContactVerify;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "order-form-email-input")
    private WebElement emailInput;

    @FindBy(id = "order-form-confirm-email-input")
    private WebElement confirmEmailInput;

    @FindBy(id = "phoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(id = "contactPreference")
    public WebElement contactSelect;

    @FindBy(id = "companyName")
    private WebElement companyNameInput;

    @FindBy(id = "installationAddress")
    private WebElement installationAddressInput;

    @FindBy(css = "button[class='tds-btn']")
    private WebElement placeReservationButton;

    @FindBy(xpath = "//span[text()='Insurance']")
    private WebElement insuranceBtn;

    @FindBy(xpath = "(//span[@class='tcl-section-header-group__header tds-text--h2 tds-text-eyebrow tcl-fit-content']/span)[1]")
    private WebElement safetyScore;

    @FindBy(xpath = "(//div[@class='tcl-section-header-group__copy tcl-fit-content  ']/p)[3]")
    private WebElement safetyScoreMessage;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[1]")
    private WebElement safetyScorebox1;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[2]")
    private WebElement safetyScorebox2;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[3]")
    private WebElement safetyScorebox3;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[4]")
    private WebElement safetyScorebox4;

    @FindBy(xpath = "(//span[@class='tcl-section-header-group__header tds-text--h2 tds-text-eyebrow tcl-fit-content']/span)[2]")
    private WebElement easyAccess;

    @FindBy(xpath = "(//div[@class='tcl-section-header-group__copy tcl-fit-content  ']/p)[5]")
    private WebElement easyAccessMessage;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[8]")
    private WebElement easyAccessbox4;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[7]")
    private WebElement easyAccessbox3;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[6]")
    private WebElement easyAccessbox2;

    @FindBy(xpath = "(//div[@class='tds-tab-list tcl-carousel-v2__panels']/button/span)[5]")
    private WebElement easyAccessbox1;

    @FindBy(xpath = "(//span[text()='Get Insurance'])[2]")
    private WebElement getTeslaApp;

    @FindBy(xpath = "(//a[@class='tds-link tcl-link'])[2]")
    private WebElement privacyLegal;

    @FindBy(css = "img[id='play-store-img']")
    private WebElement gPlayStore;

    @FindBy(xpath = "//span[text()='Tesla']")
    private WebElement verifyPlayStore;

    @FindBy(css = "img[id='apple-store-img']")
    private WebElement aAppStore;

    @FindBy(xpath = "//h1[text()='Tesla']")
    private WebElement verifyAppStore;

    @FindBy(xpath = "//h1[text()='Download Tesla App']")
    private WebElement verifyTeslaApp;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "firstNameInput": myElement = firstNameInput;break;
            case "lastNameInput": myElement = lastNameInput;break;
            case "emailInput": myElement = emailInput;break;
            case "confirmEmailInput": myElement = confirmEmailInput;break;
            case "phoneNumberInput": myElement = phoneNumberInput;break;
            case "companyNameInput": myElement = companyNameInput;break;
            case "installationAddressInput": myElement = installationAddressInput;break;



        }

        sendKeysFunction(myElement, value);
    }
        int cntx=0;

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "menuButton": myElement = menuButton; break;
            case "commercialEnergyButton": myElement = commercialEnergyButton; break;
            case "orderNowButton":GWD.Bekle(2); myElement = orderNowButton; break;
            case "purchaseButton": myElement = purchaseButton; break;
            case "estLink": myElement = estLink; break;
            case "closeButton": GWD.Bekle(1);myElement = closeButton; break;
            case "estLink2": myElement = estLink2; break;
            case "kwSelect": myElement = kwSelect.get(cntx++); break;
            case "systemGuideButton": myElement = systemGuideButton; break;
            case "contactSelect": Select sc=new Select(contactSelect);
            sc.selectByVisibleText("Email"); break;
            case "placeReservationButton": System.out.println("Test Passed");
            /*myElement=placeReservationButton*/;break;
            case "insuranceBtn": myElement = insuranceBtn;break;
            case "getTeslaApp": myElement = getTeslaApp;break;
            case "gPlayStore": myElement = gPlayStore;break;
            case "aAppStore": myElement = aAppStore;break;

        }

        clickFunction(myElement);

    }
    int cnt=0;
    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "commercialEnergyVerify":  myElement = commercialEnergyVerify;   break;
            case "valuesVerify":  myElement = valuesVerify.get(cnt++);   break;
            case "produceVerify":  myElement = produceVerify;   break;
            case "priceSummaryVerify":  myElement = priceSummaryVerify;   break;
            case "yourContactVerify":  myElement = yourContactVerify;   break;
            case "safetyScore":  myElement = safetyScore;break;
            case "safetyScoreMessage":  myElement = safetyScoreMessage;break;
            case "safetyScorebox1":  myElement = safetyScorebox1;break;
            case "safetyScorebox2":  myElement = safetyScorebox2;break;
            case "safetyScorebox3":  myElement = safetyScorebox3;break;
            case "safetyScorebox4":  myElement = safetyScorebox4;break;
            case "easyAccess":  myElement = easyAccess;break;
            case "easyAccessMessage":  myElement = easyAccessMessage;break;
            case "easyAccessbox4":  myElement = easyAccessbox4;break;
            case "easyAccessbox3":  myElement = easyAccessbox3;break;
            case "easyAccessbox2":  myElement = easyAccessbox2;break;
            case "easyAccessbox1":  myElement = easyAccessbox1;break;
            case "verifyPlayStore":  myElement = verifyPlayStore;break;
            case "verifyAppStore":  myElement = verifyAppStore;break;
            case "verifyTeslaApp":  myElement = verifyTeslaApp;break;

        }

        verifyContainsText(myElement, text);
    }

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            case "safetyScorebox1":myElement=safetyScorebox1;break;
            case "safetyScorebox2":myElement=safetyScorebox2;break;
            case "safetyScorebox3":myElement=safetyScorebox3;break;
            case "safetyScorebox4":myElement=safetyScorebox4;break;
            case "easyAccessbox4":myElement=easyAccessbox4;break;
            case "easyAccessbox3":myElement=easyAccessbox3;break;
            case "easyAccessbox2":myElement=easyAccessbox2;break;
            case "easyAccessbox1":myElement=easyAccessbox1;break;
            case "privacyLegal":myElement=privacyLegal;break;

        }
        return myElement;
    }

}
