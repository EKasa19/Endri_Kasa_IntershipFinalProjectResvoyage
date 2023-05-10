package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.HotelSearchPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSearchPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    HotelSearchPageElements hotelSearchPageElements = new HotelSearchPageElements();
    public HotelSearchPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}

    public void getUrl(String url){BaseInformation.getDriver().get(url);}

    public void selectHotelLocation(String hotelCity){
        System.out.println("User selects hotel location");
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(20000,hotelSearchPageElements.checkInLocation);
        hotelSearchPageElements.checkInLocation.click();
        hotelSearchPageElements.checkInLocation.sendKeys(hotelCity);
        hotelSearchPageElements.checkInLocation.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
    }
    public void selectDateOfCheckOut(int date){
        System.out.println("User selects checkout date");
        basePageObject.getWaitUtils().waitForElementVisible(hotelSearchPageElements.checkOutDatePicker);
        hotelSearchPageElements.checkOutDatePicker.click();
        hotelSearchPageElements.listOfAllAvailableDates.get(date).click();
    }
    public void selectNumberOfRooms(int i){
        System.out.println("User selects number of rooms");
        selectDropdownByVisibleText(hotelSearchPageElements.numOfRoomsDropDown,i);
    }
    public void selectNumberOfPersonsRoom1(int adults,int child){
        System.out.println("User selects number of adults an children in room 1");
        selectDropdownByVisibleText(hotelSearchPageElements.room1AdultCountDropdown,adults);
        selectDropdownByVisibleText(hotelSearchPageElements.room1ChildCountDropdown,child);
    }
    public void selectNumberOfPersonsRoom2(int adults,int child){
        selectDropdownByVisibleText(hotelSearchPageElements.room2AdultCountDropdown,adults);
        selectDropdownByVisibleText(hotelSearchPageElements.room2ChildCountDropdown,child);
    }
    public void childAgeRoom2(int ch1Age, int ch2Age){
        selectDropdownByVisibleText(hotelSearchPageElements.child1AgeDropdown,ch1Age);
        selectDropdownByVisibleText(hotelSearchPageElements.child2AgeDropdown,ch2Age);
    }
    public void clickSearchButton(){
        System.out.println("User start searching for hotels bt clicking on search button ");
        basePageObject.getWaitUtils().waitForElementVisible(hotelSearchPageElements.searchBtn);
        basePageObject.getWebElementUtils().scrollToElement(hotelSearchPageElements.searchBtn);
        hotelSearchPageElements.searchBtn.click();
    }

    void selectDropdownByVisibleText(WebElement dropdown,int value){
        basePageObject.getWaitUtils().waitForElementVisible(dropdown);
        basePageObject.getWebElementUtils().scrollToElement(dropdown);
        dropdown.click();
        Select dropDown = new Select(dropdown);
        String selectOption;
        selectOption = String.valueOf(value);
        dropDown.selectByVisibleText(selectOption);
    }
}
