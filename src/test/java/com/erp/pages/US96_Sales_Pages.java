package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US96_Sales_Pages {

    public US96_Sales_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public static WebElement inputUsername;

    @FindBy(name = "password")
    public static WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public static WebElement loginButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public static WebElement salesButton;

    //public List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//th[@class='o_column_sortable']"));
    @FindBy(xpath = "//th[contains(@class,'o_column_sortable')]")
    public List<WebElement>columns;

    public List<String> columnsText(){
        List<String>texts=new ArrayList<>();

        for (WebElement each : columns) {
            texts.add(each.getText());
        }
        return texts;
    }

    @FindBy(xpath = "//span[@class ='oe_topbar_name']")
    public static WebElement managerUsername;


}
