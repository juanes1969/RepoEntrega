package co.com.bancolombia.certificacion.retoCliente.stepdefinitions;

import co.com.bancolombia.certificacion.retoCliente.models.DataUser;
import co.com.bancolombia.certificacion.retoCliente.questions.ValidationFourt;
import co.com.bancolombia.certificacion.retoCliente.tasks.DataContactUser;
import co.com.bancolombia.certificacion.retoCliente.tasks.DataMissingUser;
import co.com.bancolombia.certificacion.retoCliente.tasks.DataPersonalUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.bancolombia.certificacion.retoCliente.utils.Urls.urlUtest;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class RegisterUserStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) is in the uTest page$")
    public void juanIsInTheUTestPage(String name) throws Exception {
        OnStage.theActorCalled(name).wasAbleTo(Open.url(urlUtest));
    }


    @When("^he fill in the data$")
    public void heFillInTheData(List<DataUser> listData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(DataPersonalUser.inFields(listData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(DataContactUser.inTheFields(listData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(DataMissingUser.inTheFields(listData.get(0)));
    }

    @Then("^you can see (.*)$")
    public void youCanSee4(String message) throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidationFourt.number(), is(equalTo(message))));
    }
}
