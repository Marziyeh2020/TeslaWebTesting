package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class NavigatToTeslaSteps {
    @Given("Open website go to home page")
    public void openWebsiteGoToHomePage() {
      GWD.getDriver().get("https://www.tesla.com/");
        GWD.getDriver().manage().window().maximize();
    }
}
