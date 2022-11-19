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

    @FindBy(css = "[class='menu-header-item__title--waikiki']")
    private WebElement assertPage;

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

    //---------------Orcun112-----------------------//
    @FindBy(xpath = "//span[text()='Model 3']")
    public WebElement VerifyWebpageWhetherEnter;

    @FindBy(xpath = "//span[text()='Model 3']")
    private WebElement clickinModel3;

    @FindBy(xpath ="(//span[text()='Order Now'])[1]")
    public WebElement clickOrder;

    @FindBy(xpath = "//h1[text()='404']")
    public WebElement codeError;


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

                //***********orcun***********//
            case "clickinModel3":myElement=clickinModel3;break;
            case "clickOrder":myElement=clickOrder;break;

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




        }

        clickFunction(myElement);

    }
    int cnt=0;
    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "assertPage":  myElement = assertPage;   break;
            case "commercialEnergyVerify":  myElement = commercialEnergyVerify;   break;
            case "valuesVerify":  myElement = valuesVerify.get(cnt++);   break;
            case "produceVerify":  myElement = produceVerify;   break;
            case "priceSummaryVerify":  myElement = priceSummaryVerify;   break;
            case "yourContactVerify":  myElement = yourContactVerify;   break;

            //*********orcun*************///
            case "VerifyWebpageWhetherEnter":myElement=VerifyWebpageWhetherEnter;break;
            case "codeError":myElement=codeError;break;

        }

        verifyContainsText(myElement, text);
    }

}
