package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelSelectPageElements {

    public HotelSelectPageElements(){PageFactory.initElements(BaseInformation.getDriver(), this);}

    @FindBy(css = "#SortDropDown")
    public WebElement sortHotelResultsDropDown;
    // value 7 is for highest first
    @FindBy(css = ".value")
    public List<WebElement> listHotelPricesPerNight;
    @FindBy(css = "#SelectBtn")
    public List<WebElement> listHotelSelectButton;
    @FindBy(css = ".waitScreen")
    public WebElement loadingScreen;
}
