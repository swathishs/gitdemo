$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/smoke.feature");
formatter.feature({
  "line": 1,
  "name": "SmokeSuite",
  "description": "",
  "id": "smokesuite",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 17,
  "name": "Navigation to PLP using MMY select",
  "description": "",
  "id": "smokesuite;navigation-to-plp-using-mmy-select",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user select the make from Make dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the selection should be in displayed in make dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user select the model from model dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the selection should be in displayed in model dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user select the Year from Year dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the selection should be in displayed in Select Year dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "clicks on Go button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "PlP is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 1380423424,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_select_the_make_from_Make_dropdown()"
});
formatter.result({
  "duration": 23220540430,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_make_dropdown()"
});
formatter.result({
  "duration": 1062024838,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_select_the_model_from_model_dropdown()"
});
formatter.result({
  "duration": 1465850859,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_model_dropdown()"
});
formatter.result({
  "duration": 1055224215,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_select_the_Year_from_Year_dropdown()"
});
formatter.result({
  "duration": 1248277101,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_Select_Year_dropdown()"
});
formatter.result({
  "duration": 1049802191,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.clicks_on_Go_button()"
});
formatter.result({
  "duration": 2626455576,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.plp_is_displayed()"
});
formatter.result({
  "duration": 2068885644,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Navigating to PDP from PLP",
  "description": "",
  "id": "smokesuite;navigating-to-pdp-from-plp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user select instock from stock filter",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Instock product is dispalyed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user click on product",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "PDP is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 18950025,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_select_instock_from_stock_filter()"
});
formatter.result({
  "duration": 3292117957,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.instock_product_is_dispalyed()"
});
formatter.result({
  "duration": 2210180640,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_product()"
});
formatter.result({
  "duration": 3351981824,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.pdp_is_displayed()"
});
formatter.result({
  "duration": 443357064,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Adding product from PDP",
  "description": "",
  "id": "smokesuite;adding-product-from-pdp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user enter the quantity",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "clicks on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "product should be added to cart and mini cart should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 214412544,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_enter_the_quantity()"
});
formatter.result({
  "duration": 12854926101,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.clicks_on_add_to_cart_button()"
});
formatter.result({
  "duration": 3419586373,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.product_should_be_added_to_cart_and_mini_cart_should_be_displayed()"
});
formatter.result({
  "duration": 1061366563,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Validation of Add to cart from Generic PDP",
  "description": "",
  "id": "smokesuite;validation-of-add-to-cart-from-generic-pdp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "user clicks on fuel management product menu",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "CLP should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user clicks on power commander shop now",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "the Generic PDP should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Click the Select a vehicle button",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "the pop-up should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "user select the make from Make dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "the selection should be in displayed in make dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "user select the model from model dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "the selection should be in displayed in model dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "user select the Year from Year dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "the selection should be in displayed in Select Year dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "clicks on the Go button",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user enter the quantity",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "clicks on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "product should be added to cart and mini cart should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 6991435,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_fuel_management_product_menu()"
});
formatter.result({
  "duration": 9395191464,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.clp_should_be_displayed()"
});
formatter.result({
  "duration": 7093138,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_power_commander_shop_now()"
});
formatter.result({
  "duration": 1061057253,
  "error_message": "java.lang.IllegalArgumentException: bound must be greater than origin\r\n\tat java.util.concurrent.ThreadLocalRandom.nextInt(ThreadLocalRandom.java:378)\r\n\tat Testcase.PDP.clp(PDP.java:201)\r\n\tat stepdefination.stepdefination.user_clicks_on_power_commander_shop_now(stepdefination.java:157)\r\n\tat ✽.When user clicks on power commander shop now(src/test/java/feature/smoke.feature:50)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepdefination.the_Generic_PDP_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.click_the_Select_a_vehicle_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.the_pop_up_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_select_the_make_from_Make_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_make_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_select_the_model_from_model_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_model_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_select_the_Year_from_Year_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.the_selection_should_be_in_displayed_in_Select_Year_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.clicks_on_the_Go_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.user_enter_the_quantity()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.clicks_on_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefination.product_should_be_added_to_cart_and_mini_cart_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 66,
  "name": "Validation of Cart page",
  "description": "",
  "id": "smokesuite;validation-of-cart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 68,
  "name": "A browser session with the website",
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "user click on minicart",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "minicart is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user clicks the View Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 72,
  "name": "Cart Page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "user update the qty",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "clicks on update shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Qty is updated",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "user clicks on proceed to checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "checkout page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.a_browser_session_with_the_website()"
});
formatter.result({
  "duration": 6930319,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_minicart()"
});
formatter.result({
  "duration": 29116371041,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.minicart_is_displayed()"
});
formatter.result({
  "duration": 1067347958,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_the_View_Cart_button()"
});
formatter.result({
  "duration": 5040953963,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.cart_Page_should_be_displayed()"
});
formatter.result({
  "duration": 367513576,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_update_the_qty()"
});
formatter.result({
  "duration": 2085329465,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.clicks_on_update_shopping_cart()"
});
formatter.result({
  "duration": 31429956426,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.qty_is_updated()"
});
formatter.result({
  "duration": 1079971355,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_proceed_to_checkout_button()"
});
formatter.result({
  "duration": 6173212719,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.checkout_page_is_displayed()"
});
formatter.result({
  "duration": 354478232,
  "status": "passed"
});
});