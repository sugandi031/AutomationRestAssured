package StepDefinitions;

import Helper.yamlHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class auth {


    @Then("User successfully get bearer token")
    public void userSuccessfullyGetBearerToken() {
    }
}
