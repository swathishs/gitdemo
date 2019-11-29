package stepdefination;

import Testcase.Login;
import Testcase.PDP;
import Testcase.PLP;
import Testcase.cart;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {
		
	@Given("^A browser session with the website$")
	public void a_browser_session_with_the_website() throws Exception {
		Login.Url();

	}

	@When("^the user clicks on signin button$")
	public void the_user_clicks_on_signin_button() throws Exception {
		Login.signin();

	}

	@Then("^login page is displayed$")
	public void login_page_is_displayed() {
		Login.loginpage();

	}

	@When("^the user clicks on google$")
	public void the_user_clicks_on_google() {
		Login.google();

	}

	@Then("^Google login is displayed$")
	public void google_login_is_displayed() {
		Login.googlesigin();

	}

	@When("^user enter email address$")
	public void user_enter_email_address() {
		Login.email();

	}

	@And("^clicks on next button$")
	public void clicks_on_next_button() {
		Login.next();

	}

	@Then("^password page is displayed$")
	public void password_page_is_displayed() {
		Login.passpage();

	}
	@When("^user enter password$")
	public void user_enter_password(){
		Login.pass();
	}


	@When("^user select the make from Make dropdown$")
	public void user_select_the_make_from_Make_dropdown() throws Exception {
		PLP.make();

	}
	@Then("^the selection should be in displayed in make dropdown$")
	public void the_selection_should_be_in_displayed_in_make_dropdown() throws Exception {
		PLP.selection();

	}



	@When("^user select the model from model dropdown$")
	public void user_select_the_model_from_model_dropdown() throws Exception {
		PLP.model();

	}
	@Then("^the selection should be in displayed in model dropdown$")
	public void the_selection_should_be_in_displayed_in_model_dropdown() throws Exception {
		PLP.selection1();

	}
	@When("^user select the Year from Year dropdown$")
	public void user_select_the_Year_from_Year_dropdown() throws Exception {

		PLP.year();
	}

	@Then("^the selection should be in displayed in Select Year dropdown$")
	public void the_selection_should_be_in_displayed_in_Select_Year_dropdown() throws Exception {
		PLP.selection2();

	}



	@And("^clicks on Go button$")
	public void clicks_on_Go_button() throws Exception {

		PLP.GO();
	}

	@Then("^PlP is displayed$")
	public void plp_is_displayed() throws Exception {

		PLP.plppage();
	}

	@When("^user select instock from stock filter$")
	public void user_select_instock_from_stock_filter() throws Exception {
		PLP.filter();

	}

	@Then("^Instock product is dispalyed$")
	public void instock_product_is_dispalyed() throws Exception {
		PLP.instock();

	}

	@When("^user click on product$")
	public void user_click_on_product() throws Exception {

		PLP.product();
	}

	@Then("^PDP is displayed$")
	public void pdp_is_displayed() {

	PDP.pdppage();
	}

	@When("^user enter the quantity$")
	public void user_enter_the_quantity() throws Exception {
		PDP.qunatity();

	}
	@When("^user clicks on fuel management product menu$")
	public void user_clicks_on_fuel_management_product_menu() throws Exception  {
	   PDP.fuel();
	}

	@Then("^CLP should be displayed$")
	public void clp_should_be_displayed()  {
	 PDP.clppage();
	}

	@When("^user clicks on power commander shop now$")
	public void user_clicks_on_power_commander_shop_now() throws Exception  {
	    PDP.clp();
	}

	@Then("^the Generic PDP should be displayed$")
	public void the_Generic_PDP_should_be_displayed() throws Exception {
	    PDP.genericpage();
	}

	@When("^Click the Select a vehicle button$")
	public void click_the_Select_a_vehicle_button() throws Throwable {
	   PDP.select();
	}

	@Then("^the pop-up should be displayed$")
	public void the_pop_up_should_be_displayed() throws Exception {
	    PDP.popup();
	}

	@When("^clicks on add to cart button$")
	public void clicks_on_add_to_cart_button() throws Exception {

		PDP.add();
	}

	@Then("^product should be added to cart and mini cart should be displayed$")
	public void product_should_be_added_to_cart_and_mini_cart_should_be_displayed() throws Exception {
		PDP.mini();

	}
	@And("^clicks on the Go button$")
	public void clicks_on_the_Go_button() {

		PDP.goes();
	}


	@When("^user click on minicart$")
	public void user_click_on_minicart() {

		cart.minicart();
	}

	@Then("^minicart is displayed$")
	public void minicart_is_displayed() throws Exception {
		PDP.mini();

	}

	@When("^user clicks the View Cart button$")
	public void user_clicks_the_View_Cart_button() throws Exception {
		cart.viewcart();

	}

	@Then("^Cart Page should be displayed$")
	public void cart_Page_should_be_displayed() {

		cart.cartpage();
	}
	
	@When ("^user update the qty$")
	public void user_update_the_qty() throws Exception{
		cart.qty();
	}
	@And ("^clicks on update shopping cart$")
	public void clicks_on_update_shopping_cart() throws Exception{
		cart.update();
	}
	@Then("^Qty is updated$")
	public void qty_is_updated() throws Exception {
		
		cart.qtyup();
	}

	@When("^user clicks on proceed to checkout button$")
	public void user_clicks_on_proceed_to_checkout_button() throws Exception {

		cart.proceed();
	}

	@Then("^checkout page is displayed$")
	public void checkout_page_is_displayed() {

		cart.checkout();
	}
}