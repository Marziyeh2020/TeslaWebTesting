package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class CommercialEnergySteps {
    DialogContent dc=new DialogContent();
    @And("Clicking function control on the Tesla")
    public void clickingFunctionControlOnTheTesla(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));

    }

    @And("Verification function checking in the Tesla")
    public void verificationFunctionCheckingInTheTesla(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @And("Sending function checking in the Tesla")
    public void sendingFunctionCheckingInTheTesla(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
