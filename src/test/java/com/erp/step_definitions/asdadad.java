package com.erp.step_definitions;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class asdadad {
    public static void main(String[] args) throws InterruptedException {

        Driver.getDriver().get("https://www.instagram.com/");

        Thread.sleep(3000);

        // enter the username and password
        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys("basketball5555555555");
        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys("34Fb1907");

        // login
        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        Thread.sleep(3000);

        // open the desired profile
        Driver.getDriver().get("https://www.instagram.com/eslinustun/followers/");

        Thread.sleep(3000);

        // get the list of followers
        List<WebElement> followers =Driver.getDriver().findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div[35]/div/div/div/div[1]/div/div/div/div"));

        // loop through all followers
        for (WebElement follower : followers) {
            Thread.sleep(5000);
            // open the profile of the follower
            follower.click();

            Driver.getDriver().navigate().back();
        }


    }


}
