package com.virgingames.steps;

import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OnlineSlotsSteps {
    @Then("I verify text {string}")
    public void iVerifyTextPlayOnlineSlotsAtVirginGames(String text) {
        Assert.assertEquals(new OnlineSlotsPage().getTextOfPlayOnlineSlotsAtVirginGames(), text);
    }
}
