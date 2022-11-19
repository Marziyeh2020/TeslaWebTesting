package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckTheFunctionalities {

    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Find and click, find and send")
    public void findAndClickFindAndSend() {
        wait.until(ExpectedConditions.visibilityOf(dc.VerifyWebpageWhetherEnter));
        dc.findAndClick("clickinModel3");
        wait.until(ExpectedConditions.elementToBeClickable(dc.clickOrder));
        dc.findAndClick("clickOrder");

    }
    @Then("Validate the scenario in terms of issue")
    public void validateTheScenarioInTermsOfissue() {
        wait.until(ExpectedConditions.visibilityOf(dc.codeError));
        Assert.assertTrue(dc.codeError.getText().contains("404"));
        System.out.println("WebSite Error is correct / The Test has been Past");
        GWD.Bekle(5);


    }
}
