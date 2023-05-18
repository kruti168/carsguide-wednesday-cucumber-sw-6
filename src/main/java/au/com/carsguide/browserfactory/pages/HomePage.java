package au.com.carsguide.browserfactory.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buySellMenuTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Used']")
    WebElement usedLink;


    public void mouseHoverOnBuySell(){
        Reporter.log("Mouse hover on Buy and sell" +buySellMenuTab.toString());
        mouseHoverToElement(buySellMenuTab);
        log.info("Mouse hover on Buy and Sell" + buySellMenuTab.toString());

    }
    public void mouseHoverAndClickOnSearchCars(){
        Reporter.log("Mouse  hover and click on search cars" +searchCars.toString());
        mouseHoverToElementAndClick(searchCars);
        log.info("Mouse hover and click on search cars" +searchCars.toString());
    }
    public void clickOnUsedLink(){
        log.info("Click on Used link :" + usedLink.toString());
        mouseHoverToElementAndClick(usedLink);
    }


}
