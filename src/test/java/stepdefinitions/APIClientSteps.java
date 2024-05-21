package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import api.APIClient;

import java.io.IOException;

public class APIClientSteps {

    private HttpResponse response;

    @Given("I have a GET request")
    public void i_have_a_GET_request() throws IOException {
        response = APIClient.sendGetRequest();
    }

    @Given("I have a POST request")
    public void i_have_a_POST_request() throws IOException {
        response = APIClient.sendPostRequest();
    }

    @Given("I have a PUT request")
    public void i_have_a_PUT_request() throws IOException {
        response = APIClient.sendPutRequest();
    }

    @Given("I have a PATCH request")
    public void i_have_a_PATCH_request() throws IOException {
        response = APIClient.sendPatchRequest();
    }

    @Given("I have a DELETE request")
    public void i_have_a_DELETE_request() throws IOException {
        response = APIClient.sendDeleteRequest();
    }

    @When("I send the request")
    public void i_send_the_request() {
        // No action needed here since request was already sent in Given step
    }

    @Then("I should receive a {int} status code")
    public void i_should_receive_a_status_code(int expectedStatusCode) {
        int statusCode = response.getStatusLine().getStatusCode();
        Assert.assertEquals(expectedStatusCode, statusCode);
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String expectedContent) throws IOException {
        String responseBody = EntityUtils.toString(response.getEntity());
        Assert.assertTrue(responseBody.contains(expectedContent));
        System.out.println("Response Content:");
        System.out.println(responseBody);
    }

}
