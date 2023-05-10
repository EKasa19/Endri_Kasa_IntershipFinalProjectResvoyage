package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPageElements {
    public LandingPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }
    @FindBy(id ="OneWay")
    public WebElement oneWaySelect;
    @FindBy(id = "RoundTrip")
    public WebElement roundTripSelect;
    @FindBy(id = "MultiDestination")
    public WebElement multiDestinationSelect;
    @FindBy(id = "departure_city")
    public WebElement selectDepartureCity;
    @FindBy(id = "destination_city")
    public WebElement selectDestinationCity;
    @FindBy(id = "departure_date")
    public WebElement selectDepartureDate;
    @FindBy(css = ".ui-datepicker-next span")
    public WebElement nextMonthButton;
    @FindBy(css = "td[data-event='click'] a")
    public List<WebElement> listOfAllAvailableDates;
    @FindBy(id = "return_date")
    public WebElement selectReturnDate;
    @FindBy(id = "pref_class")
    public WebElement selectCabinPreference;
    @FindBy(id = "submitBTN")
    public WebElement submitBTN;
    @FindBy(css = "select[id='adult-counter']")
    public WebElement adultCount;
    @FindBy(css = "select[id='child-counter']")
    public WebElement childCount;
    @FindBy(css = "select[id='infant-counter']")
    public WebElement infantCount;
    @FindBy(css = ".errorMsg")
    public WebElement errorMsgCheck;

    @FindBy(css = "#departure_city_0")
    public WebElement firstDepartureCityMultiFlight;
    @FindBy(css = "#destination_city_0")
    public WebElement firstDestinationCityMultiFlight;
    @FindBy(css = "#departure_date_0")
    public WebElement firstDepartureDateMultiFlight;
    @FindBy(id = "addLeg_0")
    public WebElement addSecondFlightPlusButton;
    @FindBy(css = "#departure_city_1")
    public WebElement secondDepartureCityMultiFlight;
    @FindBy(css = "#destination_city_1")
    public WebElement secondDestinationCityMultiFlight;
    @FindBy(css = "#departure_date_1")
    public WebElement secondDepartureDateMultiFlight;
    @FindBy(id = "addLeg_1")
    public WebElement addThirdFlightPlusButton;
    @FindBy(css = "#departure_city_2")
    public WebElement thirdDepartureCityMultiFlight;
    @FindBy(css = "#destination_city_2")
    public WebElement thirdDestinationCityMultiFlight;
    @FindBy(css = "#departure_date_2")
    public WebElement thirdDepartureDateMultiFlight;



    @FindBy(css = ".accordion .dropdown.icon")
    public WebElement advancedOptionsDropdownIcon;
    @FindBy(id = "non_stop_flights")
    public WebElement dropDownSelectFlightType;
    @FindBy(id = "pref_airline")
    public WebElement prefAirlineInput;



}
