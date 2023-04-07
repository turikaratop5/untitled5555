package com.erp.step_definitions;

import com.erp.pages.InstagramPages;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Instagramturi_StepDefinitions {


    InstagramPages instagramTuri = new InstagramPages();
    @Given("user is on the instagram page")
    public void user_is_on_the_instagram_page() {
        Driver.getDriver().get("https://www.instagram.com/");
    }
    @Given("user should logged in instagram")
    public void user_should_logged_in_instagram() throws InterruptedException {
        Driver.getDriver().get("https://www.instagram.com/");
        instagramTuri.instausername.sendKeys("basketball5555555555");
        instagramTuri.instapassword.sendKeys("34Fb1907");
        Thread.sleep(3000);
        instagramTuri.instaloginButton.click();
        Thread.sleep(3000);

    }
    @Then("user go to profile")
    public void user_go_to_profile() throws InterruptedException {
        Driver.getDriver().get("https://www.instagram.com/zulos_mutfagi/followers/");
        Thread.sleep(3000);
    }
    @Then("I click on the coordinates at x: {int} and y: {int}")
    public void iClickOnTheCoordinatesAtXAndY(int x, int y) throws InterruptedException {
        Driver.getDriver().get("https://www.instagram.com/zulos_mutfagi/followers/");
        Thread.sleep(3000);



    }
    @Then("user should watch all the stories")
    public void user_should_watch_all_the_stories() {

    }



}
