package stepDefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.Uttils;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef extends Uttils{
	
	RequestSpecification res; 
	ResponseSpecification responsespec; 
	Response response;
		

	                            @Given("baseurl token and jsonbody")
	                            public void baseurl_token_and_jsonbody() {
	                               
	                                  RestAssured.given().baseUri("https://reqres.in/");
	                            }

	                            @When("post transaction invoice AE to PH")
	                            public void post_transaction_invoice_AE_to_PH() {
	                                
	                               RestAssured.when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	                            }

	                            @Then("transaction should be created successfully")
	                            public void transaction_should_be_created_successfully() {
	                              
	                             
	                            }




}