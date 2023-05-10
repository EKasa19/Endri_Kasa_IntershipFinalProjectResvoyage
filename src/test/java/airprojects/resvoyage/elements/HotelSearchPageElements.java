package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HotelSearchPageElements {

    public HotelSearchPageElements(){PageFactory.initElements(BaseInformation.getDriver(), this);}

    @FindBy(css = "#city")
    public WebElement checkInLocation;
    @FindBy(css = "#return_date")
    public WebElement checkOutDatePicker;
    @FindBy(css = "td[data-event='click'] a")
    public List<WebElement> listOfAllAvailableDates;
    @FindBy(css = "#Rooms")
    public WebElement numOfRoomsDropDown;
    @FindBy(css = "#adult-counter_1")
    public WebElement room1AdultCountDropdown;
    @FindBy(css = "#adult-counter_2")
    public WebElement room2AdultCountDropdown;
    @FindBy(css = "#child-counter_1")
    public WebElement room1ChildCountDropdown;
    @FindBy(css = "#child-counter_2")
    public WebElement room2ChildCountDropdown;
    @FindBy(css = "#childage_1_Room2")
    public WebElement child1AgeDropdown;
    @FindBy(css = "#childage_2_Room2")
    public WebElement child2AgeDropdown;
    @FindBy(css = "#submitBTN")
    public WebElement searchBtn;

}
