package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.tasks.Login;
import com.co.qvision.userinterfaces.BonoPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BonoStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){


        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Sergio");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
   /* @Given("^user needs to login$")
    public void userNeedsToLogin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/?utm_source=google&utm_medium=cpc&utm_campaign=Bonbonite_Google_Search_Brand&utm_term=%7Bkeywords%3A%7D&utm_content=ad_text_marca&gclid=Cj0KCQjw39uYBhCLARIsAD_SzMQWAEfU3kZyuIwGm8_icPApQzqJkrTT7gCv-S-uQPZAUnHR_R0OT1QaAoz4EALw_wcB"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("^user enter data$")
    public void userEnterData(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("^login successfull$")
    public void loginSuccessfull() {

    }*/
    @Given("^He user in page$")
    public void heUserInPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/?utm_source=google&utm_medium=cpc&utm_campaign=Bonbonite_Google_Search_Brand&utm_term=%7Bkeywords%3A%7D&utm_content=ad_text_marca&gclid=Cj0KCQjw39uYBhCLARIsAD_SzMQWAEfU3kZyuIwGm8_icPApQzqJkrTT7gCv-S-uQPZAUnHR_R0OT1QaAoz4EALw_wcB"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^goes to the section$")
    public void goesToTheSection() {

    }

    @When("^buying a bonus$")
    public void buyingABonus() {

    }
    }

