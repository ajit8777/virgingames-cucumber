package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Allow all cookies']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Join Now']")
    WebElement joinNowTab;

    @CacheLookup
    @FindBy(linkText = "Online Slots")
    WebElement onlineSlotsTab;





    public String getTitle(){
        return driver.getTitle();
    }

    public void clickOnNecessaryCookiesOnly(){
        clickOnElement(cookies);
    }

    public void clickOnJoinNowTab(){
        clickOnElement(joinNowTab);
    }

    public void clickOnOnlineSlotsTab(){
        clickOnElement(onlineSlotsTab);
    }


}
