package com.erp.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    /* This class will be storing only the utility methods that can be used across the project.
     */

    public static void sleep(WebElement calendarButton, int second){
        second *=1000;

        try{
            Thread.sleep(second);
        } catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains((expectedInTitle)));


    }
    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }

    public static void verifyTitleContains( String expectedInTitle){

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }

    public static void waitForInvisibilityOf(WebElement target){
        Duration timeoutDuration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeoutDuration);
        wait.until(ExpectedConditions.invisibilityOf(target));
    }


    public static void waitForTitleContains(String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title.toLowerCase()));
    }



    public static List<String> dropdownOptions_as_String(WebElement dropdownElement){


        Select month = new Select(dropdownElement);
        //Storing all the ACTUAL options into a List of WebElements
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();


        //Creating an EMPTY list of String to store ACTUAL<option> as String
        List<String> actualMonth_as_STRING= new ArrayList<>();


        //looping through the list <WebElement>, getting all options' texts, and stroing them into List
        for (WebElement each : actualMonth_as_WEBELEMENT) {
            actualMonth_as_STRING.add(each.getText());
        }

        return actualMonth_as_STRING;

    }



    public static void clickRadioElement(List<WebElement>radioButtons,String attributeValue){

        for (WebElement each : radioButtons) {
            if(each.getAttribute("value").equals(attributeValue)){
                each.click();
            }
        }
    }

    /**
     * Swithces to new window by the exact title. Returns to original window if target title not found
     * @param targetTitle
     */

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }


        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    }



