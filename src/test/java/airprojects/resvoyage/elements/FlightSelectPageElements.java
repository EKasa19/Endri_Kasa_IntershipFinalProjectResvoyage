package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightSelectPageElements {


    public FlightSelectPageElements(){PageFactory.initElements(BaseInformation.getDriver(), this);}
    @FindBy(className = "ff-price-padding")
    public List<WebElement> flightSelectButtonList;
    @FindBy(id = "modifySearchControl")
    public WebElement modifySearchButton;
    @FindBy(css = "div.non-mobile-ff button.red")
    public List<WebElement> flightBookNowButtonList;
    @FindBy(css = "div.fareExtendMatrix button.red")
    public List<WebElement> multiFlightBookNowButtonList;
    @FindBy(css = ".flg-image")
    public List<WebElement> flightAirlineFlagImg;
    @FindBy(css = ".waitScreen")
    public WebElement loadingScreen;
}
