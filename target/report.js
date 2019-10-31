$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add Customer validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user need to click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_need_to_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "feild validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@karthi"
    }
  ]
});
formatter.step({
  "name": "user need to fill all the feilds",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_need_to_fill_all_the_feilds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});