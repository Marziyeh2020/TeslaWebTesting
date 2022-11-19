package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class InsuranceAndTeslaAppTestSteps {

    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("Go to Insurance page")
    public void goToInsurancePage() {
        dc.findAndClick("menuButton");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("dialog[aria-hidden='false']")));
        dc.findAndClick("insuranceBtn");
    }

    @When("Verify that you are on the Insurance page")
    public void verifyThatYouAreOnTheInsurancePage() {
        String siteURL= GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(siteURL.contains("insurance"));
    }

    @And("Check that the Safety Score on the page is working")
    public void checkThatTheSafetyScoreOnThePageIsWorking() {
        dc.findAndContainsText("safetyScore","Safety Score");
        dc.findAndContainsText("safetyScoreMessage","Track your driving behavior to control your monthly rate.*");


        dc.findAndContainsText("safetyScorebox4","Your Data");
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("safetyScorebox4"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='tablist'][style='--tds-animate-backdrop-transition:0.5s cubic-bezier(0.75,0,0,1); --tds-animate-backdrop-opacity:1; --tds-animate-backdrop-visibility: inherit; --tds-animate-backdrop-top:0px; --tds-animate-backdrop-left:228px; --tds-animate-backdrop-height:146px; --tds-animate-backdrop-width:204px;']")));
        dc.getMyElement("safetyScorebox4").click();


        dc.findAndContainsText("safetyScorebox3","Your Score");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("safetyScorebox3"));
        dc.getMyElement("safetyScorebox3").click();


        dc.findAndContainsText("safetyScorebox2","Your Premium");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("safetyScorebox2"));
        dc.getMyElement("safetyScorebox2").click();


        dc.findAndContainsText("safetyScorebox1","Your Driving");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("safetyScorebox1"));
        dc.getMyElement("safetyScorebox1").click();
    }

    @And("Check that the Easy Access on the page is working")
    public void checkThatTheEasyAccessOnThePageIsWorking() {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccess"));

        dc.findAndContainsText("easyAccess","Easy Access");
        dc.findAndContainsText("easyAccessMessage","Purchase and manage your policy, monitor your Safety Score");


        dc.findAndContainsText("easyAccessbox4","File");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccessbox4"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='tablist'][style='--tds-animate-backdrop-transition:0.5s cubic-bezier(0.75,0,0,1); --tds-animate-backdrop-opacity:1; --tds-animate-backdrop-visibility: inherit; --tds-animate-backdrop-top:0px; --tds-animate-backdrop-left:228px; --tds-animate-backdrop-height:166px; --tds-animate-backdrop-width:204px;']")));
        dc.getMyElement("easyAccessbox4").click();


        dc.findAndContainsText("easyAccessbox3","Analyze");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccessbox3"));
        dc.getMyElement("easyAccessbox3").click();


        dc.findAndContainsText("easyAccessbox2","Manage");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccessbox2"));
        dc.getMyElement("easyAccessbox2").click();


        dc.findAndContainsText("easyAccessbox1","Purchase");
        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccessbox1"));
        dc.getMyElement("easyAccessbox1").click();
    }

    @Given("Click Get Insurance and go to the page")
    public void clickGetInsuranceAndGoToThePage() {
        JavascriptExecutor js= (JavascriptExecutor)GWD.getDriver();
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,2));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("safetyScorebox4"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='tablist'][style='--tds-animate-backdrop-transition:0.5s cubic-bezier(0.75,0,0,1); --tds-animate-backdrop-opacity:1; --tds-animate-backdrop-visibility: inherit; --tds-animate-backdrop-top:0px; --tds-animate-backdrop-left:228px; --tds-animate-backdrop-height:146px; --tds-animate-backdrop-width:204px;']")));

        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,3));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("easyAccessbox4"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role='tablist'][style='--tds-animate-backdrop-transition:0.5s cubic-bezier(0.75,0,0,1); --tds-animate-backdrop-opacity:1; --tds-animate-backdrop-visibility: inherit; --tds-animate-backdrop-top:0px; --tds-animate-backdrop-left:228px; --tds-animate-backdrop-height:166px; --tds-animate-backdrop-width:204px;']")));

        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,8));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("getTeslaApp"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[class='tds-link tcl-link']")));

        scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/1,3));";
        js.executeScript(scrollElementIntoMiddle, dc.getMyElement("privacyLegal"));

    }

    String ownershipPage;
    String insurancePage;
    @And("Click on the Google Play Store and switch to the page")
    public void clickOnTheGooglePlayStoreAndSwitchToThePage() {
        insurancePage=GWD.getDriver().getWindowHandle();

        dc.findAndClick("getTeslaApp");

        Set<String> windowsIdler= GWD.getDriver().getWindowHandles();  // açık olan tüm sayfaların id lerini verir
        for (String id:windowsIdler) {
            if (id.equals(insurancePage))continue;

            GWD.getDriver().switchTo().window(id);
        }

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("img[id='play-store-img']")));
        ownershipPage= GWD.getDriver().getWindowHandle();
        String TeslaAppURL= GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(TeslaAppURL.contains("ownership.tesla.com"));

        dc.findAndClick("gPlayStore");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Tesla']")));
    }

    @And("Verify that the app is on Google Play and return to the home page")
    public void verifyThatTheAppIsOnGooglePlayAndReturnToTheHomePage() {
        dc.findAndContainsText("verifyPlayStore","Tesla");
        GWD.getDriver().switchTo().window(insurancePage);
        dc.findAndClick("getTeslaApp");

        Set<String> windowsIdler= GWD.getDriver().getWindowHandles();
        for (String id:windowsIdler) {
            if (id.equals(insurancePage))continue;
            if (id.equals(ownershipPage))continue;

            GWD.getDriver().switchTo().window(id);
        }
    }

    @And("Click on the Apple App Store and switch to the page")
    public void clickOnTheAppleAppStoreAndSwitchToThePage() {
        dc.findAndClick("aAppStore");
    }

    @And("Verify that the app is on Apple Store and return to the home page")
    public void verifyThatTheAppIsOnAppleStoreAndReturnToTheHomePage() {
        dc.findAndContainsText("verifyAppStore","Tesla");
    }

    @Then("Close open pages")
    public void closeOpenPages() {
        GWD.quitDriver();
    }
}
