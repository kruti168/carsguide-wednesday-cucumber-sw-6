package au.com.carsguide.browserfactory.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindDealPage extends Utility {
private static final Logger log = LogManager.getLogger(FindDealPage.class.getName());

public FindDealPage(){

    PageFactory.initElements(driver,this);
}

    @CacheLookup
    @FindBy (linkText = "Find a Dealer")
    WebElement findADealer;


    public void clickOnFindADealer(){
        log.info("Click on find dealer link :" + findADealer.toString());
        mouseHoverToElementAndClick(findADealer);
    }
}
