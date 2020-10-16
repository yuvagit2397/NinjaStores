package stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.FileReadMan;
import testRunner.TestRun;

public class Login {
	public static WebDriver driver=TestRun.driver;

@Given("user clicks laptop link")
public void user_clicks_laptop_link() {
   
}

@When("set the price order")
public void set_the_price_order() {
}

@Then("add high price lap in cart")
public void add_high_price_lap_in_cart() {
}

@Given("user opens mp3 list")
public void user_opens_mp3_list() {
}

@When("getting list with price")
public void getting_list_with_price() {
}

@Then("add {string} to the cart")
public void add_to_the_cart(String string) {
}

	

}
