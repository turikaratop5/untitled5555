package com.erp.step_definitions;

import com.erp.pages.US96_Sales_Pages;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US96_SalesColumns_StepDefinitions {

    US96_Sales_Pages salesManager = new US96_Sales_Pages();
    @When("user is logged Sales manager or Pos manager")
    public void userIsLoggedSalesManagerOrPosManager() {
        Driver.getDriver().get("https://qa.finasystems.net/");
        salesManager.inputUsername.sendKeys("posmanager20@info.com");
        salesManager.inputPassword.sendKeys("posmanager");
        salesManager.loginButton.click();
    }

    @When("user clicks to Sales tab")
    public void user_clicks_to_sales_tab() {
        salesManager.salesButton.click();
    }
    @Then("Manager should see below quotations")
    public void seeBelowColumnsInTheQuotations(List<String>expectedColumns) {

        Assert.assertEquals(expectedColumns,salesManager.columnsText());

        System.out.println("expectedColumns = " + expectedColumns);
        System.out.println("salesManager = " + salesManager.columnsText());

    }


    @Then("Check login name appears on the top right corner")
    public void check_login_name_appears_on_the_top_right_corner() {
        String actualName= salesManager.managerUsername.getText();
        String expectedName= "POSManager20";

        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);

        Assert.assertEquals(actualName,expectedName);
    }

}
