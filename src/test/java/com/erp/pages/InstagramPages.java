package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InstagramPages {

    public InstagramPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(name = "username")
public static WebElement instausername;

    @FindBy(name = "password")
    public static WebElement instapassword;

    @FindBy( xpath = "//button[@type='submit']")
    public static WebElement instaloginButton;

    public static List<WebElement> followers = Driver.getDriver().findElements(By.xpath("//class[@role='button']"));


    @FindBy(xpath = "//class[@button='button']")
    public static WebElement followers2;



}
