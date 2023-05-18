package au.com.carsguide.browserfactory.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUsedCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewUsedCarPage.class.getName());

    public NewUsedCarPage(){

        PageFactory.initElements(driver,this);
    }



    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake ;

    @CacheLookup
    @FindBy(id ="models")
    WebElement selectModel;

    @CacheLookup
    @FindBy(id="locations")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(id ="priceTo")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement clickFindNextCar;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultText;

    public void selectCarMake(String make){
        log.info("Select car make :" +selectMake.toString());
        selectByVisibleTextFromDropDown(selectMake,make);
    }
    public void selectCarModel(String model){
        log.info("Select Car Model " + selectModel.toString());
        selectByVisibleTextFromDropDown(selectModel,model);
    }
    public void selectLocationFromDropDown(String location){
        log.info("Select location form drop down :" + selectLocation.toString());
        selectByVisibleTextFromDropDown(selectLocation,location);
    }
    public void selectPriceFromDropDown(String price){
        log.info("Select price from dropdown :" + selectPrice.toString());
        selectByVisibleTextFromDropDown(selectPrice,price);
    }
    public void clickOnFindNextCar(){
        log.info("Click on find next Car :" + clickFindNextCar.toString());
        clickOnElement(clickFindNextCar);
    }
    public void verifyTheResult(String expected){

        log.info("Verify the result :" + resultText.toString());
        String actualMessage = getTextFromElement(resultText);
        String expectedText = expected;
    }

}
