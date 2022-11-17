package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='menu-header-item__title--waikiki']")
    private WebElement assertPage;

    @FindBy(xpath = "//span[text()='Menu']")
    private WebElement menuBtn;

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

            case "eMail":
               // myElement = eMail;
                break;



        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "menuBtn": myElement = menuBtn;break;
            case "insuranceBtn": myElement = insuranceBtn;break;
            case "getTeslaApp": myElement = getTeslaApp;break;
            case "gPlayStore": myElement = gPlayStore;break;
            case "aAppStore": myElement = aAppStore;break;

        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

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
