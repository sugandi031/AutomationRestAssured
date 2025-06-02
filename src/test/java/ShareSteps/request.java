package ShareSteps;

import Helper.readPropertiesFile;
import Helper.yamlHelper;
import Helper.path;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class request {
    Map<String, Object> fullDataYamlAuth;
    Response response;
    @Given("User already have valid data {string}")
    public void userAlreadyHaveValidDataAuth_userYaml(String fileYaml) {
        fullDataYamlAuth = yamlHelper.loadYaml(fileYaml);
        System.out.println(fullDataYamlAuth.toString());
    }

    @When("User hit request POST to {string} and path {string}")
    public void userHitRequestPOST(String url, String pathData) {
        Map<String, Object> headers = yamlHelper.getYamlData("headers", fullDataYamlAuth);
        Map<String, Object> body = yamlHelper.getYamlData("body", fullDataYamlAuth);
        String authPath = path.getPath(pathData);
        String authBaseURL = readPropertiesFile.getProperties(url);
        response = given().headers(headers).body(body).post(authBaseURL + authPath);
        System.out.println(response.getBody().asPrettyString());
    }
}
